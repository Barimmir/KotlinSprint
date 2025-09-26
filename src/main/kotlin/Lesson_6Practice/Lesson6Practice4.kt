package org.example.Lesson_6Practice

fun main() {

    var fails = 5
    val randomNumber = (MAX_NUMBER..MAX_NUMBER).random()

    println(
        "Угадайте одно число от $MIN_NUMBER до $MAX_NUMBER\n" +
                "У вас $fails попыток"
    )
    while (fails > 0) {
        println("Введите число:")
        var number = readln().toIntOrNull()
        when {
            number == null -> {
                println("Ошибка, введите корректное число")
                continue
            }

            number == randomNumber -> {
                println("Это была великолепная игра")
                return
            }

            else -> {
                fails--
                if (fails > 0) {
                    println("Неверно! Осталось попыток: $fails")
                }
            }
        }
    }
    println("Попытки кончились! Было загаданно число: $randomNumber")

}

const val MIN_NUMBER = 1
const val MAX_NUMBER = 9