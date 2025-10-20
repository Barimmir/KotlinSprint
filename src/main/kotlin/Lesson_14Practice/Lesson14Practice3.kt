package org.example.Lesson_14Practice

abstract class Figure(
    open val color: String,
) {
    abstract fun square(): Double
    abstract fun perimeter(): Double
}

class Circle(
    val radius: Int,
    override val color: String,
) : Figure(color) {
    override fun square(): Double {
        return MATH_PI * radius * radius
    }

    override fun perimeter(): Double {
        return IDENTICAL_SIDES_OF_A_RECTANGLE * MATH_PI * radius
    }

}

class Rectangle(
    val width: Int,
    val height: Int,
    override val color: String,
) : Figure(color) {
    override fun square(): Double {
        return (width * height).toDouble()
    }

    override fun perimeter(): Double {
        return (IDENTICAL_SIDES_OF_A_RECTANGLE * (width * height)).toDouble()
    }
}

fun main() {
    val list = listOf(
        Circle(5, "Черный"),
        Circle(2, "Черный"),
        Circle(7, "Белый"),
        Circle(3, "Белый"),
        Circle(9, "Черный"),
        Rectangle(2, 4, "Черный"),
        Rectangle(3, 2, "Белый"),
        Rectangle(4, 6, "Черный"),
        Rectangle(1, 3, "Белый"),
        Rectangle(3, 8, "Чёрный"),
    )
    val blackPerimeter = list.filter { it.color == "Черный" }.sumOf { it.perimeter() }
    val whiteSquare = list.filter { it.color == "Белый" }.sumOf { it.square() }
    println(
        "Сумма периметров всех чёрныйх фигур: ${"%.2f".format(blackPerimeter)}\n" +
                "Сумма площадей всех белых фигур: ${"%.2f".format(whiteSquare)}"
    )
}

const val MATH_PI = 3.14159
const val IDENTICAL_SIDES_OF_A_RECTANGLE = 2