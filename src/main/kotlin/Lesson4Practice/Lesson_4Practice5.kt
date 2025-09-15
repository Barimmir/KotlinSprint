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

    val result = ((!broken && crew >= 55 && crew <= 70 && provisions > 50 && (weather || !weather))
            || (broken && crew == 70 && provisions >= 50 && weather))

    println("Корабль может лететь: $result")

}

