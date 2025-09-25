package org.example.Lesson_6Practice

fun main() {
    println(
        "Здравствуйте, вы выбрали регистрацию аккаунта\n" +
                "Введите логин:"
    )
    val loginReg = readlnOrNull().toString()

    println("Введите пароль:")
    val passwordReg = readlnOrNull().toString()

    println(
        "Аккаунт создан! Теперь авторизуйтесь.\n" +
                "Введите логин:"
    )
    var loginAuth = readlnOrNull().toString()

    println("Введите пароль:")
    var passwordAuth = readlnOrNull().toString()

    while (loginAuth != loginReg && passwordAuth != passwordReg){
        println("Введите данные снова\n" +
                "Введите логин:")
        loginAuth = readlnOrNull().toString()

        println("Введите пароль:")
        passwordAuth = readlnOrNull().toString()
    }

    println("Авторизация прошла успешно!")

}