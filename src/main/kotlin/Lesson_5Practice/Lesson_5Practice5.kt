package org.example.Lesson_5Practice


fun main() {

    val randomNumbers = List(3) { (1..MAX_NUMBER).random() }

    println(
        "Добро пожаловтаь к богу рандома!\n" +
                "Попробуй угадать три числа от 0 до $MAX_NUMBER!\n" +
                "И помни, удача уважает удачливых!"
    )

    val userNumbers = mutableListOf<Int>()
    for (num in 1..3) {
        println("Введите число $num:")
        val inputUser = readlnOrNull()?.toIntOrNull()


        if (inputUser == null || inputUser !in 0..42) {
            println(
                "Даже для удачливого это слишком!\n" +
                        "Вводи корректные числа!"
            )
            return
        }
        userNumbers.add(inputUser)
    }
    val scan = randomNumbers.intersect(userNumbers.toSet())
    val result = scan.size

    when (result) {
        3 -> println("Джекпот! Ты самый удачливый на Земле!")
        2 -> println("Неплохо! Два числа угаданы, а ты выйграл курпный приз!")
        1 -> println(
            "Лучше чем ничего! Ты угадал одно число и утешительный приз твой!\n" +
                    "Тебя ведь мама всегда так называла?"
        )

        0 -> println(
            "Удача любит удачливых, но видимо тебя никто не любит!\n" +
                    "Ноль угаданных чисел!"
        )
    }
    println("\nВыйгрышные числа: ${randomNumbers.sorted().joinToString(", ")}")
    println("Твои числа: ${userNumbers.sorted().joinToString(", ")}")
    println("Совпадения: ${scan.sorted().joinToString(", ")}")
}

const val MAX_NUMBER = 42