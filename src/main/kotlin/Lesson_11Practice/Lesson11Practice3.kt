package org.example.Lesson_11Practice

class VoiceRoom(
    val cover: String,
    val nameRoom: String,
) {
    private val participants = mutableListOf<User3>()

    fun addUser(user: User3) {
        participants.add(user)
        println("Пользователь ${user.name}  вошёл в комнату '${nameRoom}'")
    }

    fun newStatus(userName: String, newStatus: UserStatus) {
        val user = participants.find { it.name == userName }
        if (user != null) {
            user.status = newStatus
            println("Статус пользователя $userName изменен на: ${newStatus.displayName}")
        } else {
            println("Пользователь $userName не найден в комнате")
        }
    }

    fun showRoomInfo() {
        println(
            "\nИнформация о комнате\n" +
                    "Обложка: $cover\n" +
                    "Название: $nameRoom\n" +
                    "Участники (${participants.size}):"
        )
        participants.forEach { user ->
            println("  - ${user.name} [${user.status.displayName}]")
        }
    }

    fun showUserInfo(userName: String) {
        val user = participants.find { it.name == userName }
        if (user != null) {
            println("Долгое нажатие на аватар: ${user.name}")
            println("   Аватар: ${user.avatar}")
            println("   Статус: ${user.status.displayName}")
        } else {
            println("Пользователь $userName не найден")
        }
    }
}

class User3(
    val name: String,
    val avatar: String,
    var status: UserStatus
)

enum class UserStatus(val displayName: String) {
    SPEAKING("разговаривает"),
    MICROPHONE_OFF("микрофон выключен"),
    MUTED("пользователь заглушен")
}

fun main() {
    val room = VoiceRoom(
        cover = "На картинке цитата:\"Не я такой, а жизнь такая\"",
        nameRoom = "За падиком",
    )
    val user1 = User3(
        name = "Петя",
        avatar = "Картинка с котиком",
        status = UserStatus.MICROPHONE_OFF

    )
    val user2 = User3(
        name = "Саня",
        avatar = "Злой шпиц",
        status = UserStatus.SPEAKING

    )
    val user3 = User3(
        name = "Маша",
        avatar = "Тпшная цитата",
        status = UserStatus.MUTED
    )
    room.addUser(user1)
    room.addUser(user2)
    room.addUser(user3)

    room.showRoomInfo()

    room.newStatus("Петя", UserStatus.SPEAKING)
    room.newStatus("Маша", UserStatus.SPEAKING)

    room.showRoomInfo()

    println("\nАдско злостные клики по аватаркам")
    room.showUserInfo("Маша")
    room.showUserInfo("Петя")
}
