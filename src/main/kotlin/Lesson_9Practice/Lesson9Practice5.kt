package org.example.Lesson_9Practice

fun main() {
    val fiveListOfIngredients = mutableListOf<String>()

    println("Ввеите $MAX_DISHES_OF_LIST ингредиентов которые будут добавлены в списко:")

    for ( i in MIN_DISHES_OF_LIST..MAX_DISHES_OF_LIST) {
        val userInputOfIngredients = readln().trim()
        if (userInputOfIngredients in fiveListOfIngredients) {
            println("Такой ингредиент уже есть!")
            continue
        }
        fiveListOfIngredients.add(userInputOfIngredients)
    }
    val fiveListOfIngredientsSorted = fiveListOfIngredients.sorted()
    println(fiveListOfIngredientsSorted.joinToString())
}

const val MIN_DISHES_OF_LIST = 1
const val MAX_DISHES_OF_LIST = 5