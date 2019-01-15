package com.example.gevikvalijani.presenter.di.module

import android.app.Application
import com.example.gevikvalijani.data.network.AuthorizedNetworkInterceptor
import com.example.gevikvalijani.data.network.CarHubService
import com.example.gevikvalijani.presenter.di.scope.ApplicationScope
import dagger.Module
import dagger.Provides
import okhttp3.Cache
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import timber.log.Timber
import java.io.File
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
class NetworkModule {
    companion object {
        private const val TIMEOUT = 10L // 10s
    }

    @Provides
    @Singleton
    fun retrofit(okHttpClient: OkHttpClient): Retrofit = Retrofit.Builder()
            .baseUrl(CarHubService.BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()

    @Provides
        fun provideHttpLoggingInterceptor(): HttpLoggingInterceptor {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        return httpLoggingInterceptor
    }



    @Provides
    @Singleton
    public fun okHttpClient(httpLoggingInterceptor: HttpLoggingInterceptor): OkHttpClient {
        val okHttpClientBuilder = OkHttpClient.Builder()
        okHttpClientBuilder.connectTimeout(TIMEOUT, TimeUnit.SECONDS)
        okHttpClientBuilder.readTimeout(TIMEOUT, TimeUnit.SECONDS)
        okHttpClientBuilder.writeTimeout(TIMEOUT, TimeUnit.SECONDS)
        okHttpClientBuilder.addInterceptor(httpLoggingInterceptor)
        return okHttpClientBuilder.build()
    }
    @Provides
    open fun provideCarHubService(retrofit: Retrofit): CarHubService {
        return retrofit.create(CarHubService::class.java)
    }

}