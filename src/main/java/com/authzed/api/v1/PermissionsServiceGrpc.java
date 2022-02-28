package com.authzed.api.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * PermissionsService is used to perform permissions and relationship
 * operations.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.44.1)",
    comments = "Source: authzed/api/v1/permission_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PermissionsServiceGrpc {

  private PermissionsServiceGrpc() {}

  public static final String SERVICE_NAME = "authzed.api.v1.PermissionsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.authzed.api.v1.PermissionService.ReadRelationshipsRequest,
      com.authzed.api.v1.PermissionService.ReadRelationshipsResponse> getReadRelationshipsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadRelationships",
      requestType = com.authzed.api.v1.PermissionService.ReadRelationshipsRequest.class,
      responseType = com.authzed.api.v1.PermissionService.ReadRelationshipsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.authzed.api.v1.PermissionService.ReadRelationshipsRequest,
      com.authzed.api.v1.PermissionService.ReadRelationshipsResponse> getReadRelationshipsMethod() {
    io.grpc.MethodDescriptor<com.authzed.api.v1.PermissionService.ReadRelationshipsRequest, com.authzed.api.v1.PermissionService.ReadRelationshipsResponse> getReadRelationshipsMethod;
    if ((getReadRelationshipsMethod = PermissionsServiceGrpc.getReadRelationshipsMethod) == null) {
      synchronized (PermissionsServiceGrpc.class) {
        if ((getReadRelationshipsMethod = PermissionsServiceGrpc.getReadRelationshipsMethod) == null) {
          PermissionsServiceGrpc.getReadRelationshipsMethod = getReadRelationshipsMethod =
              io.grpc.MethodDescriptor.<com.authzed.api.v1.PermissionService.ReadRelationshipsRequest, com.authzed.api.v1.PermissionService.ReadRelationshipsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadRelationships"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.authzed.api.v1.PermissionService.ReadRelationshipsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.authzed.api.v1.PermissionService.ReadRelationshipsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PermissionsServiceMethodDescriptorSupplier("ReadRelationships"))
              .build();
        }
      }
    }
    return getReadRelationshipsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.authzed.api.v1.PermissionService.WriteRelationshipsRequest,
      com.authzed.api.v1.PermissionService.WriteRelationshipsResponse> getWriteRelationshipsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WriteRelationships",
      requestType = com.authzed.api.v1.PermissionService.WriteRelationshipsRequest.class,
      responseType = com.authzed.api.v1.PermissionService.WriteRelationshipsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.authzed.api.v1.PermissionService.WriteRelationshipsRequest,
      com.authzed.api.v1.PermissionService.WriteRelationshipsResponse> getWriteRelationshipsMethod() {
    io.grpc.MethodDescriptor<com.authzed.api.v1.PermissionService.WriteRelationshipsRequest, com.authzed.api.v1.PermissionService.WriteRelationshipsResponse> getWriteRelationshipsMethod;
    if ((getWriteRelationshipsMethod = PermissionsServiceGrpc.getWriteRelationshipsMethod) == null) {
      synchronized (PermissionsServiceGrpc.class) {
        if ((getWriteRelationshipsMethod = PermissionsServiceGrpc.getWriteRelationshipsMethod) == null) {
          PermissionsServiceGrpc.getWriteRelationshipsMethod = getWriteRelationshipsMethod =
              io.grpc.MethodDescriptor.<com.authzed.api.v1.PermissionService.WriteRelationshipsRequest, com.authzed.api.v1.PermissionService.WriteRelationshipsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WriteRelationships"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.authzed.api.v1.PermissionService.WriteRelationshipsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.authzed.api.v1.PermissionService.WriteRelationshipsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PermissionsServiceMethodDescriptorSupplier("WriteRelationships"))
              .build();
        }
      }
    }
    return getWriteRelationshipsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.authzed.api.v1.PermissionService.DeleteRelationshipsRequest,
      com.authzed.api.v1.PermissionService.DeleteRelationshipsResponse> getDeleteRelationshipsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRelationships",
      requestType = com.authzed.api.v1.PermissionService.DeleteRelationshipsRequest.class,
      responseType = com.authzed.api.v1.PermissionService.DeleteRelationshipsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.authzed.api.v1.PermissionService.DeleteRelationshipsRequest,
      com.authzed.api.v1.PermissionService.DeleteRelationshipsResponse> getDeleteRelationshipsMethod() {
    io.grpc.MethodDescriptor<com.authzed.api.v1.PermissionService.DeleteRelationshipsRequest, com.authzed.api.v1.PermissionService.DeleteRelationshipsResponse> getDeleteRelationshipsMethod;
    if ((getDeleteRelationshipsMethod = PermissionsServiceGrpc.getDeleteRelationshipsMethod) == null) {
      synchronized (PermissionsServiceGrpc.class) {
        if ((getDeleteRelationshipsMethod = PermissionsServiceGrpc.getDeleteRelationshipsMethod) == null) {
          PermissionsServiceGrpc.getDeleteRelationshipsMethod = getDeleteRelationshipsMethod =
              io.grpc.MethodDescriptor.<com.authzed.api.v1.PermissionService.DeleteRelationshipsRequest, com.authzed.api.v1.PermissionService.DeleteRelationshipsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRelationships"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.authzed.api.v1.PermissionService.DeleteRelationshipsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.authzed.api.v1.PermissionService.DeleteRelationshipsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PermissionsServiceMethodDescriptorSupplier("DeleteRelationships"))
              .build();
        }
      }
    }
    return getDeleteRelationshipsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.authzed.api.v1.PermissionService.CheckPermissionRequest,
      com.authzed.api.v1.PermissionService.CheckPermissionResponse> getCheckPermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckPermission",
      requestType = com.authzed.api.v1.PermissionService.CheckPermissionRequest.class,
      responseType = com.authzed.api.v1.PermissionService.CheckPermissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.authzed.api.v1.PermissionService.CheckPermissionRequest,
      com.authzed.api.v1.PermissionService.CheckPermissionResponse> getCheckPermissionMethod() {
    io.grpc.MethodDescriptor<com.authzed.api.v1.PermissionService.CheckPermissionRequest, com.authzed.api.v1.PermissionService.CheckPermissionResponse> getCheckPermissionMethod;
    if ((getCheckPermissionMethod = PermissionsServiceGrpc.getCheckPermissionMethod) == null) {
      synchronized (PermissionsServiceGrpc.class) {
        if ((getCheckPermissionMethod = PermissionsServiceGrpc.getCheckPermissionMethod) == null) {
          PermissionsServiceGrpc.getCheckPermissionMethod = getCheckPermissionMethod =
              io.grpc.MethodDescriptor.<com.authzed.api.v1.PermissionService.CheckPermissionRequest, com.authzed.api.v1.PermissionService.CheckPermissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckPermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.authzed.api.v1.PermissionService.CheckPermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.authzed.api.v1.PermissionService.CheckPermissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PermissionsServiceMethodDescriptorSupplier("CheckPermission"))
              .build();
        }
      }
    }
    return getCheckPermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.authzed.api.v1.PermissionService.ExpandPermissionTreeRequest,
      com.authzed.api.v1.PermissionService.ExpandPermissionTreeResponse> getExpandPermissionTreeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExpandPermissionTree",
      requestType = com.authzed.api.v1.PermissionService.ExpandPermissionTreeRequest.class,
      responseType = com.authzed.api.v1.PermissionService.ExpandPermissionTreeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.authzed.api.v1.PermissionService.ExpandPermissionTreeRequest,
      com.authzed.api.v1.PermissionService.ExpandPermissionTreeResponse> getExpandPermissionTreeMethod() {
    io.grpc.MethodDescriptor<com.authzed.api.v1.PermissionService.ExpandPermissionTreeRequest, com.authzed.api.v1.PermissionService.ExpandPermissionTreeResponse> getExpandPermissionTreeMethod;
    if ((getExpandPermissionTreeMethod = PermissionsServiceGrpc.getExpandPermissionTreeMethod) == null) {
      synchronized (PermissionsServiceGrpc.class) {
        if ((getExpandPermissionTreeMethod = PermissionsServiceGrpc.getExpandPermissionTreeMethod) == null) {
          PermissionsServiceGrpc.getExpandPermissionTreeMethod = getExpandPermissionTreeMethod =
              io.grpc.MethodDescriptor.<com.authzed.api.v1.PermissionService.ExpandPermissionTreeRequest, com.authzed.api.v1.PermissionService.ExpandPermissionTreeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExpandPermissionTree"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.authzed.api.v1.PermissionService.ExpandPermissionTreeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.authzed.api.v1.PermissionService.ExpandPermissionTreeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PermissionsServiceMethodDescriptorSupplier("ExpandPermissionTree"))
              .build();
        }
      }
    }
    return getExpandPermissionTreeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.authzed.api.v1.PermissionService.LookupResourcesRequest,
      com.authzed.api.v1.PermissionService.LookupResourcesResponse> getLookupResourcesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LookupResources",
      requestType = com.authzed.api.v1.PermissionService.LookupResourcesRequest.class,
      responseType = com.authzed.api.v1.PermissionService.LookupResourcesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.authzed.api.v1.PermissionService.LookupResourcesRequest,
      com.authzed.api.v1.PermissionService.LookupResourcesResponse> getLookupResourcesMethod() {
    io.grpc.MethodDescriptor<com.authzed.api.v1.PermissionService.LookupResourcesRequest, com.authzed.api.v1.PermissionService.LookupResourcesResponse> getLookupResourcesMethod;
    if ((getLookupResourcesMethod = PermissionsServiceGrpc.getLookupResourcesMethod) == null) {
      synchronized (PermissionsServiceGrpc.class) {
        if ((getLookupResourcesMethod = PermissionsServiceGrpc.getLookupResourcesMethod) == null) {
          PermissionsServiceGrpc.getLookupResourcesMethod = getLookupResourcesMethod =
              io.grpc.MethodDescriptor.<com.authzed.api.v1.PermissionService.LookupResourcesRequest, com.authzed.api.v1.PermissionService.LookupResourcesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LookupResources"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.authzed.api.v1.PermissionService.LookupResourcesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.authzed.api.v1.PermissionService.LookupResourcesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PermissionsServiceMethodDescriptorSupplier("LookupResources"))
              .build();
        }
      }
    }
    return getLookupResourcesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PermissionsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PermissionsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PermissionsServiceStub>() {
        @java.lang.Override
        public PermissionsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PermissionsServiceStub(channel, callOptions);
        }
      };
    return PermissionsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PermissionsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PermissionsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PermissionsServiceBlockingStub>() {
        @java.lang.Override
        public PermissionsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PermissionsServiceBlockingStub(channel, callOptions);
        }
      };
    return PermissionsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PermissionsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PermissionsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PermissionsServiceFutureStub>() {
        @java.lang.Override
        public PermissionsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PermissionsServiceFutureStub(channel, callOptions);
        }
      };
    return PermissionsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * PermissionsService is used to perform permissions and relationship
   * operations.
   * </pre>
   */
  public static abstract class PermissionsServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * ReadRelationships reads a set of the relationships matching one or more
     * filters.
     * </pre>
     */
    public void readRelationships(com.authzed.api.v1.PermissionService.ReadRelationshipsRequest request,
        io.grpc.stub.StreamObserver<com.authzed.api.v1.PermissionService.ReadRelationshipsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadRelationshipsMethod(), responseObserver);
    }

    /**
     * <pre>
     * WriteRelationships writes and/or deletes a set of specified relationships,
     * with an optional set of precondition relationships that must exist before
     * the operation can commit.
     * </pre>
     */
    public void writeRelationships(com.authzed.api.v1.PermissionService.WriteRelationshipsRequest request,
        io.grpc.stub.StreamObserver<com.authzed.api.v1.PermissionService.WriteRelationshipsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWriteRelationshipsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteRelationships deletes relationships matching one or more filters, in
     * bulk.
     * </pre>
     */
    public void deleteRelationships(com.authzed.api.v1.PermissionService.DeleteRelationshipsRequest request,
        io.grpc.stub.StreamObserver<com.authzed.api.v1.PermissionService.DeleteRelationshipsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRelationshipsMethod(), responseObserver);
    }

    /**
     * <pre>
     * CheckPermission checks whether a subject has a particular permission or is
     * a member of a particular relation, on a given resource.
     * </pre>
     */
    public void checkPermission(com.authzed.api.v1.PermissionService.CheckPermissionRequest request,
        io.grpc.stub.StreamObserver<com.authzed.api.v1.PermissionService.CheckPermissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckPermissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * ExpandPermissionTree expands the relationships reachable from a particular
     * permission or relation of a given resource.
     * </pre>
     */
    public void expandPermissionTree(com.authzed.api.v1.PermissionService.ExpandPermissionTreeRequest request,
        io.grpc.stub.StreamObserver<com.authzed.api.v1.PermissionService.ExpandPermissionTreeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExpandPermissionTreeMethod(), responseObserver);
    }

    /**
     * <pre>
     * LookupResources returns the IDs of all resources on which the specified
     * subject has permission or on which the specified subject is a member of the
     * relation.
     * </pre>
     */
    public void lookupResources(com.authzed.api.v1.PermissionService.LookupResourcesRequest request,
        io.grpc.stub.StreamObserver<com.authzed.api.v1.PermissionService.LookupResourcesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLookupResourcesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReadRelationshipsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.authzed.api.v1.PermissionService.ReadRelationshipsRequest,
                com.authzed.api.v1.PermissionService.ReadRelationshipsResponse>(
                  this, METHODID_READ_RELATIONSHIPS)))
          .addMethod(
            getWriteRelationshipsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.authzed.api.v1.PermissionService.WriteRelationshipsRequest,
                com.authzed.api.v1.PermissionService.WriteRelationshipsResponse>(
                  this, METHODID_WRITE_RELATIONSHIPS)))
          .addMethod(
            getDeleteRelationshipsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.authzed.api.v1.PermissionService.DeleteRelationshipsRequest,
                com.authzed.api.v1.PermissionService.DeleteRelationshipsResponse>(
                  this, METHODID_DELETE_RELATIONSHIPS)))
          .addMethod(
            getCheckPermissionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.authzed.api.v1.PermissionService.CheckPermissionRequest,
                com.authzed.api.v1.PermissionService.CheckPermissionResponse>(
                  this, METHODID_CHECK_PERMISSION)))
          .addMethod(
            getExpandPermissionTreeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.authzed.api.v1.PermissionService.ExpandPermissionTreeRequest,
                com.authzed.api.v1.PermissionService.ExpandPermissionTreeResponse>(
                  this, METHODID_EXPAND_PERMISSION_TREE)))
          .addMethod(
            getLookupResourcesMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.authzed.api.v1.PermissionService.LookupResourcesRequest,
                com.authzed.api.v1.PermissionService.LookupResourcesResponse>(
                  this, METHODID_LOOKUP_RESOURCES)))
          .build();
    }
  }

  /**
   * <pre>
   * PermissionsService is used to perform permissions and relationship
   * operations.
   * </pre>
   */
  public static final class PermissionsServiceStub extends io.grpc.stub.AbstractAsyncStub<PermissionsServiceStub> {
    private PermissionsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PermissionsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PermissionsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * ReadRelationships reads a set of the relationships matching one or more
     * filters.
     * </pre>
     */
    public void readRelationships(com.authzed.api.v1.PermissionService.ReadRelationshipsRequest request,
        io.grpc.stub.StreamObserver<com.authzed.api.v1.PermissionService.ReadRelationshipsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getReadRelationshipsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WriteRelationships writes and/or deletes a set of specified relationships,
     * with an optional set of precondition relationships that must exist before
     * the operation can commit.
     * </pre>
     */
    public void writeRelationships(com.authzed.api.v1.PermissionService.WriteRelationshipsRequest request,
        io.grpc.stub.StreamObserver<com.authzed.api.v1.PermissionService.WriteRelationshipsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWriteRelationshipsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteRelationships deletes relationships matching one or more filters, in
     * bulk.
     * </pre>
     */
    public void deleteRelationships(com.authzed.api.v1.PermissionService.DeleteRelationshipsRequest request,
        io.grpc.stub.StreamObserver<com.authzed.api.v1.PermissionService.DeleteRelationshipsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRelationshipsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CheckPermission checks whether a subject has a particular permission or is
     * a member of a particular relation, on a given resource.
     * </pre>
     */
    public void checkPermission(com.authzed.api.v1.PermissionService.CheckPermissionRequest request,
        io.grpc.stub.StreamObserver<com.authzed.api.v1.PermissionService.CheckPermissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckPermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ExpandPermissionTree expands the relationships reachable from a particular
     * permission or relation of a given resource.
     * </pre>
     */
    public void expandPermissionTree(com.authzed.api.v1.PermissionService.ExpandPermissionTreeRequest request,
        io.grpc.stub.StreamObserver<com.authzed.api.v1.PermissionService.ExpandPermissionTreeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExpandPermissionTreeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LookupResources returns the IDs of all resources on which the specified
     * subject has permission or on which the specified subject is a member of the
     * relation.
     * </pre>
     */
    public void lookupResources(com.authzed.api.v1.PermissionService.LookupResourcesRequest request,
        io.grpc.stub.StreamObserver<com.authzed.api.v1.PermissionService.LookupResourcesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getLookupResourcesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * PermissionsService is used to perform permissions and relationship
   * operations.
   * </pre>
   */
  public static final class PermissionsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PermissionsServiceBlockingStub> {
    private PermissionsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PermissionsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PermissionsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * ReadRelationships reads a set of the relationships matching one or more
     * filters.
     * </pre>
     */
    public java.util.Iterator<com.authzed.api.v1.PermissionService.ReadRelationshipsResponse> readRelationships(
        com.authzed.api.v1.PermissionService.ReadRelationshipsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getReadRelationshipsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WriteRelationships writes and/or deletes a set of specified relationships,
     * with an optional set of precondition relationships that must exist before
     * the operation can commit.
     * </pre>
     */
    public com.authzed.api.v1.PermissionService.WriteRelationshipsResponse writeRelationships(com.authzed.api.v1.PermissionService.WriteRelationshipsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWriteRelationshipsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteRelationships deletes relationships matching one or more filters, in
     * bulk.
     * </pre>
     */
    public com.authzed.api.v1.PermissionService.DeleteRelationshipsResponse deleteRelationships(com.authzed.api.v1.PermissionService.DeleteRelationshipsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRelationshipsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CheckPermission checks whether a subject has a particular permission or is
     * a member of a particular relation, on a given resource.
     * </pre>
     */
    public com.authzed.api.v1.PermissionService.CheckPermissionResponse checkPermission(com.authzed.api.v1.PermissionService.CheckPermissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckPermissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ExpandPermissionTree expands the relationships reachable from a particular
     * permission or relation of a given resource.
     * </pre>
     */
    public com.authzed.api.v1.PermissionService.ExpandPermissionTreeResponse expandPermissionTree(com.authzed.api.v1.PermissionService.ExpandPermissionTreeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExpandPermissionTreeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LookupResources returns the IDs of all resources on which the specified
     * subject has permission or on which the specified subject is a member of the
     * relation.
     * </pre>
     */
    public java.util.Iterator<com.authzed.api.v1.PermissionService.LookupResourcesResponse> lookupResources(
        com.authzed.api.v1.PermissionService.LookupResourcesRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getLookupResourcesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * PermissionsService is used to perform permissions and relationship
   * operations.
   * </pre>
   */
  public static final class PermissionsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PermissionsServiceFutureStub> {
    private PermissionsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PermissionsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PermissionsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * WriteRelationships writes and/or deletes a set of specified relationships,
     * with an optional set of precondition relationships that must exist before
     * the operation can commit.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.authzed.api.v1.PermissionService.WriteRelationshipsResponse> writeRelationships(
        com.authzed.api.v1.PermissionService.WriteRelationshipsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWriteRelationshipsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteRelationships deletes relationships matching one or more filters, in
     * bulk.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.authzed.api.v1.PermissionService.DeleteRelationshipsResponse> deleteRelationships(
        com.authzed.api.v1.PermissionService.DeleteRelationshipsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRelationshipsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CheckPermission checks whether a subject has a particular permission or is
     * a member of a particular relation, on a given resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.authzed.api.v1.PermissionService.CheckPermissionResponse> checkPermission(
        com.authzed.api.v1.PermissionService.CheckPermissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckPermissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ExpandPermissionTree expands the relationships reachable from a particular
     * permission or relation of a given resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.authzed.api.v1.PermissionService.ExpandPermissionTreeResponse> expandPermissionTree(
        com.authzed.api.v1.PermissionService.ExpandPermissionTreeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExpandPermissionTreeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_READ_RELATIONSHIPS = 0;
  private static final int METHODID_WRITE_RELATIONSHIPS = 1;
  private static final int METHODID_DELETE_RELATIONSHIPS = 2;
  private static final int METHODID_CHECK_PERMISSION = 3;
  private static final int METHODID_EXPAND_PERMISSION_TREE = 4;
  private static final int METHODID_LOOKUP_RESOURCES = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PermissionsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PermissionsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_READ_RELATIONSHIPS:
          serviceImpl.readRelationships((com.authzed.api.v1.PermissionService.ReadRelationshipsRequest) request,
              (io.grpc.stub.StreamObserver<com.authzed.api.v1.PermissionService.ReadRelationshipsResponse>) responseObserver);
          break;
        case METHODID_WRITE_RELATIONSHIPS:
          serviceImpl.writeRelationships((com.authzed.api.v1.PermissionService.WriteRelationshipsRequest) request,
              (io.grpc.stub.StreamObserver<com.authzed.api.v1.PermissionService.WriteRelationshipsResponse>) responseObserver);
          break;
        case METHODID_DELETE_RELATIONSHIPS:
          serviceImpl.deleteRelationships((com.authzed.api.v1.PermissionService.DeleteRelationshipsRequest) request,
              (io.grpc.stub.StreamObserver<com.authzed.api.v1.PermissionService.DeleteRelationshipsResponse>) responseObserver);
          break;
        case METHODID_CHECK_PERMISSION:
          serviceImpl.checkPermission((com.authzed.api.v1.PermissionService.CheckPermissionRequest) request,
              (io.grpc.stub.StreamObserver<com.authzed.api.v1.PermissionService.CheckPermissionResponse>) responseObserver);
          break;
        case METHODID_EXPAND_PERMISSION_TREE:
          serviceImpl.expandPermissionTree((com.authzed.api.v1.PermissionService.ExpandPermissionTreeRequest) request,
              (io.grpc.stub.StreamObserver<com.authzed.api.v1.PermissionService.ExpandPermissionTreeResponse>) responseObserver);
          break;
        case METHODID_LOOKUP_RESOURCES:
          serviceImpl.lookupResources((com.authzed.api.v1.PermissionService.LookupResourcesRequest) request,
              (io.grpc.stub.StreamObserver<com.authzed.api.v1.PermissionService.LookupResourcesResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PermissionsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PermissionsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.authzed.api.v1.PermissionService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PermissionsService");
    }
  }

  private static final class PermissionsServiceFileDescriptorSupplier
      extends PermissionsServiceBaseDescriptorSupplier {
    PermissionsServiceFileDescriptorSupplier() {}
  }

  private static final class PermissionsServiceMethodDescriptorSupplier
      extends PermissionsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PermissionsServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PermissionsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PermissionsServiceFileDescriptorSupplier())
              .addMethod(getReadRelationshipsMethod())
              .addMethod(getWriteRelationshipsMethod())
              .addMethod(getDeleteRelationshipsMethod())
              .addMethod(getCheckPermissionMethod())
              .addMethod(getExpandPermissionTreeMethod())
              .addMethod(getLookupResourcesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
