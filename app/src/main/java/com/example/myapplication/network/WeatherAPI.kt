package com.example.myapplication.network

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherAPI {
    @GET("forecast")
    fun getWeatherData(
        @Query("access_key") access_key: String,
        @Query("query") query: String,
        @Query("forecast_days") forecast_days: Int,
        @Query("hourly") hourly: Int,
    ): Call<WeatherData?>
}