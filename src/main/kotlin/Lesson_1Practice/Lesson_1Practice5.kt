package org.example.Lesson_1Practice

fun main() {
    val seconds = 6480
    val minute: Int = seconds / SEC_AND_MIN
    val hour : Int = minute / MIN_AND_HOUR
    val remainderMinute = minute % MIN_AND_HOUR
    val remainderSecond = seconds % SEC_AND_MIN
    val massage = String.format("O$hour:$remainderMinute:0$remainderSecond")

    println(massage)
}
const val SEC_AND_MIN = 60
const val MIN_AND_HOUR = 60

