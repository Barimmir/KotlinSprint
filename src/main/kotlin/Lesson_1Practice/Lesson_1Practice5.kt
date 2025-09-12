package org.example.Lesson_1Practice

fun main() {
    val seconds = 6480
    val minute: Int = seconds / secAndMin
    val hour : Int = minute / minAndHour
    val remainderMinute = minute % minAndHour
    val remainderSecond = seconds % secAndMin
    val massage = String.format("O$hour:$remainderMinute:0$remainderSecond")

    println(massage)
}
const val secAndMin = 60
const val minAndHour = 60
