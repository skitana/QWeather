package com.example.myapplication.network

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WeatherData(
    @SerialName(value = "current")
    val current: CurrentWeatherData,
)