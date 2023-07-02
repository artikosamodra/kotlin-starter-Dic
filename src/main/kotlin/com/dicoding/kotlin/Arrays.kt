package com.dicoding.kotlin

fun main(){
    //fungsi array => get, set dan size
    val array = arrayOf(1, 2, 3, 4, 5) //memanfaatkan library arrayOf
    val mixArray = arrayOf(1, 2, 4, "Artiko", true) // array dapat berisi tipe data yang berbeda, contoh tersebut berisi tipe int, string dan boolean
    val intArray = intArrayOf(1,7,9,4) //penggunaan intArrayOf = nilai pada array bertipe data int, dapat drubah sesuati kebutuhan misal stringArrayOf() atau booleanArrayOf()
    val intArray2 = intArrayOf(1, 8, 2, 4, 3, 9)
    intArray2[4] = 7 //merubah array ke 4 yang bernilai 3 menjadi 7.

    println(array[2])
    println(mixArray[3])
    println(intArray[2])
    println(intArray2[4])

}