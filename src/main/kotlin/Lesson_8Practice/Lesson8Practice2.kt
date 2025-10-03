package org.example.Lesson_8Practice

fun main() {
    val arrayIngredientsForBurger = arrayOf("булочка", "котлета", "соус", "помидор", "огурец", "зелень")

    println("Какой ингредиент для бургера вы хотите найти?")
    val userInput = readln()
    var ingredientsYes = false

    for (i in arrayIngredientsForBurger) {
        if (userInput == i) {
            ingredientsYes = true
            break
        }
    }
    if (ingredientsYes) {
        println("Игрединет $userInput в рецепте есть")
    } else {
        println("Такого ингредиента нет в рецепте")
    }
}
