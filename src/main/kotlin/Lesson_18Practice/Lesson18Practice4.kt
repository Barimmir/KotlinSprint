package org.example.Lesson_18Practice

abstract class Box(
    open val name: String,
) {
    open fun getSquare(): Int? = null
}

open class Rectangle(
    override val name: String,
    private val length: Int,
    private val width: Int,
    private val height: Int,
) : Box(name) {
    override fun getSquare(): Int {
        val square = FACETS_RECTANGLE * (length * width + width * height + height * length)
        return square
    }
}

class Cube(
    override val name: String,
    private val ribLength: Int,
) : Rectangle(name, ribLength, ribLength, ribLength)

fun main() {
    val boxList = listOf(
        Rectangle("прямоугольника", 2, 3, 4),
        Cube("куба", 6)
    )
    boxList.forEach { println("Площадь поверхности ${it.name}: ${it.getSquare()}") }
}

const val FACETS_RECTANGLE = 2