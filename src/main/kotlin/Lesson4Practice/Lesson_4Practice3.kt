package org.example.Lesson4Practice

fun main() {

    val weather: Boolean = true
    val awning: Boolean = true
    val humidity: Int = 20
    val timeOfYear = "Зима"
    val result = weather && awning && humidity == 20 && timeOfYear != "Зима"

    println("Благоприятные ли условия сейчас для роста бобовых? $result")

}
