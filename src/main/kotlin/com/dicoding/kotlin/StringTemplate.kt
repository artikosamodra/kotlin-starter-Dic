package com.dicoding.kotlin

fun main(){
    val name = "Kotlin"
    val old = 3
    val hour = 7

    //penggunakan string template tanpa concatenation (menggunakan +)
    println("My name is " +name)

    //menggunakan string template menggunakan $
    println("My name is $name")

    //tidak hanya sebatas string, dapat menggunakan tipe data lain seperti Int ataupun Double
    println("My name is $name, im $old years old")

    //menggunakan string template untuk pemanggil expression
    println("Office ${if(hour > 7) "already close" else "is open"}")
}