package org.example.Lesson_9Practice

fun main() {
    val listIngredients = mutableListOf("колбаса", "сыр", "хлеб")

    println(
        "В рецепте есть базовые ингредиенты: ${listIngredients.joinToString()}\n" +
                "Желаете добавить свой?"
    )
    val userChoice = readln()
    if (userChoice.equals("Да", true) && userChoice.equals("да", true)) {
        println("Какой ингредиент вы хотите добавить?")
        val userInputIngredients = readln()
        listIngredients.add(userInputIngredients)
        println("Теперь в рецепте есть следующие ингредиенты: ${listIngredients.joinToString()}")
    } else {
        return
    }
}