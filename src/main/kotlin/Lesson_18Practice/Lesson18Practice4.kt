package org.example.Lesson_18Practice

abstract class Box() {
    open fun getSquare() {}
}

class Rectangle(
    private val length: Int,
    private val width: Int,
    private val height: Int,
) : Box() {
    override fun getSquare() {
        println("Площадь поверхности прямоугольника: ${FACETS_RECTANGLE * (length * width + width * height + height * length)}")
    }
}

class Cube(
    private val ribLength: Int,
) : Box() {
    override fun getSquare() {
        println("Площадь поверхности куба: ${FACETS_CUBE * (ribLength * ribLength)}")
    }
}

fun main() {
    val boxList = listOf(Rectangle(2, 3, 4), Cube(6))
    boxList.forEach { it.getSquare() }
}

const val FACETS_RECTANGLE = 2
const val FACETS_CUBE = 6