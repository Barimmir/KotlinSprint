package org.example.Lesson_8Practice

fun main() {
    val arrayOfIngredients = arrayOf("хлеб", "колбаса", "сыр", "кетчуп")
    println(
        "Список ингредиентов: ${arrayOfIngredients.joinToString()}\n" +
                "Какой вы бы хотели заменить?"
    )
    val deleteIngredients = readln()

    val index = arrayOfIngredients.indexOf(deleteIngredients)

    if ( index != -1) {
        println("На какой ингредиент вы бы хотели заменить?")
        val newIngredients = readln()
        arrayOfIngredients[index] = newIngredients
        println("Готово! Обновлённый списко: ${arrayOfIngredients.joinToString()}")
    } else {
        println("Введите ингредиент который есть в списке")
    }

}