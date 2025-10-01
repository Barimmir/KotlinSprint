package org.example.Lesson4Practice

fun main() {

    val trainingDay = 5

    val howTraining = trainingDay % 2 != 0

    println(
        "Упражнения для рук: $howTraining\n" +
                "Упражнения для ног: ${!howTraining}\n" +
                "Упражнения для спины: ${!howTraining}\n" +
                "Упражнения для пресса: $howTraining"
    )
}