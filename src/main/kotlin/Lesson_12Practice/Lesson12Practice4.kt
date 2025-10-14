package org.example.Lesson_12Practice

class WeatherDay4(_tempDay: Int, _tempNight: Int, _precipitation: Boolean) {
    var tempDay = (_tempDay - 273.15).toInt()
    var tempNight = (_tempNight - 273.15).toInt()
    var precipitation = _precipitation

    private fun printInfo() {
        println(
            "Температура днём: $tempDay\n" +
                    "Температура ночью: $tempNight\n" +
                    "Осадки: $precipitation"
        )
    }
    init {
        printInfo()
    }
}

fun main() {
    val day = WeatherDay4(
        _tempDay = 340,
        _tempNight = 270,
        _precipitation = false,
    )
}