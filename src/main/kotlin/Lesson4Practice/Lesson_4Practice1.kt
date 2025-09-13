package org.example.Lesson4Practice

fun main() {

    val busyToday = 13
    val busyTomorrow = 9
    val seatsToday: Boolean = busyToday < TOTAL_SEATS
    val seatsTomorrow: Boolean = busyTomorrow < TOTAL_SEATS

    println("Доступность столиков на сегодня: $seatsToday\n" +
            "Доступность столиков на завтра: $seatsTomorrow")
}
const val TOTAL_SEATS = 13