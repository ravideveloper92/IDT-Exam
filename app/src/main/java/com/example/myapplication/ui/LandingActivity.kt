package com.example.myapplication.ui

import android.os.Bundle
import androidx.activity.viewModels

import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import com.example.myapplication.viewmodel.StatesVM

import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class LandingActivity : AppCompatActivity() {
    private val viewModel: StatesVM by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}



