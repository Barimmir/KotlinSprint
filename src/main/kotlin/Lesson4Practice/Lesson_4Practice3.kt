package org.example.Lesson4Practice

fun main() {

    val result: Boolean = WEATHER && AWNING && HUMIDITY == 20 && TIME_OF_YEAR != "Зима"

    println("Благоприятные ли условия сейчас для роста бобовых? $result")
}

const val WEATHER: Boolean = true
const val AWNING: Boolean = true
const val HUMIDITY: Int = 20
const val TIME_OF_YEAR: String = "Зима"