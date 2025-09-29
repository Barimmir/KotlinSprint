package org.example.Lesson_7Practice

fun main() {

    println("Введите количество секунд которое надо засечь:")
    val input = readln().toInt()

    for (second in input downTo 0) {
        Thread.sleep(1000)
        println("Осталось секунд: $second")
    }
    println("Время вышло!")
}