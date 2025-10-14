package org.example.Lesson_12Practice

class WeatherDay3(_tempDay: Int, _tempNight: Int, _precipitation: Boolean,) {
    var tempDay = _tempDay - 273.15
    var tempNight = _tempNight - 273.15
    var precipitation = _precipitation

    fun printInfo() {
        println(
            "Температура днём: $tempDay\n" +
                    "Температура ночью: $tempNight\n" +
                    "Осадки: $precipitation"
        )
    }
}

fun main() {
    val day = WeatherDay3(
        _tempDay = 290,
        _tempNight = 270,
        _precipitation = false
    )
    day.printInfo()
}