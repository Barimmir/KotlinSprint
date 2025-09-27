package org.example.Lesson_6Practice

fun main() {

    var fails = 5
    val randomNumber = (MIN_NUMBER2..MAX_NUMBER2).random()

    println(
        "Угадайте одно число от $MIN_NUMBER2 до $MAX_NUMBER2\n" +
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

const val MIN_NUMBER2 = 1
const val MAX_NUMBER2 = 9