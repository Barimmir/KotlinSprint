package org.example.Lesson_8Practice

fun main() {
    val arrayIngredientsForBurger = arrayOf("булочка", "котлета", "соус", "помидор", "огурец", "зелень")

    println("Какой ингредиент для бургера вы хотите найти?")
    val userInput = readln()

    if (userInput in arrayIngredientsForBurger) {
        println("Ингредиент $userInput  в рецепте есть")
    } else {
        println("Такого ингредиента нет в рецепте")
    }
}
