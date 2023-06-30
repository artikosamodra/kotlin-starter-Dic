package com.dicoding.kotlin

//Fundamental
fun main(){

    //Fundamental
    val name = "Artiko"

    print("Hello my name is ")
    println(name)
    println(if (true)"Always true" else "Always false")
//======================================================================

    //DataTypes & Variable (contoh menggunakan operator '+')
    val firstWord ="Dicoding "
    val lastWord = "Academy"
    print(firstWord+lastWord)
//======================================================================

    //Char (contoh menggunakan increment'++'/decrement'--')
    var vocal = 'A'
    println("Vocal "+vocal++) //Increment
    println("Vocal "+vocal++)
    println("Vocal "+vocal++)
    println("Vocal "+vocal--) //Decrement
    println("Vocal "+vocal--)
    println("Vocal "+vocal--)
    println("Vocal "+vocal--)
//======================================================================

    //String
    val text = "Kotlin"
    val firstChar = text[0]

    println("First character of $text is $firstChar")
    for(char in text){
        print("$char")
    }

    //Escaped String (Literal String 1)
    //val statement = "Kotlin is Awesome!" => contoh string
    //val statement = "Kotlin is "Awesome!"" => penulisan seperti ini akan menyebabkan ambiguitas
    val statement = "Kotlin is \"Awesome!\"" //=> penulisan dengan cara escaped, dengan tanda \.
    /* karakter lain
    \t = add tabs)
    \n = baris baru
    \' = ad sinlr quote
    \" = add double quote
    \\ = add backslash
     */

    //Example Escaped String
    val statement1 = "Kotlin is \"Awesome!\"" // penggunaan \"
    println("$statement1")
    val statement2 = "Kotlin is \'Awesome!\'" // penggunaan \'
    println("$statement2")

    //Raw String (Literal String 2)
    val line = "Line 1\n"+
            "Line 2\n"+
            "Line 3\n"+
            "Line 4\n"
    println(line)

    //menjadi
    val line1 = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()
    println(line1)
//======================================================================


//======================================================================



//======================================================================
}








