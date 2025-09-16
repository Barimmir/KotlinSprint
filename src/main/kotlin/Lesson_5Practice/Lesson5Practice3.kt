package org.example.Lesson_5Practice

fun main() {

    val numberWin1 = 5
    val numberWin2 = 17

    println(
        "Угадайте два числа от $MIN_NUMBER до $MAX_NUMBER для победы!\n" +
                "Введите первое число:"
    )
    val number1 = readln().toInt()

    println("Введите второе число:")
    val number2 = readln().toInt()

    if (number1 == numberWin2 && number2 == numberWin1) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if ((number1 == numberWin2 && number2 != numberWin1) ||
        (number1 != numberWin2 && number2 == numberWin1)
    ) {
        println("“Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }
}

const val MIN_NUMBER = 0
const val MAX_NUMBER = 42