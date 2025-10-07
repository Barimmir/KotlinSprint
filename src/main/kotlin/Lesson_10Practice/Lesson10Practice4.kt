package org.example.Lesson_10Practice

fun main() {
    val humanPlayer = "Мешок с костями"
    val botPlayer = "Жестянка с авито"
    var humanWin = 0
    do {
        val resultHuman = rollTheDice()
        val resultBot = rollTheDice()
        playARound(humanPlayer, botPlayer, resultHuman, resultBot)
        humanWin = countingVictoriesHuman(humanWin, resultHuman, resultBot)
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        val againRound = readln() == "Да"
    } while (againRound == true)
    println("Челоняк победил раундов: $humanWin")
}

fun countingVictoriesHuman(victories: Int, resultHuman: Int, resultBot: Int): Int {
    return if (resultHuman > resultBot) {
        victories + 1
    } else {
        victories
    }
}

fun rollTheDice(): Int = (1..6).random()
fun playARound(humanPlayer: String, botPlayer: String, resultHuman: Int, resultBot: Int) {

    println(
        "$humanPlayer бросает: $resultHuman\n" +
                "$botPlayer бросает: $resultBot"
    )
    when {
        resultHuman > resultBot -> println("Мешок с костями победил")
        resultBot > resultHuman -> println("Банка с авито победила")
        else -> println("Инвалидная ничья")
    }
}