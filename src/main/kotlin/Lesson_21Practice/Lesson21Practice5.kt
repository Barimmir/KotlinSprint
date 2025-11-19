package org.example.Lesson_21Practice

fun Map<String, Int>.maxCategory(): String? {
    return this.maxByOrNull { it.value }?.key
}

fun main() {
    val listSkill = mapOf(
        "Сила" to 2,
        "Интелект" to 5,
        "Телосложение" to 9,
        "Ловкость" to 13,
        "Харизма" to 4
    )
    println(listSkill.maxCategory())
}