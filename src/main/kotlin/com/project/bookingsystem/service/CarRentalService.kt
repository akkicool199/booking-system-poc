package com.project.bookingsystem.service

import com.project.bookingsystem.document.CarTicket
import com.mongodb.client.MongoCollection
import org.bson.Document

interface CarRentalService {

   suspend fun rentACar(carTicket: CarTicket, collectionName: String): CarTicket

   suspend fun getCarBookingByUser(carCollection: MongoCollection<Document>, userName: String): CarTicket

}