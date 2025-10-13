package org.example.Lesson_12Practice

class WeatherDay2(_tempDay: Int, _tempNight: Int, _precipitation: Boolean,) {
    var tempDay = _tempDay
    var tempNight = _tempNight
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
    val day1 = WeatherDay2(
        _tempDay = 3,
        _tempNight = -10,
        _precipitation = true
    )
    day1.printInfo()
}