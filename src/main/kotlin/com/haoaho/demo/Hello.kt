package com.haoaho.demo

fun main(args: Array<String>) {
//    println("tefe")
    val h = Human()
    h.hello()

    var name: String;

    var age = 21
    var weight = 33.2f
    var height = 32.1f
    val max = 100
    val min = 0
    
    name = "sonic"

    println(name)


}

class Human {
    fun hello() {
        println("hello kotlin ")
    }
}