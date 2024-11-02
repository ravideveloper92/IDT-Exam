package com.example.myapplication.network

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import hu.akarnokd.rxjava3.retrofit.RxJava3CallAdapterFactory
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton



@Module
@InstallIn(SingletonComponent::class)
internal object NetworkModule {
    @Provides
    @Singleton
    fun provideStatesAPIService(): StatesAPIService {
       val  httpClient: OkHttpClient.Builder  = OkHttpClient.Builder()
           .connectTimeout(5, TimeUnit.SECONDS) // Connection timeout .readTimeout(30, TimeUnit.SECONDS)
           .readTimeout(5, TimeUnit.SECONDS) // Connection timeout .readTimeout(30, TimeUnit.SECONDS).connectTimeout(5, TimeUnit.SECONDS) // Connection timeout .readTimeout(30, TimeUnit.SECONDS)
        return Retrofit.Builder()
            .baseUrl("http://pos.idtretailsolutions.com/countytest/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .client(httpClient.build())
            .build()
            .create(StatesAPIService::class.java)
    }
}