/*
Copyright 2022 c-fraser

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    https://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.github.cfraser.authzed4k

import com.authzed.api.v1.Core.RelationshipUpdate.Operation
import com.authzed.api.v1.PermissionService.CheckPermissionResponse.Permissionship
import com.authzed.api.v1.PermissionsServiceGrpcKt.PermissionsServiceCoroutineStub
import com.authzed.api.v1.SchemaServiceGrpcKt.SchemaServiceCoroutineStub
import com.authzed.api.v1.checkPermissionRequest
import com.authzed.api.v1.consistency
import com.authzed.api.v1.objectReference
import com.authzed.api.v1.readSchemaRequest
import com.authzed.api.v1.relationship
import com.authzed.api.v1.relationshipUpdate
import com.authzed.api.v1.subjectReference
import com.authzed.api.v1.writeRelationshipsRequest
import com.authzed.api.v1.writeSchemaRequest
import com.authzed.api.v1.zedToken
import io.grpc.ManagedChannelBuilder
import kotlin.random.Random
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue
import kotlinx.coroutines.runBlocking

class AuthzedApiV1Test {

  @Test
  fun testV1Api() = runBlocking {
    val channel = ManagedChannelBuilder.forTarget("localhost:50051").usePlaintext().build()
    val token = "tc_test_token_${Random.nextInt(1000)}"
    val schemaService = SchemaServiceCoroutineStub(channel).withToken(token)
    val permissionsService = PermissionsServiceCoroutineStub(channel).withToken(token)

    val writeRequest = writeSchemaRequest {
      schema =
          """
          definition test/article {
            relation author: test/user
            relation commenter: test/user
            permission can_comment = commenter + author
          }
          definition test/user {}
          """.trimIndent()
    }
    schemaService.writeSchema(writeRequest)

    val readRequest = readSchemaRequest {}
    val readResponse = schemaService.readSchema(readRequest)
    assertTrue(readResponse.schemaText.indexOf("test/article") > 0)

    val relationshipsRequest = writeRelationshipsRequest {
      updates +=
          relationshipUpdate {
            operation = Operation.OPERATION_CREATE
            relationship =
                relationship {
                  resource =
                      objectReference {
                        objectType = "test/article"
                        objectId = "java_test"
                      }
                  relation = "author"
                  subject =
                      subjectReference {
                        object_ =
                            objectReference {
                              objectType = "test/user"
                              objectId = "george"
                            }
                      }
                }
          }
    }
    val relationshipsResponse = permissionsService.writeRelationships(relationshipsRequest)
    val writeToken = relationshipsResponse.writtenAt.token
    assertNotNull(writeToken)

    val zedToken = zedToken { this.token = writeToken }
    val permissionRequest = checkPermissionRequest {
      consistency = consistency { atLeastAsFresh = zedToken }
      resource =
          objectReference {
            objectType = "test/article"
            objectId = "java_test"
          }
      subject =
          subjectReference {
            object_ =
                objectReference {
                  objectType = "test/user"
                  objectId = "george"
                }
          }
      permission = "can_comment"
    }
    val permissionResponse = permissionsService.checkPermission(permissionRequest)
    assertEquals(Permissionship.PERMISSIONSHIP_HAS_PERMISSION, permissionResponse.permissionship)
  }
}
