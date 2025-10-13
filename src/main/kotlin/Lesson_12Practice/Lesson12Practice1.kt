package org.example.Lesson_12Practice

class WeatherDay() {
    var tempDay = 10
    var tempNight = 0
    var precipitation = false

    fun printInfo() {
        println(
            "Температура днём: $tempDay\n" +
                    "Температура ночью: $tempNight\n" +
                    "Осадки: $precipitation"
        )
    }
}

fun main() {
    val day1 = WeatherDay()
    day1.tempDay = 5
    day1.tempNight = -5
    day1.precipitation = true
    val day2 = WeatherDay()
    day2.tempDay = 15
    day2.tempNight = 3
    day2.precipitation = false

    day1.printInfo()
    day2.printInfo()
}