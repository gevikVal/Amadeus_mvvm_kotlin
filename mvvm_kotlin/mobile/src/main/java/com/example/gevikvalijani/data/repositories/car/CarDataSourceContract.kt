package com.example.gevikvalijani.data.repositories.car

import io.reactivex.Single
import okhttp3.Response

interface CarDataSourceContract {

    interface CarRepository {
        fun getCars(latitude: Double, longitude: Double, radius: Int, pickUp: String, dropOff: String): Single<com.example.gevikvalijani.data.response.Response>
    }

    interface RemoteDataSource {
        fun getCars(latitude: Double, longitude: Double, radius: Int, pickUp: String, dropOff: String): Single<com.example.gevikvalijani.data.response.Response>
    }
}