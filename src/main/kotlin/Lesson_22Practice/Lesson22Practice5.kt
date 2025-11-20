package org.example.Lesson_22Practice

data class GalacticGuide(
    val namePlace: String,
    val description: String,
    val dateAndTime: String,
    val distanceToPlace: Double,
)

fun main() {
    val alphaCentauri = GalacticGuide(
        "Alpha Centauri",
        "Какая-то жопа галактики куда \"Великих\" героев послали вычищать зло и бла-бла-бла",
        "В понедельник в жопе мира, потому что понедельники не бывают хорошими",
        10.23
    )
    println("Название: ${alphaCentauri.component1()}")
    println("Описание места: ${alphaCentauri.component2()}")
    println("Дата и время: ${alphaCentauri.component3()}")
    println("Дистанция в световых годах: ${alphaCentauri.component4()}")
}