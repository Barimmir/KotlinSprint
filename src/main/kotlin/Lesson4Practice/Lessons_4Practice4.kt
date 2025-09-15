package org.example.Lesson4Practice

fun main() {

    val trainingDay = 5

    val arms = trainingDay % 2 == 1
    val legs = trainingDay % 2 == 0
    val back = trainingDay % 2 == 0
    val abs = trainingDay % 2 == 1

    println(
        "Упражнения для рук: $arms\n" +
                "Упражнения для ног: $legs\n" +
                "Упражнения для спины: $back\n" +
                "Упражнения для пресса: $abs"
    )

}