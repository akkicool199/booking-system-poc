// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: booking.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package bookingSystem;

@kotlin.jvm.JvmName("-initializeempty")
public inline fun empty(block: bookingSystem.EmptyKt.Dsl.() -> kotlin.Unit): bookingSystem.Booking.Empty =
  bookingSystem.EmptyKt.Dsl._create(bookingSystem.Booking.Empty.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `bookingSystem.Empty`
 */
public object EmptyKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: bookingSystem.Booking.Empty.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: bookingSystem.Booking.Empty.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): bookingSystem.Booking.Empty = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun bookingSystem.Booking.Empty.copy(block: `bookingSystem`.EmptyKt.Dsl.() -> kotlin.Unit): bookingSystem.Booking.Empty =
  `bookingSystem`.EmptyKt.Dsl._create(this.toBuilder()).apply { block() }._build()

