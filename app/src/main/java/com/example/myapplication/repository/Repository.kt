package com.example.myapplication.repository

import com.example.myapplication.network.StatesAPIService
import io.reactivex.rxjava3.core.Observable
import retrofit2.Response
import javax.inject.Inject


class Repository  @Inject constructor(apiService: StatesAPIService) {
    public val apiService: StatesAPIService

    init {
        this.apiService = apiService
    }

}