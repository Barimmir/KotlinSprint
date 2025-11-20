package org.example.Lesson_22Practice

class RegularBook(
    val name: String,
    val author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)

fun main() {
    val regularBook1 = RegularBook("Сказание о раке", "Нагибатор228")
    val regularBook2 = RegularBook("Перо под ребро", "МаминСимпотяга")
    val dataBook1 = DataBook("ДнД это жизнь", "Жизни нет")
    val dataBook2 = DataBook("уъауъуауъъъ", "ЧерныйКотик")
    println(regularBook1 == regularBook2)
    /*  В случае с regularBook1 и regularBook2 сравниваются ссылки на объекты в памяти, хоть под капотом
    вместо == всё равно вызывается equals()
     */
    println(dataBook1 == dataBook2)
    /* В этом же случае сранвиваются значения проинициализированных данных */
}