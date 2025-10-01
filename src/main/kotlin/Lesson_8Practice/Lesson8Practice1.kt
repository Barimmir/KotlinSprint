package org.example.Lesson_8Practice

fun main() {
    val viewsPerDay1 = 20
    val viewsPerDay2 = 18
    val viewsPerDay3 = 35
    val viewsPerDay4 = 26
    val viewsPerDay5 = 30
    val viewsPerDay6 = 42
    val viewsPerDay7 = 19

    val viewsArray =
        arrayOf(viewsPerDay1, viewsPerDay2, viewsPerDay3, viewsPerDay4, viewsPerDay5, viewsPerDay6, viewsPerDay7)
    println("Просмотров за неделю: ${viewsArray.sum()}")
}