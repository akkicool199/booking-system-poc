package com.project.bookingsystem.service.impl

import com.project.bookingsystem.dao.impl.CarDaoImpl
import com.project.bookingsystem.document.CarTicket
import com.project.bookingsystem.service.CarRentalService
import com.project.bookingsystem.util.DatabaseConnectionUtil
import com.mongodb.client.MongoCollection
import org.bson.Document

class CarRentalServiceImpl : CarRentalService {
    val database = DatabaseConnectionUtil().getDatabase()
    val carCollection: MongoCollection<Document> = database.getCollection("car")
    val carDao = CarDaoImpl(carCollection)

    override suspend fun rentACar(carTicket: CarTicket, collectionName: String): CarTicket {
        return carDao.rentACar(database, carTicket, collectionName)
    }

    override suspend fun getCarBookingByUser(carCollection: MongoCollection<Document>, userName: String): CarTicket {
        return carDao.getCarBookingByUser(carCollection, userName)
    }
}