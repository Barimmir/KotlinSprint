package org.example.Lesson_16Practice

import kotlin.math.pow

class Circle(
    private val radius: Int,
) {
    private val pi = 3.14

    fun perimeter() {
        println("Длина окружности: ${(pi * radius).pow(2)}")
    }

    fun area() {
        println("Площадь круга: ${pi * (radius * radius)}")
    }
}

fun main() {
    val circle = Circle(3)
    circle.perimeter()
    circle.area()
}
