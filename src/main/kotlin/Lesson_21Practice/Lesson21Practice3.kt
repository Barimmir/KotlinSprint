package org.example.Lesson_21Practice

class Player322(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int,
) {
    fun printInfo() {
        println(
            "Имя: $name\n" +
                    "Здоровье: $currentHealth\n" +
                    "Максимальное здороьве: $maxHealth"
        )
    }
}

fun Player322.isHealthy() {
    if (currentHealth == maxHealth) {
        println(true)
    } else {
        println(false)
    }
}

fun main() {
    val user = Player322("ПитонГригорий", 6, 10)
    val healPoison: (Player322) -> Unit = { user -> user.currentHealth = user.maxHealth }
    user.isHealthy()
    healPoison.invoke(user)
    user.printInfo()
    user.isHealthy()
}