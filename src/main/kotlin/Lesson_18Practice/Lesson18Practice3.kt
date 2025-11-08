package org.example.Lesson_18Practice

abstract class Animal(
    open val name: String,
    open val eat: String
) {
    open fun eat() {
        println("$name ест -> $eat")
    }

    open fun sleep() {
        println("$name спит")
    }
}

class Fox(
    override val name: String = "Лиса",
    override val eat: String = "ягоды",
) : Animal(name, eat)

class Dog(
    override val name: String = "Собака",
    override val eat: String = "кости",
) : Animal(name, eat)

class Cat(
    override val name: String = "Кошка",
    override val eat: String = "рыбу",
) : Animal(name, eat)

fun main() {
    val listAnimal = listOf(Dog(), Fox(), Cat())
    val dog = Dog()
    val fox = Fox()
    val cat = Cat()
    listAnimal.forEach { it.eat() }
    listAnimal.forEach { it.sleep() }
}