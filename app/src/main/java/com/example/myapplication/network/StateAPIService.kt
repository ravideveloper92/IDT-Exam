package com.example.myapplication.network

import com.example.myapplication.model.StateDetails
import retrofit2.Response
import retrofit2.http.GET

interface StatesAPIService {
    @GET("states")
    suspend fun StatesList() :Response<List<StateDetails>>

}