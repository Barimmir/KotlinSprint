package org.example.Lesson_5Practice

fun main() {

    val year = 2025

    println("Введите год своего рождения:")
    val bornYear = readln().toInt()

    if (bornYear <= (year - AGE_OF_MAJORITY)) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Расти малыш...")
    }
}

const val AGE_OF_MAJORITY = 18
