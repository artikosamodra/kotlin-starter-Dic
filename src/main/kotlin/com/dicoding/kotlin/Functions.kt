package com.dicoding.kotlin

fun main(){
    val user = setuser("Artiko", 26)
    println(user)

    printUser("Artiko")
}

//ini contoh function yang hanya memiliki satu expression, diikuti dengan kata kunci return, seperti dibawah ini.
fun setuser(name: String, age: Int): String { /* : String => merupakan tipe nilai kembalian dari function */
    return "Your name is $name, and you $age years old"
// kata kunci return pada function yang hanya memiliki satu expression, dapat diganti menjadi =, contoh seperti dibawah ini.
// fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"

}

fun printUser(name: String) /* : Unit*/ { //penggunaan Unit artinya kotln akan menghilangkan nilai kembalian dari fungsi, jika string maka nilai kembalian berubah string, dst. namun tidak menulisnya tipe data juga tidak apa karena mendeteksi nilai kembalian yang redudant
    println("Your name is $name")
}

/*
    function diawali dengan penulisan fun(), dalam kurung fun berisi nama param dan tipe param.

    nama parameter diikuti tipe param, dipisahkan colon (:)
    contoh => (name:String, age: Int)
    nama param = name dan age.
    tipe param = String dan Int

    kurung kurawal / {} => merupakan function body, didalamnya berisi expression.

 */