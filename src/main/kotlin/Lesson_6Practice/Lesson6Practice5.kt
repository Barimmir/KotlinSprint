package org.example.Lesson_6Practice

fun main() {
    var fails = 3

    while (fails > 0) {
        val randomNumber1 = (MIN_NUMBER1..MAX_NUMBER1).random()
        val randomNumber2 = (MIN_NUMBER1..MAX_NUMBER1).random()
        val resultRandom = randomNumber1 + randomNumber2
        println(
            "Докажите что вы не бот. Решите пример:\n" +
                    "$randomNumber1 + $randomNumber2 = "
        )
        val userAnswer = readln().toIntOrNull()
        when {
            userAnswer == null -> {
                println("Ошибка, введите данные корректно")
                continue
            }

            userAnswer == resultRandom -> {
                println("Добро пожаловать!")
                return
            }

            else -> {
                fails--
                if (fails > 0) {
                    println("Неверно! У вас $fails попытки")
                }

            }
        }
    }
println("Доступ запрещен!")
}

const val MIN_NUMBER1 = 1
const val MAX_NUMBER1 = 9