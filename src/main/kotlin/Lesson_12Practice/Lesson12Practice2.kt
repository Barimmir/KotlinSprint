package org.example.Lesson_12Practice

class WeatherDay2(
    var dayTemperature: Int,
    var nightTemperature: Int,
    var isPrecipitation: Boolean
) {
    fun printInfo() {
        println(
            "Температура днём: $dayTemperature\n" +
                    "Температура ночью: $nightTemperature\n" +
                    "Осадки: $isPrecipitation"
        )
    }
}

fun main() {
    val day1 = WeatherDay2(
        dayTemperature = 3,
        nightTemperature = -10,
        isPrecipitation = true
    )
    day1.printInfo()
}