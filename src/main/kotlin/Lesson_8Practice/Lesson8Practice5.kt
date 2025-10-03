package org.example.Lesson_8Practice

fun main() {
    println("Сколько элементов будет в списке?")
    val sizeArray = readln().toInt()

    if (sizeArray != INVALID_ARRAY_SIZE) {
        val arrayIngredients = Array(sizeArray) {""}
        println("Введите $sizeArray ингредиентов:")
        for (i in 0 until sizeArray) {
            println("Ингредиент ${i + 1}: ")
            arrayIngredients[i] = readln()

            println("Список ингредиентов: ${arrayIngredients.joinToString(", ")}")
        }
    } else {
        println("Введите длину больше $INVALID_ARRAY_SIZE")
    }
}

const val INVALID_ARRAY_SIZE = 0