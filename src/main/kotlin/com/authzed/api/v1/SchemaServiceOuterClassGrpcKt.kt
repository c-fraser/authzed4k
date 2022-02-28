package com.authzed.api.v1

import com.authzed.api.v1.SchemaServiceGrpc.getServiceDescriptor
import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for authzed.api.v1.SchemaService.
 */
object SchemaServiceGrpcKt {
  const val SERVICE_NAME: String = SchemaServiceGrpc.SERVICE_NAME

  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = SchemaServiceGrpc.getServiceDescriptor()

  val readSchemaMethod: MethodDescriptor<SchemaServiceOuterClass.ReadSchemaRequest,
      SchemaServiceOuterClass.ReadSchemaResponse>
    @JvmStatic
    get() = SchemaServiceGrpc.getReadSchemaMethod()

  val writeSchemaMethod: MethodDescriptor<SchemaServiceOuterClass.WriteSchemaRequest,
      SchemaServiceOuterClass.WriteSchemaResponse>
    @JvmStatic
    get() = SchemaServiceGrpc.getWriteSchemaMethod()

  /**
   * A stub for issuing RPCs to a(n) authzed.api.v1.SchemaService service as suspending coroutines.
   */
  @StubFor(SchemaServiceGrpc::class)
  class SchemaServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<SchemaServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): SchemaServiceCoroutineStub =
        SchemaServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun readSchema(request: SchemaServiceOuterClass.ReadSchemaRequest, headers: Metadata =
        Metadata()): SchemaServiceOuterClass.ReadSchemaResponse = unaryRpc(
      channel,
      SchemaServiceGrpc.getReadSchemaMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun writeSchema(request: SchemaServiceOuterClass.WriteSchemaRequest, headers: Metadata =
        Metadata()): SchemaServiceOuterClass.WriteSchemaResponse = unaryRpc(
      channel,
      SchemaServiceGrpc.getWriteSchemaMethod(),
      request,
      callOptions,
      headers
    )}

  /**
   * Skeletal implementation of the authzed.api.v1.SchemaService service based on Kotlin coroutines.
   */
  abstract class SchemaServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for authzed.api.v1.SchemaService.ReadSchema.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun readSchema(request: SchemaServiceOuterClass.ReadSchemaRequest):
        SchemaServiceOuterClass.ReadSchemaResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method authzed.api.v1.SchemaService.ReadSchema is unimplemented"))

    /**
     * Returns the response to an RPC for authzed.api.v1.SchemaService.WriteSchema.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun writeSchema(request: SchemaServiceOuterClass.WriteSchemaRequest):
        SchemaServiceOuterClass.WriteSchemaResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method authzed.api.v1.SchemaService.WriteSchema is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SchemaServiceGrpc.getReadSchemaMethod(),
      implementation = ::readSchema
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SchemaServiceGrpc.getWriteSchemaMethod(),
      implementation = ::writeSchema
    )).build()
  }
}
