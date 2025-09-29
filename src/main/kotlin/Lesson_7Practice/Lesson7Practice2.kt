package org.example.Lesson_7Practice

fun main() {

    var counter = 3

    while (counter > 0) {
        val range = (1000..9999).random()
        println(
            "Ваш код авторизации: $range\n\n" +
                    "Введите код:"
        )
        val code = readln().toInt()
        if (code == range) {
            println("Код введён верно, добро пожаловать!")
            return
        } else {
            counter--
            println("Неверно!")
            continue
        }
    }
}