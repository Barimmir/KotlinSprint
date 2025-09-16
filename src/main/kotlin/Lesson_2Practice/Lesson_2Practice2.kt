package org.example.Lesson_2Practice

fun main() {

    val permEmployee = 50
    val salaryPermEmployee = 30000
    val intern = 30
    val salaryIntern = 20000

    val sumSalaryPerm = permEmployee * salaryPermEmployee
    val sumSalary = sumSalaryPerm + (intern * salaryIntern)
    val averageSalary =  sumSalary / (permEmployee + intern)

    println(sumSalaryPerm)
    println(sumSalary)
    println(averageSalary)
}