package org.example.Lesson_18Practice

open class Screen {
    fun drawCircle(figure: String, x: Int, y: Int) {
        println("Нарисован $figure  с координатами Х: $x || У: $y")
    }

    fun drawCircle(figure: String, x: Float, y: Float) {
        println("Нарисован $figure  с координатами Х: $x || У: $y")
    }

    fun drawSquare(figure: String, x: Int, y: Int) {
        println("Нарисован $figure  с координатами Х: $x || У: $y")
    }

    fun drawSquare(figure: String, x: Float, y: Float) {
        println("Нарисован $figure  с координатами Х: $x || У: $y")
    }

    fun drawDot(figure: String, x: Int, y: Int) {
        println("Нарисован $figure  с координатами Х: $x || У: $y")
    }

    fun drawDot(figure: String, x: Float, y: Float) {
        println("Нарисован $figure  с координатами Х: $x || У: $y")
    }
}

fun main() {
    val screen = Screen()
    screen.drawCircle("Круг", 2, 4)
    screen.drawCircle("Круг", 4.3f, 5.5f)
    screen.drawSquare("Квадрат", 4, 9)
    screen.drawSquare("Квадрат", 2.5f, 4.7f)
    screen.drawDot("Точка", 1, 1)
    screen.drawDot("Точка", 0.5f, 2.3f)
}
