package org.example.Lesson_5Practice

fun main() {

    val a = 2
    val b = 3
    val c = a + b
    println(
        "Пожалуйста, решите пример:\n" +
                "$a + $b ="
    )
    val answer = readln().toInt()
    if (answer == c) {
        println("Добро пожаловать мешок с костями!")
    } else {
        println("Иди своей дорогой сталкер,тебе здесь не рады!")
    }
}