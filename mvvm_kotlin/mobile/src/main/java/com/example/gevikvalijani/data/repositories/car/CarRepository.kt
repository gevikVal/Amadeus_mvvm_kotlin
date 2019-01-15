package com.example.gevikvalijani.data.repositories.car

import com.example.gevikvalijani.data.response.Response
import io.reactivex.Single
import javax.inject.Inject

class CarRepository @Inject constructor(var carRemoteDataSource: CarDataSourceContract.RemoteDataSource) : CarDataSourceContract.CarRepository {
    override fun getCars(latitude: Double, longitude: Double, radius: Int, pickUp: String, dropOff: String): Single<Response> {
        return carRemoteDataSource.getCars(latitude, longitude, radius, pickUp, dropOff)
    }
}