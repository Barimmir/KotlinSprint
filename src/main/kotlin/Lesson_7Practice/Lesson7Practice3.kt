package org.example.Lesson_7Practice

fun main() {

    println(
        "Здравствуйте, введите чётное число до которого\n" +
                "надо простроить прогрессию: "
    )
    val input = readln().toInt()
    for (range in 0..input step 2) {
        println(range)
    }
}