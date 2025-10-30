package org.example.Lesson_16Practice

import kotlin.math.pow

class Circle(
    private val radius: Double,
) {
    fun getPerimeter(): Double {
        return 2 * PI * radius
    }

    fun getArea(): Double {
        return PI * radius.pow(2)
    }
}

fun main() {
    val circle = Circle(3.0)
    println("Длина окружности: ${circle.getPerimeter()}")
    println("Площадь круга: ${circle.getArea()}")
}

private const val PI = 3.14
