package com.project.bookingsystem.dao

import com.project.bookingsystem.document.CarTicket
import com.mongodb.client.MongoCollection
import com.mongodb.client.MongoDatabase
import org.bson.Document

interface CarDao {
    fun rentACar(database: MongoDatabase, carTicket: CarTicket, collectionName: String): CarTicket

    fun getCarBookingByUser(carCollection: MongoCollection<Document>, userName: String): CarTicket
}