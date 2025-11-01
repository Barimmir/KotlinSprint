package org.example.Lesson_16Practice

class Character(
    val name: String,
    private var health: Int,
    private var damage: Int,
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
            println("Персонжа $name мёртв, лечение невозможно!")
        } else {
            health += healthPoison
        }
    }

    fun getDamage(damage: Int) {
        health -= damage
        if (health <= 0) {
            dying()
        }
    }

    private fun dying() {
        health = 0
        damage = 0
        println("Персонаж $name мертв")
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