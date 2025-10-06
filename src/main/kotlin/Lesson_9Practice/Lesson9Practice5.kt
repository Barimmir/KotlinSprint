package org.example.Lesson_9Practice

fun main() {
    val fiveListOfIngredients = mutableSetOf<String>()

    println("Введите $MAX_DISHES_OF_LIST ингредиентов которые будут добавлены в списко:")

    for (i in MIN_DISHES_OF_LIST..MAX_DISHES_OF_LIST) {
        val userInputOfIngredients = readln().trim()
        if (!fiveListOfIngredients.add(userInputOfIngredients)) {
            println("Такой ингредиент уже есть!")
        }
    }
    val fiveListOfIngredientsSorted = fiveListOfIngredients.sorted()
    val resultList = fiveListOfIngredientsSorted.mapIndexed { index, ingredient ->
        if (index == 0) ingredient.replaceFirstChar { it.uppercase() }
        else ingredient
    }
    println(resultList.joinToString(", "))
}

const val MIN_DISHES_OF_LIST = 1
const val MAX_DISHES_OF_LIST = 5