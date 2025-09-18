package org.example.Lesson_5Practice

import kotlin.math.pow

fun main() {

    val minBmi = 0f..18.4f
    val averageBmi = 18.5f..25.0f
    val highBmi = 25f..30f
    val criticalBmi = 30f..Float.MAX_VALUE

    val listDegrees = listOf(minBmi, averageBmi, highBmi, criticalBmi)

    println(
        "Здравствуйте, вас привествует программа по определению ИМТ.\n" +
                "Введите пожалуйста свой рост:"
    )
    val height = readlnOrNull()?.toFloatOrNull()

    println("Введите пожалуйста свой вес:")
    val weight = readlnOrNull()?.toFloatOrNull()

    val heightInMeters = height?.div(SM_IN_METERS)

    val formulaBmi = if (heightInMeters != null && weight != null) {
        weight / heightInMeters.pow(2)
    } else {
        println("Что-то пошло не так")
    }

    val result = "%.2f".format(formulaBmi)
    println("Вас ИМТ: $result")

    val degrees = listDegrees.indexOfFirst { range -> formulaBmi as Float in range }

    when (degrees) {
        0 -> println("Недостаточная масса тела")
        1 -> println("Нормальная масса тела")
        2 -> println("Избыточная масса тела")
        3 -> println("Ожирение")
    }

}

const val SM_IN_METERS = 100f

