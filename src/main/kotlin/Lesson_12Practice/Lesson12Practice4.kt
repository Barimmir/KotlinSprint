package org.example.Lesson_12Practice

class WeatherDay4(kelvinDayTemperature: Int, kelvinNightTemperature: Int, isPrecipitation: Boolean) {
    val celsiusDayTemperature = (kelvinDayTemperature - CONVERTING_KELVIN_TO_CELSIUS2).toInt()
    val celsiusNightTemperature = (kelvinNightTemperature - CONVERTING_KELVIN_TO_CELSIUS2).toInt()
    val isPrecipitation = isPrecipitation

    fun printInfo() {
        println(
            "Температура днём: $celsiusDayTemperature\n" +
                    "Температура ночью: $celsiusNightTemperature\n" +
                    "Осадки: $isPrecipitation"
        )
    }

    init {
        printInfo()
    }
}

fun main() {
    val day = WeatherDay4(
        kelvinDayTemperature = 340,
        kelvinNightTemperature = 270,
        isPrecipitation = false,
    )
}

const val CONVERTING_KELVIN_TO_CELSIUS2 = 273.15