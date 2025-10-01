package org.example.Lesson4Practice

fun main() {

    val weather = true
    val awning = true
    val humidity = 20
    val timeOfYear = "Зима"

    val result: Boolean = (weather == WEATHER) && (awning == AWNING) && (humidity == HUMIDITY)
            && (timeOfYear == TIME_OF_YEAR)

    println("Благоприятные ли условия сейчас для роста бобовых? $result")
}

const val WEATHER: Boolean = true
const val AWNING: Boolean = true
const val HUMIDITY: Int = 20
const val TIME_OF_YEAR: String = "Не зима"