package org.example.Lesson_10Practice

fun main() {
    val humanPlayer = "Мешок с костями"
    val botPlayer = "Жестянка с авито"
    val resultHuman = rollTheDice()
    val resultBot = rollTheDice()
    println(
        "$humanPlayer бросает: ${resultHuman}\n" +
                "$botPlayer бросает: ${resultBot}"
    )
    when {
        resultHuman > resultBot -> println("Мешок с костями победил")
        resultBot > resultHuman -> println("Банка с авито победила")
        else -> println("Инвалидная ничья")
    }

}

fun rollTheDice(): Int = (1..6).random()

