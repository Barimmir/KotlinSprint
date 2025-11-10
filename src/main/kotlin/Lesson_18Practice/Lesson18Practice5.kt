package org.example.Lesson_18Practice

class Screen {
    fun drawCircle(x: Int, y: Int): String {
        return "Нарисован круг с координатами Х: $x || У: $y"
    }

    fun drawCircle(x: Float, y: Float): String {
        return "Нарисован круг с координатами Х: $x || У: $y"
    }

    fun drawSquare(x: Int, y: Int): String {
        return "Нарисован квадрат с координатами Х: $x || У: $y"
    }

    fun drawSquare(x: Float, y: Float): String {
        return "Нарисован квадрат с координатами Х: $x || У: $y"
    }

    fun drawPoint(x: Int, y: Int): String {
        return "Нарисована точка с координатами Х: $x || У: $y"
    }

    fun drawPoint(x: Float, y: Float): String {
        return "Нарисована точка с координатами Х: $x || У: $y"
    }
}

fun main() {
    val screen = Screen()
    println(screen.drawCircle(2, 4))
    println(screen.drawCircle(4.3f, 5.5f))
    println(screen.drawSquare(4, 9))
    println(screen.drawSquare(2.5f, 4.7f))
    println(screen.drawPoint(1, 1))
    println(screen.drawPoint(0.5f, 2.3f))
}