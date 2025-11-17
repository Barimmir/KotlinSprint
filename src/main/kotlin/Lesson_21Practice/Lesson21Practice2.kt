package org.example.Lesson_21Practice

fun Int.evenNumbersSum(): Int {
    return this.toString().map { it.toString().toInt() }.filter { it % 2 == 0 }.sum()
}


fun main() {
    println(246.evenNumbersSum())
}