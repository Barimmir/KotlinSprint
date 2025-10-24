package org.example.Lesson_15Practice

abstract class Users(
    open val name: String
) {
    abstract fun readTheForum()
    abstract fun writeMessage()
}

class Administrator(
    override val name: String,
) : Users(name) {
    override fun readTheForum() {
        println("$name: читает форум")
    }

    override fun writeMessage() {
        println("$name: Вы нарушли правила сообщества!")
    }

    fun deleteMessage(userName: String) {
        println("$name: Сообщение пользователя $userName было удалено из-за наруения правил сообщества!")
    }

    fun deleteUser(userName: String) {
        println("$name: Пользователь $userName был удалён за нарушение правил сообщества!")
    }
}

class User(
    override val name: String,
) : Users(name) {
    override fun readTheForum() {
        println("$name читает форум")
    }

    override fun writeMessage() {
        println("$name: Привет вы все *****!")
    }
}

fun main() {
    val user = User("Гриша")
    val admin = Administrator("Федя")
    user.readTheForum()
    user.writeMessage()
    admin.readTheForum()
    admin.writeMessage()
    admin.deleteMessage(user.name)
    admin.deleteUser(user.name)
}