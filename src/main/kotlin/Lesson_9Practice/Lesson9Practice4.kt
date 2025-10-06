package org.example.Lesson_9Practice

fun main() {
    println("Здравствуйте, введите $NUMBER_OF_DISHES блюд через запятую с пробелом (, ):")
    val ingredients = readln().split(", ")
    if (ingredients.size != NUMBER_OF_DISHES) {
        println("Ошибка, введите пожалуйста $NUMBER_OF_DISHES блюд!")
        return
    }
    val newFiveListOfIngredientsSorted = ingredients.sorted()
    println(newFiveListOfIngredientsSorted.joinToString())
}

const val NUMBER_OF_DISHES = 5