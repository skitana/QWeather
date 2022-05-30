package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.network.Retrofit
import com.example.myapplication.network.WeatherData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var weatherTextView: TextView
    private lateinit var backgroundView: View

    private var hoursLive: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.text_view)
        weatherTextView = findViewById(R.id.weather_text_view)
        backgroundView = findViewById(R.id.background)

        val ticker = (0..Int.MAX_VALUE)
            .asSequence()
            .asFlow()
            .onEach { delay(1_000) }

        GlobalScope.launch {
            ticker.collect {
                val currentTime = Calendar.getInstance()
                val currentHours = currentTime.get(Calendar.HOUR_OF_DAY)
                if (hoursLive != currentHours) {
                    hoursLive = currentHours
                    generateScreenMessageAndColor()
                }
            }
        }

        GlobalScope.launch(Dispatchers.IO) {
            getAndSetWeatherData()
        }
    }

    private fun generateScreenMessageAndColor() {
        when (hoursLive) {
            in 0..5 -> {
                textView.text = resources.getString(R.string.good_night)
                backgroundView.setBackgroundColor(resources.getColor(R.color.teal_700, theme))
            }
            in 6..11 -> {
                textView.text = resources.getString(R.string.good_morning)
                backgroundView.setBackgroundColor(resources.getColor(R.color.teal_200, theme))
            }
            in 12..17 -> {
                textView.text = resources.getString(R.string.good_day)
                backgroundView.setBackgroundColor(resources.getColor(R.color.teal_200, theme))
            }
            in 18..23 -> {
                textView.text = resources.getString(R.string.good_evening)
                backgroundView.setBackgroundColor(resources.getColor(R.color.teal_700, theme))
            }
        }
    }

    private fun getAndSetWeatherData() {
        val call = Retrofit().api.getWeatherData(
            access_key = "148a4d9dcd55b4e48623ccc898a99a5b",
            query = "New York",
            forecast_days = 1,
            hourly = 1,
        )
        call.enqueue(object : Callback<WeatherData?> {
            override fun onResponse(call: Call<WeatherData?>, response: Response<WeatherData?>) {
                if (response.body() != null) {
                    weatherTextView.text = response.body()?.current?.temperature?.toString()
                }
            }

            override fun onFailure(call: Call<WeatherData?>, t: Throwable) {
                Toast.makeText(this@MainActivity, "Error weather", Toast.LENGTH_SHORT).show()
            }

        })
    }
}