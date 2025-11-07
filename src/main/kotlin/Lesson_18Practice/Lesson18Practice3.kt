package org.example.Lesson_18Practice

open class Animal() {
    open fun eat() = ""
}

class Fox(
    private val animal: String,
    private val eat: String,
) : Animal() {
    override fun eat(): String {
        return "$animal ест -> $eat"
    }
}

class Dog(
    private val animal: String,
    private val eat: String,
) : Animal() {
    override fun eat(): String {
        return "$animal ест -> $eat"
    }
}

class Cat(
    private val animal: String,
    private val eat: String,
) : Animal() {
    override fun eat(): String {
        return "$animal ест -> $eat"
    }
}

fun main() {
    val listAnimal = mutableListOf<Animal>()
    val dog = Dog("Собака", "кости")
    val fox = Fox("Лиса", "ягоды")
    val cat = Cat("Кошка", "рыбу")
    listAnimal.add(dog)
    listAnimal.add(fox)
    listAnimal.add(cat)
    listAnimal.forEach { println(it.eat()) }
}