package org.example.Lesson4Practice

fun main() {

    println("Есть ли порвеждения корпуаса?(true/false)")
    val broken = readln().toBoolean()
    println("Количество человек на борту?")
    val crew = readln().toInt()
    println("Количсетво ящиков с провизией?")
    val provisions = readln().toInt()
    println("Погода благоприятная?(true/false)")
    val weather = readln().toBoolean()

    val result = ((broken == NO_DAMAGE && crew >= MIN_CREW && crew <= MAX_CREW
            && provisions > MIN_PROVISIONS && (weather == GOOD_WEATHER || weather == !GOOD_WEATHER))
            || (broken == !NO_DAMAGE && crew == MAX_CREW && provisions >= MIN_PROVISIONS
            && weather == GOOD_WEATHER))

    println("Корабль может лететь: $result")
}

const val NO_DAMAGE = true
const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_PROVISIONS = 50
const val GOOD_WEATHER = true

