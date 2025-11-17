package org.example.Lesson_20Practice

class Robot(
    val name: String,
) {
    private val listPhrases = listOf("Хилимся живём", "322", "Раш В!", "Кожанный не шарит", "Мешок с костями шарит")
    private var modifier: ((String) -> String) = { it }
    fun say() {
        val randomPhrases = listPhrases.random()
        val finalPhrases = modifier(randomPhrases)
        println("$name : $finalPhrases")
    }

    fun setModifier(
        mod: (String) -> String
    ) {
        modifier = mod
    }
}

fun main() {
    val robot = Robot("Филя")
    robot.say()
    robot.setModifier { it.reversed() }
    robot.say()
}