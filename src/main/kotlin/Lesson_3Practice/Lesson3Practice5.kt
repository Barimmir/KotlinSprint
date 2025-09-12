package org.example.Lesson_3Practice

fun main() {

    val messageServer = "D2-D4;0"

    val separation = messageServer.split("-",";")

    val start = separation[0]
    val end = separation[1]
    val numberMove = separation[2]

    println("Откуда: $start")
    println("Куда: $end")
    println("Номер хода: $numberMove")
}