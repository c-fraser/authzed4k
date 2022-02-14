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
import java.util.concurrent.Executor

/** A [CallCredentials] implementation using a *bearer token*. */
class BearerToken(token: String) : CallCredentials() {

  private val bearerToken = "Bearer $token"

  override fun applyRequestMetadata(
      requestInfo: RequestInfo,
      executor: Executor,
      applier: MetadataApplier
  ) {
    executor.execute {
      try {
        val metadata = Metadata().apply { put(METADATA_KEY, bearerToken) }
        applier.apply(metadata)
      } catch (throwable: Throwable) {
        applier.fail(Status.UNAUTHENTICATED.withCause(throwable))
      }
    }
  }

  override fun thisUsesUnstableApi() {}

  private companion object {

    val METADATA_KEY: Metadata.Key<String> =
        Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER)
  }
}
