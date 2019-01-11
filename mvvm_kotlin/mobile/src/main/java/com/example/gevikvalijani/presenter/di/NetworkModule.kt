package com.example.gevikvalijani.presenter.di

import android.app.Application
import com.example.gevikvalijani.data.network.AuthorizedNetworkInterceptor
import com.example.gevikvalijani.data.network.CarHubService
import dagger.Provides
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import timber.log.Timber
import java.io.File
import java.util.concurrent.TimeUnit

class NetworkModule {
    companion object {
        private const val TIMEOUT = 10L // 10s
    }

    @Provides
    fun provideCash(application: Application): Cache? {
        val cacheSize = 10 * 1024 * 1024 // 10MB
        var cache: Cache? = null
        // Install an HTTP cache in the application cache directory.
        try {
            val cacheDir = File(application.cacheDir, "http")
            cache = Cache(cacheDir, cacheSize.toLong())
        } catch (e: Exception) {
            Timber.e(e, "Unable to install disk cache.")
        }

        return cache
    }

    @Provides
    fun provideHttpLoggingInterceptor(): HttpLoggingInterceptor {
        var httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        return httpLoggingInterceptor
    }

    @Provides
    fun porvideOkHttpClient(cache: Cache, authorizedNetworkInterceptor: AuthorizedNetworkInterceptor, httpLoggingInterceptor: HttpLoggingInterceptor): OkHttpClient {
        val okHttpClientBuilder = OkHttpClient.Builder()
        okHttpClientBuilder.cache(cache)
        okHttpClientBuilder.connectTimeout(TIMEOUT, TimeUnit.SECONDS)
        okHttpClientBuilder.readTimeout(TIMEOUT, TimeUnit.SECONDS)
        okHttpClientBuilder.writeTimeout(TIMEOUT, TimeUnit.SECONDS)

        if (authorizedNetworkInterceptor != null) {
            okHttpClientBuilder.addNetworkInterceptor(authorizedNetworkInterceptor)
        }
        okHttpClientBuilder.addInterceptor(httpLoggingInterceptor)
        return okHttpClientBuilder.build()
    }

    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(CarHubService.BASE_URL)
                .client(okHttpClient)
                .build()
    }

}