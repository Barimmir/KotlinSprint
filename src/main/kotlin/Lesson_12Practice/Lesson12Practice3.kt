package org.example.Lesson_12Practice

class WeatherDay3(kelvinDayTemperature: Int, kelvinNightTemperature: Int, isPrecipitation: Boolean) {
    val celsiusDayTemperature = (kelvinDayTemperature - CONVERTING_KELVIN_TO_CELSIUS).toInt()
    val celsiusNightTemperature = (kelvinNightTemperature - CONVERTING_KELVIN_TO_CELSIUS).toInt()
    val isPrecipitation = isPrecipitation

    fun printInfo() {
        println(
            "Температура днём: $celsiusDayTemperature\n" +
                    "Температура ночью: $celsiusNightTemperature\n" +
                    "Осадки: $isPrecipitation"
        )
    }
}

fun main() {
    val day = WeatherDay3(
        kelvinDayTemperature = 290,
        kelvinNightTemperature = 270,
        isPrecipitation = false
    )
    day.printInfo()
}
const val CONVERTING_KELVIN_TO_CELSIUS = 273.15