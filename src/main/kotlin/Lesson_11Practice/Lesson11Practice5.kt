package org.example.Lesson_11Practice

class Forum {
    class ForumMember(
        val userId: Int,
        val userName: String,
    )

    class ForumMessage(
        val authorId: Int,
        val message: String,
    )

    class UserBuilder(private val forum: Forum) {
        private var userName: String = ""

        fun setUserName(name: String): UserBuilder {
            this.userName = name
            return this
        }

        fun create(): ForumMember {
            return forum.createNewUser(userName)
        }
    }

    class MessageBuilder(private val forum: Forum) {
        private var authorId: Int = 0
        private var messageText: String = ""

        fun setAuthorId(id: Int): MessageBuilder {
            this.authorId = id
            return this
        }

        fun setMessage(text: String): MessageBuilder {
            this.messageText = text
            return this
        }

        fun create(): ForumMessage? {
            return forum.createNewMessage(authorId, messageText)
        }
    }

    private val members = mutableListOf<ForumMember>()
    private val messages = mutableListOf<ForumMessage>()
    private var nextUserId = 1

    fun userBuilder(): UserBuilder = UserBuilder(this)
    fun messageBuilder(): MessageBuilder = MessageBuilder(this)

    internal fun createNewUser(userName: String): ForumMember {
        val newUser = ForumMember(nextUserId, userName)
        members.add(newUser)
        nextUserId++
        return newUser
    }

    internal fun createNewMessage(authorId: Int, message: String): ForumMessage? {
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
    val user1 = forum.userBuilder()
        .setUserName("Петя")
        .create()

    val user2 = forum.userBuilder()
        .setUserName("Фрося")
        .create()

    forum.messageBuilder()
        .setAuthorId(user1.userId)
        .setMessage("Здарова бандиты! Как ваши дела?")
        .create()
    forum.messageBuilder()
        .setAuthorId(user2.userId)
        .setMessage("Ну привет мамин бандит, без тебя тут было уютнее!")
        .create()
    forum.messageBuilder()
        .setAuthorId(user1.userId)
        .setMessage("Вчера бургер по рецепту из приложухи сделал и в туалете сижу целый день уже...")
        .create()
    forum.messageBuilder()
        .setAuthorId(user2.userId)
        .setMessage("Азазаз, а ты больше верь приложениями! За нами следят! АВЭ ЛИНУУУУУУКС!")
        .create()
    forum.printThread()
}
