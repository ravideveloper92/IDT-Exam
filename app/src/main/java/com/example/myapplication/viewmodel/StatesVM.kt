package com.example.myapplication.viewmodel

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.model.DataWrapper
import com.example.myapplication.model.Response
import com.example.myapplication.model.StateDetails
import com.example.myapplication.repository.Repository
import com.google.gson.Gson
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import java.io.IOException
import java.net.SocketTimeoutException
import javax.inject.Inject


@HiltViewModel
class StatesVM  @Inject constructor(val repository: Repository,val context: Context) :
    ViewModel() {

    val statesList = MutableStateFlow<Response<List<StateDetails>>>(Response.Loading)


    val getStatesListLv: StateFlow<Response<List<StateDetails>>>
        get()=statesList

    @SuppressLint("CheckResult")
    fun fetchAllStatesList()
    {
        viewModelScope.launch {
            try {
                val status=repository.apiService.StatesList().isSuccessful
                if (status)
                {
                    repository.apiService.StatesList().body()?.let {
                        statesList.emit(Response.Success(it)) }
                }else{
                    getMockData()
                }
            } catch (e: SocketTimeoutException) {
                getMockData()
            }
        }
    }

    private suspend fun getMockData() {
        try {
            val jsonFileString = getJsonDataFromAsset(context, "stateapimock.json")
            if (jsonFileString?.isEmpty()?.not() == true) {
                val gson = Gson()
                var wrapper: DataWrapper? = gson.fromJson(
                    jsonFileString,
                    DataWrapper::class.java
                )
                wrapper?.data?.let {  statesList.emit(Response.Success(it)) }
                Log.i(TAG, "data" + jsonFileString)
            } else {
                statesList.emit(Response.Error(Exception("Something Went Wrong")))
            }
        } catch (e: Exception) {
            Log.d(TAG, "fetchAllStatesList ex : " + e.message)
        }
    }


    private val stateDetailsflow = MutableStateFlow<StateDetails?>(null)
    fun getSATScore(): MutableStateFlow<StateDetails?> {
        return stateDetailsflow
    }

  

    fun updateStates(stateDetails: StateDetails){
       viewModelScope.launch {  stateDetailsflow.emit(stateDetails) }
    }

    companion object {
        private const val TAG = "StatesVM"
    }

    private fun getJsonDataFromAsset(context: Context, fileName: String): String? {
        val jsonString: String
        try {
            jsonString = context.assets.open(fileName).bufferedReader().use { it.readText() }

        } catch (ioException: IOException) {
            ioException.printStackTrace()
            return null
        }
        return jsonString
    }

}