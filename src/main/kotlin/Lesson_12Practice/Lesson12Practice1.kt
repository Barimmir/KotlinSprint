package org.example.Lesson_12Practice

class WeatherDay{
    var dayTemperature = 10
    var nightTemperature = 0
    var isPrecipitation = false

    fun printInfo() {
        println(
            "Температура днём: $dayTemperature\n" +
                    "Температура ночью: $nightTemperature\n" +
                    "Осадки: $isPrecipitation"
        )
    }
}

fun main() {
    val day1 = WeatherDay()
    day1.dayTemperature = 5
    day1.nightTemperature = -5
    day1.isPrecipitation = true
    val day2 = WeatherDay()
    day2.dayTemperature = 15
    day2.nightTemperature = 3
    day2.isPrecipitation = false

    day1.printInfo()
    day2.printInfo()
}