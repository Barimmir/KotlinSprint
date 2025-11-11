package org.example.Lesson_19Practice

enum class Cartridges(val nameCartridges: String, val damage: Int) {
    BLUE("Синий", 5),
    GREEN("Зелёный", 10),
    RED("Красный", 20)
}

class Tank(
    val nameTank: String,
) {
    private var cartridges: Cartridges? = null
    fun changeTheCartridge(newCartridges: Cartridges) {
        cartridges = newCartridges
        println("Танк $nameTank заряжен патроном ${newCartridges.nameCartridges}")
    }

    fun shoot() {
        if (cartridges == null) {
            println("Патронов нет, стрелять невозможно!")
        } else {
            println("Танк $nameTank стреляет патроном ${cartridges?.nameCartridges} с уроном ${cartridges?.damage}")
        }
    }

}

fun main() {
    val tank = Tank("Мазила")
    tank.shoot()
    tank.changeTheCartridge(Cartridges.BLUE)
    tank.shoot()
    tank.changeTheCartridge(Cartridges.GREEN)
    tank.shoot()
    tank.changeTheCartridge(Cartridges.RED)
    tank.shoot()
}