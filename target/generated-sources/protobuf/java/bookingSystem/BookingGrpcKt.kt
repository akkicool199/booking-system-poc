package bookingSystem

import bookingSystem.BookingServiceGrpc.getServiceDescriptor
import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for bookingSystem.BookingService.
 */
public object BookingServiceGrpcKt {
  public const val SERVICE_NAME: String = BookingServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val addFlightMethod:
      MethodDescriptor<Booking.FlightBookingRequest, Booking.BookingResponse>
    @JvmStatic
    get() = BookingServiceGrpc.getAddFlightMethod()

  public val searchFlightMethod: MethodDescriptor<Booking.SearchFlightRequest, Booking.FlightList>
    @JvmStatic
    get() = BookingServiceGrpc.getSearchFlightMethod()

  public val bookFlightMethod:
      MethodDescriptor<Booking.FlightBookingRequest, Booking.BookingResponse>
    @JvmStatic
    get() = BookingServiceGrpc.getBookFlightMethod()

  public val getAllFlightsMethod: MethodDescriptor<Booking.Empty, Booking.FlightList>
    @JvmStatic
    get() = BookingServiceGrpc.getGetAllFlightsMethod()

  public val getFlightTicketForUserMethod:
      MethodDescriptor<Booking.UserIdRequest, Booking.BookingResponse>
    @JvmStatic
    get() = BookingServiceGrpc.getGetFlightTicketForUserMethod()

  public val addHotelMethod: MethodDescriptor<Booking.AddHotelRequest, Booking.BookingResponse>
    @JvmStatic
    get() = BookingServiceGrpc.getAddHotelMethod()

  public val searchHotelMethod: MethodDescriptor<Booking.SearchHotelRequest, Booking.Hotels>
    @JvmStatic
    get() = BookingServiceGrpc.getSearchHotelMethod()

  public val bookHotelMethod: MethodDescriptor<Booking.HotelBookingRequest, Booking.BookingResponse>
    @JvmStatic
    get() = BookingServiceGrpc.getBookHotelMethod()

  public val getHotelReservationByUserMethod:
      MethodDescriptor<Booking.UserIdRequest, Booking.BookingResponse>
    @JvmStatic
    get() = BookingServiceGrpc.getGetHotelReservationByUserMethod()

  public val rentCarMethod: MethodDescriptor<Booking.CarBookingRequest, Booking.BookingResponse>
    @JvmStatic
    get() = BookingServiceGrpc.getRentCarMethod()

  public val getCarBookingByUserMethod:
      MethodDescriptor<Booking.UserIdRequest, Booking.BookingResponse>
    @JvmStatic
    get() = BookingServiceGrpc.getGetCarBookingByUserMethod()

