package org.example.Lesson_20Practice

class Player321(
    val name: String,
    val key: Boolean,
)

fun main() {
    val player = Player321("БольшойПитон", true)
    val openDoor: (Player321) -> Unit = {
        if (player.key == true) {
            println("${player.name} открыл дверь")
        } else {
            println("Дверь закрыта")
        }
    }
    openDoor.invoke(player)
}