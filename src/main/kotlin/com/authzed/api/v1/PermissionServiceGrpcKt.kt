package com.authzed.api.v1

import com.authzed.api.v1.PermissionsServiceGrpc.getServiceDescriptor
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
import io.grpc.kotlin.ClientCalls.serverStreamingRpc
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls
import io.grpc.kotlin.ServerCalls.serverStreamingServerMethodDefinition
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow

/**
 * Holder for Kotlin coroutine-based client and server APIs for authzed.api.v1.PermissionsService.
 */
object PermissionsServiceGrpcKt {
  const val SERVICE_NAME: String = PermissionsServiceGrpc.SERVICE_NAME

  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = PermissionsServiceGrpc.getServiceDescriptor()

  val readRelationshipsMethod: MethodDescriptor<PermissionService.ReadRelationshipsRequest,
      PermissionService.ReadRelationshipsResponse>
    @JvmStatic
    get() = PermissionsServiceGrpc.getReadRelationshipsMethod()

  val writeRelationshipsMethod: MethodDescriptor<PermissionService.WriteRelationshipsRequest,
      PermissionService.WriteRelationshipsResponse>
    @JvmStatic
    get() = PermissionsServiceGrpc.getWriteRelationshipsMethod()

  val deleteRelationshipsMethod: MethodDescriptor<PermissionService.DeleteRelationshipsRequest,
      PermissionService.DeleteRelationshipsResponse>
    @JvmStatic
    get() = PermissionsServiceGrpc.getDeleteRelationshipsMethod()

  val checkPermissionMethod: MethodDescriptor<PermissionService.CheckPermissionRequest,
      PermissionService.CheckPermissionResponse>
    @JvmStatic
    get() = PermissionsServiceGrpc.getCheckPermissionMethod()

  val expandPermissionTreeMethod: MethodDescriptor<PermissionService.ExpandPermissionTreeRequest,
      PermissionService.ExpandPermissionTreeResponse>
    @JvmStatic
    get() = PermissionsServiceGrpc.getExpandPermissionTreeMethod()

  val lookupResourcesMethod: MethodDescriptor<PermissionService.LookupResourcesRequest,
      PermissionService.LookupResourcesResponse>
    @JvmStatic
    get() = PermissionsServiceGrpc.getLookupResourcesMethod()

  /**
   * A stub for issuing RPCs to a(n) authzed.api.v1.PermissionsService service as suspending
   * coroutines.
   */
  @StubFor(PermissionsServiceGrpc::class)
  class PermissionsServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<PermissionsServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): PermissionsServiceCoroutineStub
        = PermissionsServiceCoroutineStub(channel, callOptions)

    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    fun readRelationships(request: PermissionService.ReadRelationshipsRequest, headers: Metadata =
        Metadata()): Flow<PermissionService.ReadRelationshipsResponse> = serverStreamingRpc(
      channel,
      PermissionsServiceGrpc.getReadRelationshipsMethod(),
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
    suspend fun writeRelationships(request: PermissionService.WriteRelationshipsRequest,
        headers: Metadata = Metadata()): PermissionService.WriteRelationshipsResponse = unaryRpc(
      channel,
      PermissionsServiceGrpc.getWriteRelationshipsMethod(),
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
    suspend fun deleteRelationships(request: PermissionService.DeleteRelationshipsRequest,
        headers: Metadata = Metadata()): PermissionService.DeleteRelationshipsResponse = unaryRpc(
      channel,
      PermissionsServiceGrpc.getDeleteRelationshipsMethod(),
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
    suspend fun checkPermission(request: PermissionService.CheckPermissionRequest, headers: Metadata
        = Metadata()): PermissionService.CheckPermissionResponse = unaryRpc(
      channel,
      PermissionsServiceGrpc.getCheckPermissionMethod(),
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
    suspend fun expandPermissionTree(request: PermissionService.ExpandPermissionTreeRequest,
        headers: Metadata = Metadata()): PermissionService.ExpandPermissionTreeResponse = unaryRpc(
      channel,
      PermissionsServiceGrpc.getExpandPermissionTreeMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    fun lookupResources(request: PermissionService.LookupResourcesRequest, headers: Metadata =
        Metadata()): Flow<PermissionService.LookupResourcesResponse> = serverStreamingRpc(
      channel,
      PermissionsServiceGrpc.getLookupResourcesMethod(),
      request,
      callOptions,
      headers
    )}

  /**
   * Skeletal implementation of the authzed.api.v1.PermissionsService service based on Kotlin
   * coroutines.
   */
  abstract class PermissionsServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns a [Flow] of responses to an RPC for
     * authzed.api.v1.PermissionsService.ReadRelationships.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status
     * `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open fun readRelationships(request: PermissionService.ReadRelationshipsRequest):
        Flow<PermissionService.ReadRelationshipsResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method authzed.api.v1.PermissionsService.ReadRelationships is unimplemented"))

    /**
     * Returns the response to an RPC for authzed.api.v1.PermissionsService.WriteRelationships.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun writeRelationships(request: PermissionService.WriteRelationshipsRequest):
        PermissionService.WriteRelationshipsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method authzed.api.v1.PermissionsService.WriteRelationships is unimplemented"))

    /**
     * Returns the response to an RPC for authzed.api.v1.PermissionsService.DeleteRelationships.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun deleteRelationships(request: PermissionService.DeleteRelationshipsRequest):
        PermissionService.DeleteRelationshipsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method authzed.api.v1.PermissionsService.DeleteRelationships is unimplemented"))

    /**
     * Returns the response to an RPC for authzed.api.v1.PermissionsService.CheckPermission.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun checkPermission(request: PermissionService.CheckPermissionRequest):
        PermissionService.CheckPermissionResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method authzed.api.v1.PermissionsService.CheckPermission is unimplemented"))

    /**
     * Returns the response to an RPC for authzed.api.v1.PermissionsService.ExpandPermissionTree.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun expandPermissionTree(request: PermissionService.ExpandPermissionTreeRequest):
        PermissionService.ExpandPermissionTreeResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method authzed.api.v1.PermissionsService.ExpandPermissionTree is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * authzed.api.v1.PermissionsService.LookupResources.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status
     * `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open fun lookupResources(request: PermissionService.LookupResourcesRequest):
        Flow<PermissionService.LookupResourcesResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method authzed.api.v1.PermissionsService.LookupResources is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = PermissionsServiceGrpc.getReadRelationshipsMethod(),
      implementation = ::readRelationships
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = PermissionsServiceGrpc.getWriteRelationshipsMethod(),
      implementation = ::writeRelationships
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = PermissionsServiceGrpc.getDeleteRelationshipsMethod(),
      implementation = ::deleteRelationships
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = PermissionsServiceGrpc.getCheckPermissionMethod(),
      implementation = ::checkPermission
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = PermissionsServiceGrpc.getExpandPermissionTreeMethod(),
      implementation = ::expandPermissionTree
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = PermissionsServiceGrpc.getLookupResourcesMethod(),
      implementation = ::lookupResources
    )).build()
  }
}
