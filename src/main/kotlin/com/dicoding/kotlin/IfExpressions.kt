package com.dicoding.kotlin

fun main(){
    val openHours = 7
    val now = 7
    val office: String

    office = if (now > 7){
        "Office already open"
    } else if (now == openHours){
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }

    println(office)
}