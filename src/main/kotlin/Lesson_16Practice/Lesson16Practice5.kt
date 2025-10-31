package org.example.Lesson_16Practice

class Character(
    val name: String,
    private var health: Int,
    var damage: Int,
) {
    fun printInfo() {
        println(
            "Имя: $name \n" +
                    "Здоровье: $health\n" +
                    "Урон: $damage"
        )
    }

    fun getHealth(healthPoison: Int) {
        if (health <= 0) {
            println("Персонжа мёртв, лечение невозможно!")
        } else {
            val newHealth = health + healthPoison
            health = newHealth
        }
    }

    fun getDamage(damage: Int) {
        val newHealth = health - damage
        health = newHealth
        if (health <= 0) {
            dying()
        }
    }

    private fun dying() {
        health = 0
        damage = 0
        println("Персонаж мертв")
    }
}

fun main() {
    val character = Character("Додик", 10, 5)
    val damage = 4
    val healthPoison = 2
    character.printInfo()
    character.getDamage(damage)
    character.getHealth(healthPoison)
    character.getDamage(damage)
    character.getHealth(healthPoison)
    character.printInfo()
    character.getDamage(damage)
    character.getDamage(damage)
    character.printInfo()
    character.getHealth(healthPoison)
}