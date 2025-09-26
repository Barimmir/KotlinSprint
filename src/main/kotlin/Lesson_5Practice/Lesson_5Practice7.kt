package org.example.Lesson_5Practice

fun main() {

    println("Введите расстояние поезки(в км):")
    val distance = readlnOrNull()?.toFloatOrNull()

    println("Введите расход топилва на 100 км(в литрах):")
    val litersOfFuel = readlnOrNull()?.toFloatOrNull()

    println("Введите цену за литр топлива:")
    val priceOfFuel = readlnOrNull()?.toFloatOrNull()

    if (distance != null && litersOfFuel != null && priceOfFuel != null) {
        val allLitersOfFuel = (distance * litersOfFuel) / PART_OF_THE_FORMULA
        val allPriceOfFuel = allLitersOfFuel * priceOfFuel

        println("Общее количесвто литров топливва: ${"%.2f".format(allLitersOfFuel)} литров")
        println("Общая стоимость топлива: ${"%.2f".format(allPriceOfFuel)} рублей")
    } else {
        println("Что-то пошло не так")
    }
}

const val PART_OF_THE_FORMULA = 100