package com.example.myapplication.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\tH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/example/myapplication/network/WeatherAPI;", "", "getWeatherData", "Lretrofit2/Call;", "Lcom/example/myapplication/network/WeatherData;", "access_key", "", "query", "forecast_days", "", "hourly", "app_debug"})
public abstract interface WeatherAPI {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "forecast")
    public abstract retrofit2.Call<com.example.myapplication.network.WeatherData> getWeatherData(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "access_key")
    java.lang.String access_key, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "query")
    java.lang.String query, @retrofit2.http.Query(value = "forecast_days")
    int forecast_days, @retrofit2.http.Query(value = "hourly")
    int hourly);
}