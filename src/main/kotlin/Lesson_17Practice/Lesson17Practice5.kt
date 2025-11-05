package org.example.Lesson_17Practice

class User34(
    login: String,
    password: String,
) {
    var login: String = login
        set(value) {
            println("Логин $field успешно изменён на $value")
        }
    var password: String = password
        get() = "*".repeat(field.length)
        set(value) {
            if (field != value) {
                println("Нельзя изменить пароль!")
            }
            field = value
        }
}

fun main() {
    val user = User34("ГачаПон","фифа228")
    user.login = "Банан"
    user.password = "228попиросим"
    println(user.password)
}