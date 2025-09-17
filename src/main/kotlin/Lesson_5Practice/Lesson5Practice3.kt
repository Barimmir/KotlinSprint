package org.example.Lesson_5Practice

fun main() {

    val numberWin1 = 17
    val numberWin2 = 5

    println(
        "Угадайте два числа от $MIN_NUMBER до $MAX_NUMBER для победы!\n" +
                "Введите первое число:"
    )
    val number1 = readln().toInt()

    println("Введите второе число:")
    val number2 = readln().toInt()

    if (number1 == numberWin1 && number2 == numberWin2) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if ((number1 == numberWin1 && number2 != numberWin2) ||
        (number1 != numberWin1 && number2 == numberWin2)
    ) {
        println("Вы выиграли утешительный приз!")
        println("Правильные числа были $numberWin1 и $numberWin2")
    } else {
        println("Неудача!")
        println("Правильные числа были $numberWin1 и $numberWin2")
    }
}

const val MIN_NUMBER = 0
const val MAX_NUMBER = 42