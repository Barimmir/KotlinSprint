package org.example.Lesson_17Practice

class Quiz(
    question: String,
    answer: String,
) {
    val question: String = question
        get() {
            println("Бургеры топ?")
            return field
        }
    var answer: String = answer
        get() {
            println("Бургеры фигня, пицца топ!")
            return field
        }
        set(value) {
            println("*Подзатыльник*\n" +
                    "Да, бургеры топ начальник!")
            field = value
        }
}

fun main() {
    val quiz = Quiz("", "")
    quiz.question
    quiz.answer
    quiz.answer = ""
}