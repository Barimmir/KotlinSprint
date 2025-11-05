package org.example.Lesson_17Practice

class Quiz(
    question: String,
    answer: String,
) {
    val question: String = question
        get() = field
    var answer: String = answer
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val quiz = Quiz("Бургеры топ?", "Нет, пицца топ!")
    println(quiz.question)
    println(quiz.answer)
    quiz.answer = "*позатыльник* Да, бургеры топ босс!"
    println(quiz.answer)
}