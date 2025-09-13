package org.example.Lesson_2Practice

fun main() {

    val hour = 9
    val minute = 39
    val travelTime = 457
    val overMinute = hour * MIN_AND_HOUR + minute + travelTime
    val arrivalHour = overMinute / MIN_AND_HOUR % HOUR_AND_DAY
    val arrivalMinute = overMinute % SEC_AND_MIN

    print(arrivalHour)
    print(":")
    print(arrivalMinute)
}

const val MIN_AND_HOUR = 60
const val SEC_AND_MIN = 60
const val HOUR_AND_DAY = 24