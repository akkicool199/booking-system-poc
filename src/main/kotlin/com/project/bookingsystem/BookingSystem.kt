package com.project.bookingsystem

import com.project.bookingsystem.service.BookingSytemImpl
import io.grpc.ServerBuilder

fun main() {

    println("----------Welcome To Booking System----------")

    val bookingService = BookingSytemImpl() // Create an instance of the class

    val server = ServerBuilder
        .forPort(50051)
        .addService(bookingService)
        .build()

    server.start()

    println("Server started, listening on port ${server.port}")

    Runtime.getRuntime().addShutdownHook(Thread {
        println("Shutting down server...")
        server.shutdown()
    })

    server.awaitTermination()
}