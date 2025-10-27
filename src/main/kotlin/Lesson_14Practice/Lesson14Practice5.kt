package org.example.Lesson_14Practice

open class Message(
    val id: String = (1..9).random().toString(),
    val text: String,
    val author: String,
) {
    open fun display(): String {
        return "[$id] $author: $text"
    }
}

class ChildMessage(
    text: String,
    author: String,
    val parentMessageId: String,
) : Message(text = text, author = author) {
    override fun display(): String {
        return "---$author: $text"
    }
}

class Chat {
    private val listMessage = mutableListOf<Message>()

    fun addMessage(text: String, author: String): String {
        val message = Message(text = text, author = author)
        listMessage.add(message)
        return message.id
    }

    fun addThreadMessage(text: String, author: String, parentMessageId: String): String {
        val parentExists = listMessage.any { it.id == parentMessageId }
        if (!parentExists) {
            println("Родительское  сообщение с id: $parentMessageId не найдено!")
        }
        val treadMessage = ChildMessage(text = text, author = author, parentMessageId = parentMessageId)
        listMessage.add(treadMessage)
        return treadMessage.id
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
