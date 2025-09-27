package org.example.Lesson_6Practice

fun main() {

    println("Введите количество секунд которое надо засечь:")
    var second = readln().toInt()

    while (second > 0) {
        println("Осталось секуннд: ${second--}")
        Thread.sleep(1000)
    }

    println("Время вышло")
}