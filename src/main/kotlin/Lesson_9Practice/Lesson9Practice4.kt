package org.example.Lesson_9Practice

fun main() {
    println("Здравствуйте, введите $NUMBER_OF_DISHES блюд через запятую с пробелом (, ):")
    val userInputDishes = readln()
    val fiveListOfIngredients = userInputDishes.split(", ").toMutableList()
    if (fiveListOfIngredients.size != NUMBER_OF_DISHES) {
        println("Ошибка, введите пожалуйста $NUMBER_OF_DISHES блюд!")
        return
    }
    val newFiveListOfIngredientsSorted = fiveListOfIngredients.sorted()
    println(newFiveListOfIngredientsSorted.joinToString())
}

const val NUMBER_OF_DISHES = 5