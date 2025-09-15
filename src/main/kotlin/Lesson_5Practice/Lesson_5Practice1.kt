package org.example.Lesson_5Practice

fun main() {

    println(
        "Пожалуйста, решите пример:\n" +
                "2 + 2 ="
    )
    val answer = readln().toInt()
    if (answer == 4) {
        println("Добро пожаловать мешок с костями!")
    } else{
        println("Иди своей дорогой сталкер,тебе здесь не рады!")
    }
}