  /**
   * A stub for issuing RPCs to a(n) bookingSystem.BookingService service as suspending coroutines.
   */
  @StubFor(BookingServiceGrpc::class)
  public class BookingServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<BookingServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): BookingServiceCoroutineStub =
        BookingServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun addFlight(request: Booking.FlightBookingRequest, headers: Metadata =
        Metadata()): Booking.BookingResponse = unaryRpc(
      channel,
      BookingServiceGrpc.getAddFlightMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun searchFlight(request: Booking.SearchFlightRequest, headers: Metadata =
        Metadata()): Booking.FlightList = unaryRpc(
      channel,
      BookingServiceGrpc.getSearchFlightMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun bookFlight(request: Booking.FlightBookingRequest, headers: Metadata =
        Metadata()): Booking.BookingResponse = unaryRpc(
      channel,
      BookingServiceGrpc.getBookFlightMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun getAllFlights(request: Booking.Empty, headers: Metadata = Metadata()):
        Booking.FlightList = unaryRpc(
      channel,
      BookingServiceGrpc.getGetAllFlightsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun getFlightTicketForUser(request: Booking.UserIdRequest, headers: Metadata =
        Metadata()): Booking.BookingResponse = unaryRpc(
      channel,
      BookingServiceGrpc.getGetFlightTicketForUserMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun addHotel(request: Booking.AddHotelRequest, headers: Metadata = Metadata()):
        Booking.BookingResponse = unaryRpc(
      channel,
      BookingServiceGrpc.getAddHotelMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun searchHotel(request: Booking.SearchHotelRequest, headers: Metadata =
        Metadata()): Booking.Hotels = unaryRpc(
      channel,
      BookingServiceGrpc.getSearchHotelMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun bookHotel(request: Booking.HotelBookingRequest, headers: Metadata =
        Metadata()): Booking.BookingResponse = unaryRpc(
      channel,
      BookingServiceGrpc.getBookHotelMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun getHotelReservationByUser(request: Booking.UserIdRequest, headers: Metadata =
        Metadata()): Booking.BookingResponse = unaryRpc(
      channel,
      BookingServiceGrpc.getGetHotelReservationByUserMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun rentCar(request: Booking.CarBookingRequest, headers: Metadata = Metadata()):
        Booking.BookingResponse = unaryRpc(
      channel,
      BookingServiceGrpc.getRentCarMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun getCarBookingByUser(request: Booking.UserIdRequest, headers: Metadata =
        Metadata()): Booking.BookingResponse = unaryRpc(
      channel,
      BookingServiceGrpc.getGetCarBookingByUserMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the bookingSystem.BookingService service based on Kotlin coroutines.
   */
  public abstract class BookingServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for bookingSystem.BookingService.addFlight.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun addFlight(request: Booking.FlightBookingRequest):
        Booking.BookingResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bookingSystem.BookingService.addFlight is unimplemented"))

    /**
     * Returns the response to an RPC for bookingSystem.BookingService.searchFlight.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchFlight(request: Booking.SearchFlightRequest): Booking.FlightList =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method bookingSystem.BookingService.searchFlight is unimplemented"))

    /**
     * Returns the response to an RPC for bookingSystem.BookingService.bookFlight.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun bookFlight(request: Booking.FlightBookingRequest):
        Booking.BookingResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bookingSystem.BookingService.bookFlight is unimplemented"))

    /**
     * Returns the response to an RPC for bookingSystem.BookingService.getAllFlights.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getAllFlights(request: Booking.Empty): Booking.FlightList = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bookingSystem.BookingService.getAllFlights is unimplemented"))

    /**
     * Returns the response to an RPC for bookingSystem.BookingService.getFlightTicketForUser.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getFlightTicketForUser(request: Booking.UserIdRequest):
        Booking.BookingResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bookingSystem.BookingService.getFlightTicketForUser is unimplemented"))

    /**
     * Returns the response to an RPC for bookingSystem.BookingService.addHotel.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun addHotel(request: Booking.AddHotelRequest): Booking.BookingResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method bookingSystem.BookingService.addHotel is unimplemented"))

    /**
     * Returns the response to an RPC for bookingSystem.BookingService.searchHotel.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun searchHotel(request: Booking.SearchHotelRequest): Booking.Hotels = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bookingSystem.BookingService.searchHotel is unimplemented"))

    /**
     * Returns the response to an RPC for bookingSystem.BookingService.bookHotel.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun bookHotel(request: Booking.HotelBookingRequest): Booking.BookingResponse
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bookingSystem.BookingService.bookHotel is unimplemented"))

    /**
     * Returns the response to an RPC for bookingSystem.BookingService.getHotelReservationByUser.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getHotelReservationByUser(request: Booking.UserIdRequest):
        Booking.BookingResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bookingSystem.BookingService.getHotelReservationByUser is unimplemented"))

    /**
     * Returns the response to an RPC for bookingSystem.BookingService.rentCar.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun rentCar(request: Booking.CarBookingRequest): Booking.BookingResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method bookingSystem.BookingService.rentCar is unimplemented"))

    /**
     * Returns the response to an RPC for bookingSystem.BookingService.getCarBookingByUser.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getCarBookingByUser(request: Booking.UserIdRequest):
        Booking.BookingResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method bookingSystem.BookingService.getCarBookingByUser is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BookingServiceGrpc.getAddFlightMethod(),
      implementation = ::addFlight
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BookingServiceGrpc.getSearchFlightMethod(),
      implementation = ::searchFlight
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BookingServiceGrpc.getBookFlightMethod(),
      implementation = ::bookFlight
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BookingServiceGrpc.getGetAllFlightsMethod(),
      implementation = ::getAllFlights
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BookingServiceGrpc.getGetFlightTicketForUserMethod(),
      implementation = ::getFlightTicketForUser
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BookingServiceGrpc.getAddHotelMethod(),
      implementation = ::addHotel
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BookingServiceGrpc.getSearchHotelMethod(),
      implementation = ::searchHotel
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BookingServiceGrpc.getBookHotelMethod(),
      implementation = ::bookHotel
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BookingServiceGrpc.getGetHotelReservationByUserMethod(),
      implementation = ::getHotelReservationByUser
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BookingServiceGrpc.getRentCarMethod(),
      implementation = ::rentCar
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = BookingServiceGrpc.getGetCarBookingByUserMethod(),
      implementation = ::getCarBookingByUser
    )).build()
  }
}
