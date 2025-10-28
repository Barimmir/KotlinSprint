package org.example.Lesson_14Practice

open class Message(
    val id: String,
    val text: String,
    val author: String,
) {
    open fun display(): String {
        return "[$id] $author: $text"
    }
}

class ChildMessage(
    id: String,
    text: String,
    author: String,
    val parentMessageId: String,
) : Message(id = id, text = text, author = author) {
    override fun display(): String {
        return "---$author: $text"
    }
}

class Chat {
    private val listMessage = mutableListOf<Message>()
    private var messageCounter = 1

    private fun generateId(): String {
        return "${messageCounter++}"
    }

    fun addMessage(text: String, author: String): String {
        val messageId = generateId()
        val message = Message(id = messageId, text = text, author = author)
        listMessage.add(message)
        return messageId
    }

    fun addThreadMessage(text: String, author: String, parentMessageId: String): String {
        val parentExists = listMessage.any { it.id == parentMessageId }
        if (!parentExists) {
            println("Родительское  сообщение с id: $parentMessageId не найдено!")
            return ""
        }
        val threadMessageId = generateId()
        val threadMessage = ChildMessage(
            id = threadMessageId,
            text = text,
            author = author,
            parentMessageId = parentMessageId
        )
        listMessage.add(threadMessage)
        return threadMessageId
    }

    fun printChat() {
        if (listMessage.isEmpty()) {
            println("Чат пуст")
            return
        }
        val messageGroup = listMessage.groupBy { message ->
            when (message) {
                is ChildMessage -> message.parentMessageId
                else -> message.id
            }
        }
        listMessage.forEach { message ->
            when (message) {
                is ChildMessage -> {
                }

                else -> {
                    println(message.display())
                    messageGroup[message.id]?.forEach { childMessage ->
                        if (childMessage is ChildMessage) {
                            println(childMessage.display())
                        }
                    }
                }
            }
        }
    }

    fun getMessage(): List<Message> = listMessage.toList()
}

fun main() {
    val chat = Chat()
    val message1Id = chat.addMessage("Здарова бродяги!", "НагибаторОтцов")
    val message2Id = chat.addMessage("Иммалейт импрувет тебе в зад!", "АнимеНаАве")
    val message3Id = chat.addMessage("В доту кто идёт, бомжи?", "ДоннаяКлешня")

    chat.addThreadMessage("О, школьник в чате!", "МашаНяша", message1Id)
    chat.addThreadMessage("Отлично, хоть что-то почувствую!", "ГришаБутырка", message2Id)
    chat.addThreadMessage("Эта игра для инвалидов, но я иду!", "1500ммр", message3Id)
    chat.addThreadMessage("Можно пару каток", "КладуНаВсёПиво", message3Id)

    chat.addMessage("Аврааааавраавра!", "Пивозавр")
    chat.printChat()
}
