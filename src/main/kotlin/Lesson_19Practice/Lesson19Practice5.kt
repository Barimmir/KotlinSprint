package org.example.Lesson_19Practice

enum class Gender(val nameGender: String) {
    MALE("Мужской"),
    FEMALE("Женский")
}

class User228 {
    private var nameUser = ""
    private var genderUser: Gender? = null
    fun getName() {
        println("Введите ваше имя:")
        val nameInput = readln()
        nameUser = nameInput
    }

    fun getGender() {
        println("Введите пол:")
        val genderInput = readln()
        genderUser = when (genderInput) {
            "Мужской" -> Gender.MALE
            "Женский" -> Gender.FEMALE
            else -> {
                println("Нет такого пола, иди в твитер жалуйся")
                null
            }
        }

    }

    fun printInfo() {
        println(
            "Имя: $nameUser\n" +
                    "Пол: ${genderUser?.nameGender}"
        )
    }
}


fun main() {
    println(
        "Здравствуйте! Введите ваше имя без пробелов и с большой буквы!\n" +
                "ВНИМАНИЕ! Поль вводить тоже с большой буквы и только эти варианты: Мужской или Женский"
    )
    val listUser = mutableListOf<User228>()
    for (i in MIN_LIST_USER..MAX_LIST_USER) {
        val user = User228()
        user.getName()
        user.getGender()
        listUser.add(user)
    }
    listUser.forEach { it.printInfo() }
}

const val MIN_LIST_USER = 1
const val MAX_LIST_USER = 5