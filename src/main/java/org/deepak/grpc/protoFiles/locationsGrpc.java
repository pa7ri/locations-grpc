package org.deepak.grpc.protoFiles;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.14.0)",
    comments = "Source: locations.proto")
public final class locationsGrpc {

  private locationsGrpc() {}

  public static final String SERVICE_NAME = "locations";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.deepak.grpc.protoFiles.Locations.locationId,
      org.deepak.grpc.protoFiles.Locations.APIResponse> getGetLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getLocation",
      requestType = org.deepak.grpc.protoFiles.Locations.locationId.class,
      responseType = org.deepak.grpc.protoFiles.Locations.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.deepak.grpc.protoFiles.Locations.locationId,
      org.deepak.grpc.protoFiles.Locations.APIResponse> getGetLocationMethod() {
    io.grpc.MethodDescriptor<org.deepak.grpc.protoFiles.Locations.locationId, org.deepak.grpc.protoFiles.Locations.APIResponse> getGetLocationMethod;
    if ((getGetLocationMethod = locationsGrpc.getGetLocationMethod) == null) {
      synchronized (locationsGrpc.class) {
        if ((getGetLocationMethod = locationsGrpc.getGetLocationMethod) == null) {
          locationsGrpc.getGetLocationMethod = getGetLocationMethod = 
              io.grpc.MethodDescriptor.<org.deepak.grpc.protoFiles.Locations.locationId, org.deepak.grpc.protoFiles.Locations.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "locations", "getLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.deepak.grpc.protoFiles.Locations.locationId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.deepak.grpc.protoFiles.Locations.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new locationsMethodDescriptorSupplier("getLocation"))
                  .build();
          }
        }
     }
     return getGetLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.deepak.grpc.protoFiles.Locations.location,
      org.deepak.grpc.protoFiles.Locations.APIResponse> getAddLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addLocation",
      requestType = org.deepak.grpc.protoFiles.Locations.location.class,
      responseType = org.deepak.grpc.protoFiles.Locations.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.deepak.grpc.protoFiles.Locations.location,
      org.deepak.grpc.protoFiles.Locations.APIResponse> getAddLocationMethod() {
    io.grpc.MethodDescriptor<org.deepak.grpc.protoFiles.Locations.location, org.deepak.grpc.protoFiles.Locations.APIResponse> getAddLocationMethod;
    if ((getAddLocationMethod = locationsGrpc.getAddLocationMethod) == null) {
      synchronized (locationsGrpc.class) {
        if ((getAddLocationMethod = locationsGrpc.getAddLocationMethod) == null) {
          locationsGrpc.getAddLocationMethod = getAddLocationMethod = 
              io.grpc.MethodDescriptor.<org.deepak.grpc.protoFiles.Locations.location, org.deepak.grpc.protoFiles.Locations.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "locations", "addLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.deepak.grpc.protoFiles.Locations.location.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.deepak.grpc.protoFiles.Locations.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new locationsMethodDescriptorSupplier("addLocation"))
                  .build();
          }
        }
     }
     return getAddLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.deepak.grpc.protoFiles.Locations.locationUpdate,
      org.deepak.grpc.protoFiles.Locations.APIResponse> getUpdateLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateLocation",
      requestType = org.deepak.grpc.protoFiles.Locations.locationUpdate.class,
      responseType = org.deepak.grpc.protoFiles.Locations.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.deepak.grpc.protoFiles.Locations.locationUpdate,
      org.deepak.grpc.protoFiles.Locations.APIResponse> getUpdateLocationMethod() {
    io.grpc.MethodDescriptor<org.deepak.grpc.protoFiles.Locations.locationUpdate, org.deepak.grpc.protoFiles.Locations.APIResponse> getUpdateLocationMethod;
    if ((getUpdateLocationMethod = locationsGrpc.getUpdateLocationMethod) == null) {
      synchronized (locationsGrpc.class) {
        if ((getUpdateLocationMethod = locationsGrpc.getUpdateLocationMethod) == null) {
          locationsGrpc.getUpdateLocationMethod = getUpdateLocationMethod = 
              io.grpc.MethodDescriptor.<org.deepak.grpc.protoFiles.Locations.locationUpdate, org.deepak.grpc.protoFiles.Locations.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "locations", "updateLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.deepak.grpc.protoFiles.Locations.locationUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.deepak.grpc.protoFiles.Locations.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new locationsMethodDescriptorSupplier("updateLocation"))
                  .build();
          }
        }
     }
     return getUpdateLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.deepak.grpc.protoFiles.Locations.locationId,
      org.deepak.grpc.protoFiles.Locations.APIResponse> getDeleteLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteLocation",
      requestType = org.deepak.grpc.protoFiles.Locations.locationId.class,
      responseType = org.deepak.grpc.protoFiles.Locations.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.deepak.grpc.protoFiles.Locations.locationId,
      org.deepak.grpc.protoFiles.Locations.APIResponse> getDeleteLocationMethod() {
    io.grpc.MethodDescriptor<org.deepak.grpc.protoFiles.Locations.locationId, org.deepak.grpc.protoFiles.Locations.APIResponse> getDeleteLocationMethod;
    if ((getDeleteLocationMethod = locationsGrpc.getDeleteLocationMethod) == null) {
      synchronized (locationsGrpc.class) {
        if ((getDeleteLocationMethod = locationsGrpc.getDeleteLocationMethod) == null) {
          locationsGrpc.getDeleteLocationMethod = getDeleteLocationMethod = 
              io.grpc.MethodDescriptor.<org.deepak.grpc.protoFiles.Locations.locationId, org.deepak.grpc.protoFiles.Locations.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "locations", "deleteLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.deepak.grpc.protoFiles.Locations.locationId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.deepak.grpc.protoFiles.Locations.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new locationsMethodDescriptorSupplier("deleteLocation"))
                  .build();
          }
        }
     }
     return getDeleteLocationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static locationsStub newStub(io.grpc.Channel channel) {
    return new locationsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static locationsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new locationsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static locationsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new locationsFutureStub(channel);
  }

  /**
   */
  public static abstract class locationsImplBase implements io.grpc.BindableService {

    /**
     */
    public void getLocation(org.deepak.grpc.protoFiles.Locations.locationId request,
        io.grpc.stub.StreamObserver<org.deepak.grpc.protoFiles.Locations.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLocationMethod(), responseObserver);
    }

    /**
     */
    public void addLocation(org.deepak.grpc.protoFiles.Locations.location request,
        io.grpc.stub.StreamObserver<org.deepak.grpc.protoFiles.Locations.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddLocationMethod(), responseObserver);
    }

    /**
     */
    public void updateLocation(org.deepak.grpc.protoFiles.Locations.locationUpdate request,
        io.grpc.stub.StreamObserver<org.deepak.grpc.protoFiles.Locations.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateLocationMethod(), responseObserver);
    }

    /**
     */
    public void deleteLocation(org.deepak.grpc.protoFiles.Locations.locationId request,
        io.grpc.stub.StreamObserver<org.deepak.grpc.protoFiles.Locations.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteLocationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetLocationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.deepak.grpc.protoFiles.Locations.locationId,
                org.deepak.grpc.protoFiles.Locations.APIResponse>(
                  this, METHODID_GET_LOCATION)))
          .addMethod(
            getAddLocationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.deepak.grpc.protoFiles.Locations.location,
                org.deepak.grpc.protoFiles.Locations.APIResponse>(
                  this, METHODID_ADD_LOCATION)))
          .addMethod(
            getUpdateLocationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.deepak.grpc.protoFiles.Locations.locationUpdate,
                org.deepak.grpc.protoFiles.Locations.APIResponse>(
                  this, METHODID_UPDATE_LOCATION)))
          .addMethod(
            getDeleteLocationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.deepak.grpc.protoFiles.Locations.locationId,
                org.deepak.grpc.protoFiles.Locations.APIResponse>(
                  this, METHODID_DELETE_LOCATION)))
          .build();
    }
  }

  /**
   */
  public static final class locationsStub extends io.grpc.stub.AbstractStub<locationsStub> {
    private locationsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private locationsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected locationsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new locationsStub(channel, callOptions);
    }

    /**
     */
    public void getLocation(org.deepak.grpc.protoFiles.Locations.locationId request,
        io.grpc.stub.StreamObserver<org.deepak.grpc.protoFiles.Locations.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addLocation(org.deepak.grpc.protoFiles.Locations.location request,
        io.grpc.stub.StreamObserver<org.deepak.grpc.protoFiles.Locations.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateLocation(org.deepak.grpc.protoFiles.Locations.locationUpdate request,
        io.grpc.stub.StreamObserver<org.deepak.grpc.protoFiles.Locations.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteLocation(org.deepak.grpc.protoFiles.Locations.locationId request,
        io.grpc.stub.StreamObserver<org.deepak.grpc.protoFiles.Locations.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteLocationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class locationsBlockingStub extends io.grpc.stub.AbstractStub<locationsBlockingStub> {
    private locationsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private locationsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected locationsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new locationsBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.deepak.grpc.protoFiles.Locations.APIResponse getLocation(org.deepak.grpc.protoFiles.Locations.locationId request) {
      return blockingUnaryCall(
          getChannel(), getGetLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.deepak.grpc.protoFiles.Locations.APIResponse addLocation(org.deepak.grpc.protoFiles.Locations.location request) {
      return blockingUnaryCall(
          getChannel(), getAddLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.deepak.grpc.protoFiles.Locations.APIResponse updateLocation(org.deepak.grpc.protoFiles.Locations.locationUpdate request) {
      return blockingUnaryCall(
          getChannel(), getUpdateLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.deepak.grpc.protoFiles.Locations.APIResponse deleteLocation(org.deepak.grpc.protoFiles.Locations.locationId request) {
      return blockingUnaryCall(
          getChannel(), getDeleteLocationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class locationsFutureStub extends io.grpc.stub.AbstractStub<locationsFutureStub> {
    private locationsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private locationsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected locationsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new locationsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.deepak.grpc.protoFiles.Locations.APIResponse> getLocation(
        org.deepak.grpc.protoFiles.Locations.locationId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.deepak.grpc.protoFiles.Locations.APIResponse> addLocation(
        org.deepak.grpc.protoFiles.Locations.location request) {
      return futureUnaryCall(
          getChannel().newCall(getAddLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.deepak.grpc.protoFiles.Locations.APIResponse> updateLocation(
        org.deepak.grpc.protoFiles.Locations.locationUpdate request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.deepak.grpc.protoFiles.Locations.APIResponse> deleteLocation(
        org.deepak.grpc.protoFiles.Locations.locationId request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteLocationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_LOCATION = 0;
  private static final int METHODID_ADD_LOCATION = 1;
  private static final int METHODID_UPDATE_LOCATION = 2;
  private static final int METHODID_DELETE_LOCATION = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final locationsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(locationsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_LOCATION:
          serviceImpl.getLocation((org.deepak.grpc.protoFiles.Locations.locationId) request,
              (io.grpc.stub.StreamObserver<org.deepak.grpc.protoFiles.Locations.APIResponse>) responseObserver);
          break;
        case METHODID_ADD_LOCATION:
          serviceImpl.addLocation((org.deepak.grpc.protoFiles.Locations.location) request,
              (io.grpc.stub.StreamObserver<org.deepak.grpc.protoFiles.Locations.APIResponse>) responseObserver);
          break;
        case METHODID_UPDATE_LOCATION:
          serviceImpl.updateLocation((org.deepak.grpc.protoFiles.Locations.locationUpdate) request,
              (io.grpc.stub.StreamObserver<org.deepak.grpc.protoFiles.Locations.APIResponse>) responseObserver);
          break;
        case METHODID_DELETE_LOCATION:
          serviceImpl.deleteLocation((org.deepak.grpc.protoFiles.Locations.locationId) request,
              (io.grpc.stub.StreamObserver<org.deepak.grpc.protoFiles.Locations.APIResponse>) responseObserver);
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

  private static abstract class locationsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    locationsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.deepak.grpc.protoFiles.Locations.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("locations");
    }
  }

  private static final class locationsFileDescriptorSupplier
      extends locationsBaseDescriptorSupplier {
    locationsFileDescriptorSupplier() {}
  }

  private static final class locationsMethodDescriptorSupplier
      extends locationsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    locationsMethodDescriptorSupplier(String methodName) {
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
      synchronized (locationsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new locationsFileDescriptorSupplier())
              .addMethod(getGetLocationMethod())
              .addMethod(getAddLocationMethod())
              .addMethod(getUpdateLocationMethod())
              .addMethod(getDeleteLocationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
