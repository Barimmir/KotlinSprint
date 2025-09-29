package org.example.Lesson_7Practice

fun main() {
    val range1 = 'A'..'Z'
    val range2 = 'a'..'z'
    val range3 = '1'..'9'

    val listRange = mutableListOf<Char>()
    listRange.addAll(range1)
    listRange.addAll(range2)
    listRange.addAll(range3)

    println("Задайте длинну пароля:")
    val input = readln().toInt()

    val password = List(input) { listRange.random() }.joinToString("")

    println(password)
}