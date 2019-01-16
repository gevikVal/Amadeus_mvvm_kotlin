package com.example.gevikvalijani.presenter.di.module

import android.content.Context
import com.example.gevikvalijani.data.network.CarHubService
import com.example.gevikvalijani.data.repositories.car.CarDataSourceContract
import com.example.gevikvalijani.data.repositories.car.CarRemoteDataSource
import com.example.gevikvalijani.data.repositories.car.CarRepository
import com.example.gevikvalijani.domain.usecases.CarUseCase
import dagger.Module
import dagger.Provides

@Module
class CarModule {
    @Provides
    fun provideCarRepository(carDataSourceContract: CarDataSourceContract.RemoteDataSource): CarDataSourceContract.CarRepository {
        return CarRepository(carDataSourceContract)
    }

    @Provides
    fun provideCarRemoteDataSource(carHubService: CarHubService): CarDataSourceContract.RemoteDataSource {
        return CarRemoteDataSource(carHubService)
    }

    @Provides
    fun provideCarUseCase(carRepository: CarRepository): CarUseCase {
        return CarUseCase(carRepository)
    }
}