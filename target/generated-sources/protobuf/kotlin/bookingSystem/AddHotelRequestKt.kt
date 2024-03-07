// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: booking.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package bookingSystem;

@kotlin.jvm.JvmName("-initializeaddHotelRequest")
public inline fun addHotelRequest(block: bookingSystem.AddHotelRequestKt.Dsl.() -> kotlin.Unit): bookingSystem.Booking.AddHotelRequest =
  bookingSystem.AddHotelRequestKt.Dsl._create(bookingSystem.Booking.AddHotelRequest.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `bookingSystem.AddHotelRequest`
 */
public object AddHotelRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: bookingSystem.Booking.AddHotelRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: bookingSystem.Booking.AddHotelRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): bookingSystem.Booking.AddHotelRequest = _builder.build()

    /**
     * `.bookingSystem.Hotel hotel = 1;`
     */
    public var hotel: bookingSystem.HotelOuterClass.Hotel
      @JvmName("getHotel")
      get() = _builder.getHotel()
      @JvmName("setHotel")
      set(value) {
        _builder.setHotel(value)
      }
    /**
     * `.bookingSystem.Hotel hotel = 1;`
     */
    public fun clearHotel() {
      _builder.clearHotel()
    }
    /**
     * `.bookingSystem.Hotel hotel = 1;`
     * @return Whether the hotel field is set.
     */
    public fun hasHotel(): kotlin.Boolean {
      return _builder.hasHotel()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun bookingSystem.Booking.AddHotelRequest.copy(block: `bookingSystem`.AddHotelRequestKt.Dsl.() -> kotlin.Unit): bookingSystem.Booking.AddHotelRequest =
  `bookingSystem`.AddHotelRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val bookingSystem.Booking.AddHotelRequestOrBuilder.hotelOrNull: bookingSystem.HotelOuterClass.Hotel?
  get() = if (hasHotel()) getHotel() else null
