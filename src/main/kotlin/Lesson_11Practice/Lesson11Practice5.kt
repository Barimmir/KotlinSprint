package org.example.Lesson_11Practice

class ForumMember(
    val userId: Int,
    val userName: String,
)

class ForumMessage(
    val authorId: Int,
    val message: String,
)

class Forum {
    private val members = mutableListOf<ForumMember>()
    private val messages = mutableListOf<ForumMessage>()
    private var nextUserId = 1

    fun createNewUser(userName: String): ForumMember {
        val newUser = ForumMember(nextUserId, userName)
        members.add(newUser)
        nextUserId++
        return newUser
    }

    fun createNewMessage(authorId: Int, message: String): ForumMessage? {
        val authorExists = members.any { it.userId == authorId }
        if (!authorExists) return null

        val newMessage = ForumMessage(authorId, message)
        messages.add(newMessage)
        return newMessage
    }

    fun printThread() {
        println("=== Сообщения форума ===")
        messages.forEach { forumMessage ->
            val authorName = members.find { it.userId == forumMessage.authorId }?.userName ?: "Неизвестный"
            println("$authorName: ${forumMessage.message}")
        }
    }
}

fun main() {
    val forum = Forum()
    val user1 = forum.createNewUser("Петя")
    val user2 = forum.createNewUser("Фрося")

    forum.createNewMessage(user1.userId, "Здарова бандиты! Как ваши дела?")
    forum.createNewMessage(user2.userId, "Ну привет мамин бандит, без тебя тут было уютнее!")
    forum.createNewMessage(
        user1.userId,
        "Вчера бургер по рецепту из приложухи сделал и в туалете сижу целый день уже..."
    )
    forum.createNewMessage(user2.userId, "Азазаз, а ты больше верь приложениями! За нами следят! АВЭ ЛИНУУУУУУКС!")

    forum.printThread()
}