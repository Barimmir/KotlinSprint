package org.example.Lesson_5Practice

import kotlin.math.pow

fun main() {

    val minBmi = "18.5"
    val averageBmi = "25"
    val highBmi = "30"

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

    val degrees = when {
        result < minBmi -> "Недостаточная масса тела"
        result < averageBmi -> "Нормальная масса тела"
        result < highBmi -> "Избыточная масса тела"
        else -> "Ожирение"
    }
    println(degrees)
}

const val SM_IN_METERS = 100f

