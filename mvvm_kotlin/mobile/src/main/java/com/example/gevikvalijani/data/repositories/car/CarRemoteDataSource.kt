package com.example.gevikvalijani.data.repositories.car

import com.example.gevikvalijani.data.network.CarHubService
import com.example.gevikvalijani.data.response.Response
import io.reactivex.Single
import javax.inject.Inject

class CarRemoteDataSource @Inject constructor(var carHubService: CarHubService) : CarDataSourceContract.RemoteDataSource{

    override fun getCars(latitude: Double, longitude: Double, radius: Int, pickUp: String, dropOff: String): Single<Response> {
        return  carHubService.getCarReuslts("lsKrjCIrVeszpdElFFXGZbRRR6CdMY2G",latitude,longitude,radius,pickUp,dropOff)
    }
}