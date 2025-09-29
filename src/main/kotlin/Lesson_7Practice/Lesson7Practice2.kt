package org.example.Lesson_7Practice

fun main() {

    do {
        val authCode = (1000..9999).random()
        println(
            "Ваш код авторизации: $authCode\n\n" +
                    "Введите код:"
        )
        val code = readln().toInt()
    } while (authCode != code)
    println("Код введён верно, добро пожаловать!")
}