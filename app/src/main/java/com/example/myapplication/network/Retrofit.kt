package com.example.myapplication.network

import retrofit2.Retrofit
import retrofit2.Retrofit.Builder
import retrofit2.converter.gson.GsonConverterFactory

class Retrofit {

    var retrofit: Retrofit = Builder()
        .baseUrl("http://api.weatherstack.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    var api: WeatherAPI = retrofit.create(WeatherAPI::class.java)

}