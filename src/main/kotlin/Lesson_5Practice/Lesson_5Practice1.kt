package org.example.Lesson_5Practice

fun main() {

    val num1 = 2
    val num2 = 3
    val sum = num1 + num2
    println(
        "Пожалуйста, решите пример:\n" +
                "$num1 + $num2 ="
    )
    val answer = readln().toInt()
    if (answer == sum) {
        println("Добро пожаловать мешок с костями!")
    } else {
        println("Иди своей дорогой сталкер,тебе здесь не рады!")
    }
}