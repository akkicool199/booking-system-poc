package bookingSystem;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Define the services
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: booking.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BookingServiceGrpc {

  private BookingServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bookingSystem.BookingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bookingSystem.Booking.FlightBookingRequest,
      bookingSystem.Booking.BookingResponse> getAddFlightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addFlight",
      requestType = bookingSystem.Booking.FlightBookingRequest.class,
      responseType = bookingSystem.Booking.BookingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bookingSystem.Booking.FlightBookingRequest,
      bookingSystem.Booking.BookingResponse> getAddFlightMethod() {
    io.grpc.MethodDescriptor<bookingSystem.Booking.FlightBookingRequest, bookingSystem.Booking.BookingResponse> getAddFlightMethod;
    if ((getAddFlightMethod = BookingServiceGrpc.getAddFlightMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getAddFlightMethod = BookingServiceGrpc.getAddFlightMethod) == null) {
          BookingServiceGrpc.getAddFlightMethod = getAddFlightMethod =
              io.grpc.MethodDescriptor.<bookingSystem.Booking.FlightBookingRequest, bookingSystem.Booking.BookingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addFlight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bookingSystem.Booking.FlightBookingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bookingSystem.Booking.BookingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("addFlight"))
              .build();
        }
      }
    }
    return getAddFlightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bookingSystem.Booking.SearchFlightRequest,
      bookingSystem.Booking.FlightList> getSearchFlightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "searchFlight",
      requestType = bookingSystem.Booking.SearchFlightRequest.class,
      responseType = bookingSystem.Booking.FlightList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bookingSystem.Booking.SearchFlightRequest,
      bookingSystem.Booking.FlightList> getSearchFlightMethod() {
    io.grpc.MethodDescriptor<bookingSystem.Booking.SearchFlightRequest, bookingSystem.Booking.FlightList> getSearchFlightMethod;
    if ((getSearchFlightMethod = BookingServiceGrpc.getSearchFlightMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getSearchFlightMethod = BookingServiceGrpc.getSearchFlightMethod) == null) {
          BookingServiceGrpc.getSearchFlightMethod = getSearchFlightMethod =
              io.grpc.MethodDescriptor.<bookingSystem.Booking.SearchFlightRequest, bookingSystem.Booking.FlightList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "searchFlight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bookingSystem.Booking.SearchFlightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bookingSystem.Booking.FlightList.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("searchFlight"))
              .build();
        }
      }
    }
    return getSearchFlightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bookingSystem.Booking.FlightBookingRequest,
      bookingSystem.Booking.BookingResponse> getBookFlightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "bookFlight",
      requestType = bookingSystem.Booking.FlightBookingRequest.class,
      responseType = bookingSystem.Booking.BookingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bookingSystem.Booking.FlightBookingRequest,
      bookingSystem.Booking.BookingResponse> getBookFlightMethod() {
    io.grpc.MethodDescriptor<bookingSystem.Booking.FlightBookingRequest, bookingSystem.Booking.BookingResponse> getBookFlightMethod;
    if ((getBookFlightMethod = BookingServiceGrpc.getBookFlightMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getBookFlightMethod = BookingServiceGrpc.getBookFlightMethod) == null) {
          BookingServiceGrpc.getBookFlightMethod = getBookFlightMethod =
              io.grpc.MethodDescriptor.<bookingSystem.Booking.FlightBookingRequest, bookingSystem.Booking.BookingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "bookFlight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bookingSystem.Booking.FlightBookingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bookingSystem.Booking.BookingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("bookFlight"))
              .build();
        }
      }
    }
    return getBookFlightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bookingSystem.Booking.Empty,
      bookingSystem.Booking.FlightList> getGetAllFlightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllFlights",
      requestType = bookingSystem.Booking.Empty.class,
      responseType = bookingSystem.Booking.FlightList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bookingSystem.Booking.Empty,
      bookingSystem.Booking.FlightList> getGetAllFlightsMethod() {
    io.grpc.MethodDescriptor<bookingSystem.Booking.Empty, bookingSystem.Booking.FlightList> getGetAllFlightsMethod;
    if ((getGetAllFlightsMethod = BookingServiceGrpc.getGetAllFlightsMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getGetAllFlightsMethod = BookingServiceGrpc.getGetAllFlightsMethod) == null) {
          BookingServiceGrpc.getGetAllFlightsMethod = getGetAllFlightsMethod =
              io.grpc.MethodDescriptor.<bookingSystem.Booking.Empty, bookingSystem.Booking.FlightList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllFlights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bookingSystem.Booking.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bookingSystem.Booking.FlightList.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("getAllFlights"))
              .build();
        }
      }
    }
    return getGetAllFlightsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bookingSystem.Booking.UserIdRequest,
      bookingSystem.Booking.BookingResponse> getGetFlightTicketForUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getFlightTicketForUser",
      requestType = bookingSystem.Booking.UserIdRequest.class,
      responseType = bookingSystem.Booking.BookingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bookingSystem.Booking.UserIdRequest,
      bookingSystem.Booking.BookingResponse> getGetFlightTicketForUserMethod() {
    io.grpc.MethodDescriptor<bookingSystem.Booking.UserIdRequest, bookingSystem.Booking.BookingResponse> getGetFlightTicketForUserMethod;
    if ((getGetFlightTicketForUserMethod = BookingServiceGrpc.getGetFlightTicketForUserMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getGetFlightTicketForUserMethod = BookingServiceGrpc.getGetFlightTicketForUserMethod) == null) {
          BookingServiceGrpc.getGetFlightTicketForUserMethod = getGetFlightTicketForUserMethod =
              io.grpc.MethodDescriptor.<bookingSystem.Booking.UserIdRequest, bookingSystem.Booking.BookingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getFlightTicketForUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bookingSystem.Booking.UserIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bookingSystem.Booking.BookingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("getFlightTicketForUser"))
              .build();
        }
      }
    }
    return getGetFlightTicketForUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bookingSystem.Booking.AddHotelRequest,
      bookingSystem.Booking.BookingResponse> getAddHotelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addHotel",
      requestType = bookingSystem.Booking.AddHotelRequest.class,
      responseType = bookingSystem.Booking.BookingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bookingSystem.Booking.AddHotelRequest,
      bookingSystem.Booking.BookingResponse> getAddHotelMethod() {
    io.grpc.MethodDescriptor<bookingSystem.Booking.AddHotelRequest, bookingSystem.Booking.BookingResponse> getAddHotelMethod;
    if ((getAddHotelMethod = BookingServiceGrpc.getAddHotelMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getAddHotelMethod = BookingServiceGrpc.getAddHotelMethod) == null) {
          BookingServiceGrpc.getAddHotelMethod = getAddHotelMethod =
              io.grpc.MethodDescriptor.<bookingSystem.Booking.AddHotelRequest, bookingSystem.Booking.BookingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addHotel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bookingSystem.Booking.AddHotelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bookingSystem.Booking.BookingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("addHotel"))
              .build();
        }
      }
    }
    return getAddHotelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bookingSystem.Booking.SearchHotelRequest,
      bookingSystem.Booking.Hotels> getSearchHotelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "searchHotel",
      requestType = bookingSystem.Booking.SearchHotelRequest.class,
      responseType = bookingSystem.Booking.Hotels.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bookingSystem.Booking.SearchHotelRequest,
      bookingSystem.Booking.Hotels> getSearchHotelMethod() {
    io.grpc.MethodDescriptor<bookingSystem.Booking.SearchHotelRequest, bookingSystem.Booking.Hotels> getSearchHotelMethod;
    if ((getSearchHotelMethod = BookingServiceGrpc.getSearchHotelMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getSearchHotelMethod = BookingServiceGrpc.getSearchHotelMethod) == null) {
          BookingServiceGrpc.getSearchHotelMethod = getSearchHotelMethod =
              io.grpc.MethodDescriptor.<bookingSystem.Booking.SearchHotelRequest, bookingSystem.Booking.Hotels>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "searchHotel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bookingSystem.Booking.SearchHotelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bookingSystem.Booking.Hotels.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("searchHotel"))
              .build();
        }
      }
    }
    return getSearchHotelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bookingSystem.Booking.HotelBookingRequest,
      bookingSystem.Booking.BookingResponse> getBookHotelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "bookHotel",
      requestType = bookingSystem.Booking.HotelBookingRequest.class,
      responseType = bookingSystem.Booking.BookingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bookingSystem.Booking.HotelBookingRequest,
      bookingSystem.Booking.BookingResponse> getBookHotelMethod() {
    io.grpc.MethodDescriptor<bookingSystem.Booking.HotelBookingRequest, bookingSystem.Booking.BookingResponse> getBookHotelMethod;
    if ((getBookHotelMethod = BookingServiceGrpc.getBookHotelMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getBookHotelMethod = BookingServiceGrpc.getBookHotelMethod) == null) {
          BookingServiceGrpc.getBookHotelMethod = getBookHotelMethod =
              io.grpc.MethodDescriptor.<bookingSystem.Booking.HotelBookingRequest, bookingSystem.Booking.BookingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "bookHotel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bookingSystem.Booking.HotelBookingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bookingSystem.Booking.BookingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("bookHotel"))
              .build();
        }
      }
    }
    return getBookHotelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bookingSystem.Booking.UserIdRequest,
      bookingSystem.Booking.BookingResponse> getGetHotelReservationByUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getHotelReservationByUser",
      requestType = bookingSystem.Booking.UserIdRequest.class,
      responseType = bookingSystem.Booking.BookingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bookingSystem.Booking.UserIdRequest,
      bookingSystem.Booking.BookingResponse> getGetHotelReservationByUserMethod() {
    io.grpc.MethodDescriptor<bookingSystem.Booking.UserIdRequest, bookingSystem.Booking.BookingResponse> getGetHotelReservationByUserMethod;
    if ((getGetHotelReservationByUserMethod = BookingServiceGrpc.getGetHotelReservationByUserMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getGetHotelReservationByUserMethod = BookingServiceGrpc.getGetHotelReservationByUserMethod) == null) {
          BookingServiceGrpc.getGetHotelReservationByUserMethod = getGetHotelReservationByUserMethod =
              io.grpc.MethodDescriptor.<bookingSystem.Booking.UserIdRequest, bookingSystem.Booking.BookingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getHotelReservationByUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bookingSystem.Booking.UserIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bookingSystem.Booking.BookingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("getHotelReservationByUser"))
              .build();
        }
      }
    }
    return getGetHotelReservationByUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bookingSystem.Booking.CarBookingRequest,
      bookingSystem.Booking.BookingResponse> getRentCarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "rentCar",
      requestType = bookingSystem.Booking.CarBookingRequest.class,
      responseType = bookingSystem.Booking.BookingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bookingSystem.Booking.CarBookingRequest,
      bookingSystem.Booking.BookingResponse> getRentCarMethod() {
    io.grpc.MethodDescriptor<bookingSystem.Booking.CarBookingRequest, bookingSystem.Booking.BookingResponse> getRentCarMethod;
    if ((getRentCarMethod = BookingServiceGrpc.getRentCarMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getRentCarMethod = BookingServiceGrpc.getRentCarMethod) == null) {
          BookingServiceGrpc.getRentCarMethod = getRentCarMethod =
              io.grpc.MethodDescriptor.<bookingSystem.Booking.CarBookingRequest, bookingSystem.Booking.BookingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "rentCar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bookingSystem.Booking.CarBookingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bookingSystem.Booking.BookingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("rentCar"))
              .build();
        }
      }
    }
    return getRentCarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bookingSystem.Booking.UserIdRequest,
      bookingSystem.Booking.BookingResponse> getGetCarBookingByUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCarBookingByUser",
      requestType = bookingSystem.Booking.UserIdRequest.class,
      responseType = bookingSystem.Booking.BookingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bookingSystem.Booking.UserIdRequest,
      bookingSystem.Booking.BookingResponse> getGetCarBookingByUserMethod() {
    io.grpc.MethodDescriptor<bookingSystem.Booking.UserIdRequest, bookingSystem.Booking.BookingResponse> getGetCarBookingByUserMethod;
    if ((getGetCarBookingByUserMethod = BookingServiceGrpc.getGetCarBookingByUserMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getGetCarBookingByUserMethod = BookingServiceGrpc.getGetCarBookingByUserMethod) == null) {
          BookingServiceGrpc.getGetCarBookingByUserMethod = getGetCarBookingByUserMethod =
              io.grpc.MethodDescriptor.<bookingSystem.Booking.UserIdRequest, bookingSystem.Booking.BookingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCarBookingByUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bookingSystem.Booking.UserIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bookingSystem.Booking.BookingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("getCarBookingByUser"))
              .build();
        }
      }
    }
    return getGetCarBookingByUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookingServiceStub>() {
        @java.lang.Override
        public BookingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookingServiceStub(channel, callOptions);
        }
      };
    return BookingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookingServiceBlockingStub>() {
        @java.lang.Override
        public BookingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookingServiceBlockingStub(channel, callOptions);
        }
      };
    return BookingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookingServiceFutureStub>() {
        @java.lang.Override
        public BookingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookingServiceFutureStub(channel, callOptions);
        }
      };
    return BookingServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Define the services
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void addFlight(bookingSystem.Booking.FlightBookingRequest request,
        io.grpc.stub.StreamObserver<bookingSystem.Booking.BookingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddFlightMethod(), responseObserver);
    }

    /**
     */
    default void searchFlight(bookingSystem.Booking.SearchFlightRequest request,
        io.grpc.stub.StreamObserver<bookingSystem.Booking.FlightList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchFlightMethod(), responseObserver);
    }

    /**
     */
    default void bookFlight(bookingSystem.Booking.FlightBookingRequest request,
        io.grpc.stub.StreamObserver<bookingSystem.Booking.BookingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBookFlightMethod(), responseObserver);
    }

    /**
     */
    default void getAllFlights(bookingSystem.Booking.Empty request,
        io.grpc.stub.StreamObserver<bookingSystem.Booking.FlightList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllFlightsMethod(), responseObserver);
    }

    /**
     */
    default void getFlightTicketForUser(bookingSystem.Booking.UserIdRequest request,
        io.grpc.stub.StreamObserver<bookingSystem.Booking.BookingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFlightTicketForUserMethod(), responseObserver);
    }

    /**
     */
    default void addHotel(bookingSystem.Booking.AddHotelRequest request,
        io.grpc.stub.StreamObserver<bookingSystem.Booking.BookingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddHotelMethod(), responseObserver);
    }

    /**
     */
    default void searchHotel(bookingSystem.Booking.SearchHotelRequest request,
        io.grpc.stub.StreamObserver<bookingSystem.Booking.Hotels> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchHotelMethod(), responseObserver);
    }

    /**
     */
    default void bookHotel(bookingSystem.Booking.HotelBookingRequest request,
        io.grpc.stub.StreamObserver<bookingSystem.Booking.BookingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBookHotelMethod(), responseObserver);
    }

    /**
     */
    default void getHotelReservationByUser(bookingSystem.Booking.UserIdRequest request,
        io.grpc.stub.StreamObserver<bookingSystem.Booking.BookingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHotelReservationByUserMethod(), responseObserver);
    }

    /**
     */
    default void rentCar(bookingSystem.Booking.CarBookingRequest request,
        io.grpc.stub.StreamObserver<bookingSystem.Booking.BookingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRentCarMethod(), responseObserver);
    }

    /**
     */
    default void getCarBookingByUser(bookingSystem.Booking.UserIdRequest request,
        io.grpc.stub.StreamObserver<bookingSystem.Booking.BookingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCarBookingByUserMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BookingService.
   * <pre>
   * Define the services
   * </pre>
   */
  public static abstract class BookingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BookingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BookingService.
   * <pre>
   * Define the services
   * </pre>
   */
  public static final class BookingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BookingServiceStub> {
    private BookingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookingServiceStub(channel, callOptions);
    }

    /**
     */
    public void addFlight(bookingSystem.Booking.FlightBookingRequest request,
        io.grpc.stub.StreamObserver<bookingSystem.Booking.BookingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddFlightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchFlight(bookingSystem.Booking.SearchFlightRequest request,
        io.grpc.stub.StreamObserver<bookingSystem.Booking.FlightList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchFlightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bookFlight(bookingSystem.Booking.FlightBookingRequest request,
        io.grpc.stub.StreamObserver<bookingSystem.Booking.BookingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBookFlightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllFlights(bookingSystem.Booking.Empty request,
        io.grpc.stub.StreamObserver<bookingSystem.Booking.FlightList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllFlightsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFlightTicketForUser(bookingSystem.Booking.UserIdRequest request,
        io.grpc.stub.StreamObserver<bookingSystem.Booking.BookingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFlightTicketForUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addHotel(bookingSystem.Booking.AddHotelRequest request,
        io.grpc.stub.StreamObserver<bookingSystem.Booking.BookingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddHotelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchHotel(bookingSystem.Booking.SearchHotelRequest request,
        io.grpc.stub.StreamObserver<bookingSystem.Booking.Hotels> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchHotelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bookHotel(bookingSystem.Booking.HotelBookingRequest request,
        io.grpc.stub.StreamObserver<bookingSystem.Booking.BookingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBookHotelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getHotelReservationByUser(bookingSystem.Booking.UserIdRequest request,
        io.grpc.stub.StreamObserver<bookingSystem.Booking.BookingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHotelReservationByUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rentCar(bookingSystem.Booking.CarBookingRequest request,
        io.grpc.stub.StreamObserver<bookingSystem.Booking.BookingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRentCarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCarBookingByUser(bookingSystem.Booking.UserIdRequest request,
        io.grpc.stub.StreamObserver<bookingSystem.Booking.BookingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCarBookingByUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BookingService.
   * <pre>
   * Define the services
   * </pre>
   */
  public static final class BookingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BookingServiceBlockingStub> {
    private BookingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public bookingSystem.Booking.BookingResponse addFlight(bookingSystem.Booking.FlightBookingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddFlightMethod(), getCallOptions(), request);
    }

    /**
     */
    public bookingSystem.Booking.FlightList searchFlight(bookingSystem.Booking.SearchFlightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchFlightMethod(), getCallOptions(), request);
    }

    /**
     */
    public bookingSystem.Booking.BookingResponse bookFlight(bookingSystem.Booking.FlightBookingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBookFlightMethod(), getCallOptions(), request);
    }

    /**
     */
    public bookingSystem.Booking.FlightList getAllFlights(bookingSystem.Booking.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllFlightsMethod(), getCallOptions(), request);
    }

    /**
     */
    public bookingSystem.Booking.BookingResponse getFlightTicketForUser(bookingSystem.Booking.UserIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFlightTicketForUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public bookingSystem.Booking.BookingResponse addHotel(bookingSystem.Booking.AddHotelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddHotelMethod(), getCallOptions(), request);
    }

    /**
     */
    public bookingSystem.Booking.Hotels searchHotel(bookingSystem.Booking.SearchHotelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchHotelMethod(), getCallOptions(), request);
    }

    /**
     */
    public bookingSystem.Booking.BookingResponse bookHotel(bookingSystem.Booking.HotelBookingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBookHotelMethod(), getCallOptions(), request);
    }

    /**
     */
    public bookingSystem.Booking.BookingResponse getHotelReservationByUser(bookingSystem.Booking.UserIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHotelReservationByUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public bookingSystem.Booking.BookingResponse rentCar(bookingSystem.Booking.CarBookingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRentCarMethod(), getCallOptions(), request);
    }

    /**
     */
    public bookingSystem.Booking.BookingResponse getCarBookingByUser(bookingSystem.Booking.UserIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCarBookingByUserMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BookingService.
   * <pre>
   * Define the services
   * </pre>
   */
  public static final class BookingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BookingServiceFutureStub> {
    private BookingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bookingSystem.Booking.BookingResponse> addFlight(
        bookingSystem.Booking.FlightBookingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddFlightMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bookingSystem.Booking.FlightList> searchFlight(
        bookingSystem.Booking.SearchFlightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchFlightMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bookingSystem.Booking.BookingResponse> bookFlight(
        bookingSystem.Booking.FlightBookingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBookFlightMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bookingSystem.Booking.FlightList> getAllFlights(
        bookingSystem.Booking.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllFlightsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bookingSystem.Booking.BookingResponse> getFlightTicketForUser(
        bookingSystem.Booking.UserIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFlightTicketForUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bookingSystem.Booking.BookingResponse> addHotel(
        bookingSystem.Booking.AddHotelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddHotelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bookingSystem.Booking.Hotels> searchHotel(
        bookingSystem.Booking.SearchHotelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchHotelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bookingSystem.Booking.BookingResponse> bookHotel(
        bookingSystem.Booking.HotelBookingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBookHotelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bookingSystem.Booking.BookingResponse> getHotelReservationByUser(
        bookingSystem.Booking.UserIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHotelReservationByUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bookingSystem.Booking.BookingResponse> rentCar(
        bookingSystem.Booking.CarBookingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRentCarMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bookingSystem.Booking.BookingResponse> getCarBookingByUser(
        bookingSystem.Booking.UserIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCarBookingByUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_FLIGHT = 0;
  private static final int METHODID_SEARCH_FLIGHT = 1;
  private static final int METHODID_BOOK_FLIGHT = 2;
  private static final int METHODID_GET_ALL_FLIGHTS = 3;
  private static final int METHODID_GET_FLIGHT_TICKET_FOR_USER = 4;
  private static final int METHODID_ADD_HOTEL = 5;
  private static final int METHODID_SEARCH_HOTEL = 6;
  private static final int METHODID_BOOK_HOTEL = 7;
  private static final int METHODID_GET_HOTEL_RESERVATION_BY_USER = 8;
  private static final int METHODID_RENT_CAR = 9;
  private static final int METHODID_GET_CAR_BOOKING_BY_USER = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_FLIGHT:
          serviceImpl.addFlight((bookingSystem.Booking.FlightBookingRequest) request,
              (io.grpc.stub.StreamObserver<bookingSystem.Booking.BookingResponse>) responseObserver);
          break;
        case METHODID_SEARCH_FLIGHT:
          serviceImpl.searchFlight((bookingSystem.Booking.SearchFlightRequest) request,
              (io.grpc.stub.StreamObserver<bookingSystem.Booking.FlightList>) responseObserver);
          break;
        case METHODID_BOOK_FLIGHT:
          serviceImpl.bookFlight((bookingSystem.Booking.FlightBookingRequest) request,
              (io.grpc.stub.StreamObserver<bookingSystem.Booking.BookingResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_FLIGHTS:
          serviceImpl.getAllFlights((bookingSystem.Booking.Empty) request,
              (io.grpc.stub.StreamObserver<bookingSystem.Booking.FlightList>) responseObserver);
          break;
        case METHODID_GET_FLIGHT_TICKET_FOR_USER:
          serviceImpl.getFlightTicketForUser((bookingSystem.Booking.UserIdRequest) request,
              (io.grpc.stub.StreamObserver<bookingSystem.Booking.BookingResponse>) responseObserver);
          break;
        case METHODID_ADD_HOTEL:
          serviceImpl.addHotel((bookingSystem.Booking.AddHotelRequest) request,
              (io.grpc.stub.StreamObserver<bookingSystem.Booking.BookingResponse>) responseObserver);
          break;
        case METHODID_SEARCH_HOTEL:
          serviceImpl.searchHotel((bookingSystem.Booking.SearchHotelRequest) request,
              (io.grpc.stub.StreamObserver<bookingSystem.Booking.Hotels>) responseObserver);
          break;
        case METHODID_BOOK_HOTEL:
          serviceImpl.bookHotel((bookingSystem.Booking.HotelBookingRequest) request,
              (io.grpc.stub.StreamObserver<bookingSystem.Booking.BookingResponse>) responseObserver);
          break;
        case METHODID_GET_HOTEL_RESERVATION_BY_USER:
          serviceImpl.getHotelReservationByUser((bookingSystem.Booking.UserIdRequest) request,
              (io.grpc.stub.StreamObserver<bookingSystem.Booking.BookingResponse>) responseObserver);
          break;
        case METHODID_RENT_CAR:
          serviceImpl.rentCar((bookingSystem.Booking.CarBookingRequest) request,
              (io.grpc.stub.StreamObserver<bookingSystem.Booking.BookingResponse>) responseObserver);
          break;
        case METHODID_GET_CAR_BOOKING_BY_USER:
          serviceImpl.getCarBookingByUser((bookingSystem.Booking.UserIdRequest) request,
              (io.grpc.stub.StreamObserver<bookingSystem.Booking.BookingResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getAddFlightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bookingSystem.Booking.FlightBookingRequest,
              bookingSystem.Booking.BookingResponse>(
                service, METHODID_ADD_FLIGHT)))
        .addMethod(
          getSearchFlightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bookingSystem.Booking.SearchFlightRequest,
              bookingSystem.Booking.FlightList>(
                service, METHODID_SEARCH_FLIGHT)))
        .addMethod(
          getBookFlightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bookingSystem.Booking.FlightBookingRequest,
              bookingSystem.Booking.BookingResponse>(
                service, METHODID_BOOK_FLIGHT)))
        .addMethod(
          getGetAllFlightsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bookingSystem.Booking.Empty,
              bookingSystem.Booking.FlightList>(
                service, METHODID_GET_ALL_FLIGHTS)))
        .addMethod(
          getGetFlightTicketForUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bookingSystem.Booking.UserIdRequest,
              bookingSystem.Booking.BookingResponse>(
                service, METHODID_GET_FLIGHT_TICKET_FOR_USER)))
        .addMethod(
          getAddHotelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bookingSystem.Booking.AddHotelRequest,
              bookingSystem.Booking.BookingResponse>(
                service, METHODID_ADD_HOTEL)))
        .addMethod(
          getSearchHotelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bookingSystem.Booking.SearchHotelRequest,
              bookingSystem.Booking.Hotels>(
                service, METHODID_SEARCH_HOTEL)))
        .addMethod(
          getBookHotelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bookingSystem.Booking.HotelBookingRequest,
              bookingSystem.Booking.BookingResponse>(
                service, METHODID_BOOK_HOTEL)))
        .addMethod(
          getGetHotelReservationByUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bookingSystem.Booking.UserIdRequest,
              bookingSystem.Booking.BookingResponse>(
                service, METHODID_GET_HOTEL_RESERVATION_BY_USER)))
        .addMethod(
          getRentCarMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bookingSystem.Booking.CarBookingRequest,
              bookingSystem.Booking.BookingResponse>(
                service, METHODID_RENT_CAR)))
        .addMethod(
          getGetCarBookingByUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bookingSystem.Booking.UserIdRequest,
              bookingSystem.Booking.BookingResponse>(
                service, METHODID_GET_CAR_BOOKING_BY_USER)))
        .build();
  }

  private static abstract class BookingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BookingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bookingSystem.Booking.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BookingService");
    }
  }

  private static final class BookingServiceFileDescriptorSupplier
      extends BookingServiceBaseDescriptorSupplier {
    BookingServiceFileDescriptorSupplier() {}
  }

  private static final class BookingServiceMethodDescriptorSupplier
      extends BookingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BookingServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (BookingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookingServiceFileDescriptorSupplier())
              .addMethod(getAddFlightMethod())
              .addMethod(getSearchFlightMethod())
              .addMethod(getBookFlightMethod())
              .addMethod(getGetAllFlightsMethod())
              .addMethod(getGetFlightTicketForUserMethod())
              .addMethod(getAddHotelMethod())
              .addMethod(getSearchHotelMethod())
              .addMethod(getBookHotelMethod())
              .addMethod(getGetHotelReservationByUserMethod())
              .addMethod(getRentCarMethod())
              .addMethod(getGetCarBookingByUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
