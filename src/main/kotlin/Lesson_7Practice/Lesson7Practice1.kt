package org.example.Lesson_7Practice

fun main() {

    val symbol1 = ('a' .. 'z').random()
    val symbol2 = (1 ..9).random()
    val symbol3 = ('a' .. 'z').random()
    val symbol4 = (1 ..9).random()
    val symbol5 = ('a' .. 'z').random()
    val symbol6 = (1 ..9).random()

    println("Здравствуйте, ваш сегенерированный пароль: $symbol1$symbol2$symbol3$symbol4$symbol5$symbol6")
}