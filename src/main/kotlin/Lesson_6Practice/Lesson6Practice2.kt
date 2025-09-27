package org.example.Lesson_6Practice

fun main() {

    println("Введите количество секунд которое надо засечь:")
    val second = readln().toInt()

    Thread.sleep(second * 1000L)

    println("Прошло $second секунд")
}