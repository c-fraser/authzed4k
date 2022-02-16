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

import io.grpc.CallCredentials
import io.grpc.Metadata
import io.grpc.Status
import io.grpc.stub.AbstractStub
import java.util.concurrent.Executor

/**
 * Authorize requests from [T] with the [token].
 *
 * @param T the [AbstractStub] implementation
 * @param token the token to use to authenticate
 * @see [AbstractStub.withCallCredentials]
 */
fun <T : AbstractStub<T>> T.withToken(token: String): T =
    withCallCredentials(BearerTokenCallCredentials(token))

/** A [CallCredentials] implementation including the *token* as the authorization metadata. */
private class BearerTokenCallCredentials(token: String) : CallCredentials() {

  private val authorization = "Bearer $token"

  override fun applyRequestMetadata(
      requestInfo: RequestInfo,
      executor: Executor,
      applier: MetadataApplier
  ) {
    executor.execute {
      try {
        val metadata =
            Metadata().apply {
              put(Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER), authorization)
            }
        applier.apply(metadata)
      } catch (throwable: Throwable) {
        applier.fail(Status.UNAUTHENTICATED.withCause(throwable))
      }
    }
  }

  override fun thisUsesUnstableApi() {}
}
