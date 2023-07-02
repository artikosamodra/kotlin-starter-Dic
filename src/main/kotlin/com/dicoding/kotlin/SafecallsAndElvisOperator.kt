package com.dicoding.kotlin

fun main(){

    //tujuannya adalah menghindari terjadinya NPE / NullPointerException

    //SafeCalls Oeprator
    val text: String? = null
    text?.length
    //Tujuan safecall adalah pemanggilan nilai null dengan aman
    // yaitu mengganti '.' menjadi '?.' = text.length menjadi text?.length

    //ElvisOperator
    val text1: String? = null
    val text1Length = text1?.length ?: 7
    //Elvis bertujuan untuk memungkinan kita untuk memberikan nilai default null pasa objek
    //kode diatas sebenarnya sama seperti menggunakan if else dibawah berikut
    // val text1Length = if (text !null) text.length else 7
    //elvis akan mengembalikan nilai text.length jika text tidak bernilai null
    //jika bernilai null, text akan dikembalian secara default value


    //Penggunaan non-null assertion
    val text2: String? = null
    val text2Length = text2!!.length
    //non-null assertion bertujuan untuk mengizinkan kita mengakses dan mengelola nilai sebuah objek nullable
    //namun tidak disarankan, karena memaksakan sebuah objek bernilai non-null yang dapat beresiko bertemu dengan NullPointerException

}