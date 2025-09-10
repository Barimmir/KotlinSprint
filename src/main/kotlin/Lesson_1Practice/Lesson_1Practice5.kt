package org.example.Lesson_1Practice

fun main() {
    val seconds = 6480
    val minute: Int = seconds / 60
    val hour : Int = minute / 60
    val remainderMinute = minute - 60
    val remainderSecond  = seconds - minute * 60

    print("0")
    print(hour)
    print(":")
    print(remainderMinute)
    print(":")
    print(remainderSecond)
    print("0")

}