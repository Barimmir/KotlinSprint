package org.example.Lesson_20Practice

fun main() {
    val listString = listOf("Палка", "Шпоргалка", "Прялка", "Калька", "Галька", "Тарелка")
    val clicksLambda: List<() -> Unit> = listString.map { listString ->
        { println("Нажатие на $listString") }
    }
    clicksLambda.forEachIndexed { index, clicksLambda ->
        if ((index + 1) % 2 == 0) {
            clicksLambda()
        }
    }
}