// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: booking.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package bookingSystem;

@kotlin.jvm.JvmName("-initializesearchHotelRequest")
public inline fun searchHotelRequest(block: bookingSystem.SearchHotelRequestKt.Dsl.() -> kotlin.Unit): bookingSystem.Booking.SearchHotelRequest =
  bookingSystem.SearchHotelRequestKt.Dsl._create(bookingSystem.Booking.SearchHotelRequest.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `bookingSystem.SearchHotelRequest`
 */
public object SearchHotelRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: bookingSystem.Booking.SearchHotelRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: bookingSystem.Booking.SearchHotelRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): bookingSystem.Booking.SearchHotelRequest = _builder.build()

    /**
     * `string hotel_location = 1;`
     */
    public var hotelLocation: kotlin.String
      @JvmName("getHotelLocation")
      get() = _builder.getHotelLocation()
      @JvmName("setHotelLocation")
      set(value) {
        _builder.setHotelLocation(value)
      }
    /**
     * `string hotel_location = 1;`
     */
    public fun clearHotelLocation() {
      _builder.clearHotelLocation()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun bookingSystem.Booking.SearchHotelRequest.copy(block: `bookingSystem`.SearchHotelRequestKt.Dsl.() -> kotlin.Unit): bookingSystem.Booking.SearchHotelRequest =
  `bookingSystem`.SearchHotelRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

