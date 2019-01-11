package com.example.gevikvalijani.data.network

import com.example.gevikvalijani.data.response.Response
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface CarHubService {
    companion object {
        val BASE_URL = "https://api.sandbox.amadeus.com/v1.2/cars/"
    }

    @GET("search-circle")
    fun getCarReuslts(@Query("apikey") apikey: String,
                      @Query("latitude") latitude: Double,
                      @Query("longitude") longitude: Double,
                      @Query("radius") radius: Int,
                      @Query("pick_up") pick_up: String,
                      @Query("drop_off") drop_off: String): Single<Response>
}