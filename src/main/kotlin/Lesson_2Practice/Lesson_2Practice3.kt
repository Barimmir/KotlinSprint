package org.example.Lesson_2Practice

fun main() {

    val hour = 9
    val minute = 39
    val travelTime = 457
    val overMinute = hour * 60 + minute + travelTime
    val arrivalHour = overMinute / 60 % 24
    val arrivalMinute = overMinute % 60

    print(arrivalHour)
    print(":")
    print(arrivalMinute)
}