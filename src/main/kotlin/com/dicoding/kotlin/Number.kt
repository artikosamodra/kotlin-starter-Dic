package com.dicoding.kotlin

fun main(){
    //Max-Min
    val maxInt = Int.MAX_VALUE //nilai maksimal yg dapat disimpan di Int
    val overRangeInt = Int.MAX_VALUE + 1
    val minInt = Int.MIN_VALUE //nilai minimal yg dapat disimpan di Int
    //Output Max-Min
    println("Max Int: $maxInt")
    println("Over range Int: $overRangeInt")
    println(minInt)
    //==============================================================

    //Operator
    val numberOne = 1
    val numberTwo = 2
    //Output Operator
    println (numberOne+numberTwo)
    println (numberOne-numberTwo)
    println (numberOne*numberTwo)
    println (numberOne/numberTwo)
    //=============================================================

    //Konversi Tipe Data
    val byteNumber: Byte = 10
    val intNumber: Int = byteNumber.toInt() // contoh konversi dari byte ke Int menggunakan to."tipe data yang diinginkan"()
    val stringNumberA = "20"
    val intNumberA = 5
    //Output Konversi Tipe Data
    println(intNumber)
    println(intNumberA+stringNumberA.toInt()) // to.Int = to."tipe data Int"
    //============================================================

    //Neadable Number
    val readableNumber = 1_000_000
    //Output Readable Number
    println(readableNumber)








}