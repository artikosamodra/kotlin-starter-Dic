package com.dicoding.kotlin

fun main(){
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    //logika AND (&&)
    val isOpen = if (now >= officeOpen && now <= officeClosed){
        true
    } else  {
        false
    }
    println("Office is open : $isOpen")

    //logika OR (||)
    val isClose = now < officeOpen || now > officeClosed
    println("Office is closed : $isClose")

    //Logika NOT/Negation (!)
    if (!isOpen){
        println("Office is closed")
    } else {
        println("Office is open")
    }
}