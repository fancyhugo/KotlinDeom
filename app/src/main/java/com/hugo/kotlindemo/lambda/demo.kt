package com.hugo.kotlindemo.lambda

fun main(args: Array<String>) {
    val nameList =
        listOf("Kotlin", "Java", "Python", "JavaScript", "Scala", "C", "C++", "Go", "Swift")
    nameList.filter {
        it.startsWith("K")
    }.map {
        "$it is a very good language"
    }.forEach {
        println(it)
    }

}
