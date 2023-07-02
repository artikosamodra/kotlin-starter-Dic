package com.dicoding.kotlin

fun main(){
    val text: String? = null //agar objek bernilai null, pada kotlin diberikan tanda '?' setelah tipe data

    /*
    val textLength = text.length
    //jika objek null langsung dikekola seperti script diatas, hasilnya akan "compile time error"
    */

    //cara mengelolanya yaitu dengan memeriksa objek tersebut bernilai null atau tidak seperti dibawah ini, dengan if
    if(text !=null){
        val textLength = text.length //
    }
}