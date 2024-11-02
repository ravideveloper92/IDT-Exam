package com.example.myapplication.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



data class StateDetails(
    @SerializedName("state")
    @Expose
    var state: String? = null,

    @SerializedName("population")
    @Expose
    var population: Int = 0,

    @SerializedName("counties")
    @Expose
    var counties: Int = 0
) {
    fun getStateP(): Pair<String, String> {
        return Pair("State Name:", state ?: "")
    }

    fun getPopulationP(): Pair<String, String> {
        return Pair("State overall population:", population.toString())
    }

    fun getCountiesP(): Pair<String, String> {
        return Pair("Number of counties:", counties.toString())
    }

    fun getStateDetailsP(): List<Pair<String, String>> {
        return listOf(getStateP(), getPopulationP(), getCountiesP())
    }
}

fun StateDetails.isSelected(row_states:StateDetails):Boolean {
   return this==row_states
}

