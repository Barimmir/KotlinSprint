package org.example.Lesson_7Practice

fun main() {
    println("Введите количество секунд которое надо засечь:")
    val second = readln().toInt()

    for (second in second downTo 0) {
        Thread.sleep(MILLISECONDS)
        println("Осталось секунд: $second")
    }
    println("Время вышло!")
}
const val MILLISECONDS = 1000L