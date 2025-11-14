package org.example.Lesson_20Practice

fun main() {
    val userName = "Вася"
    val getMessage = fun() = "С наступающим Новым Годом, $userName!"
    println(getMessage.invoke())
}