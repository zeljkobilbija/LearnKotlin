fun main() {
    val a: String = "Ja se zovrem Janko"

    println(a)

    val b: String = "Ja se zovrem\n Janko"
    println(b)

    var c: String = "Ja se zovrem \tJanko"
    println(c)

    var rawString : String = """>Ja sagtdhgfhgfjh  
        |hgvjhvbmhbmjbmjb  
        |mhnbmnbmnb m,nm  
        |mnbmnbmbA Eeeeeeeeee
    """.trimMargin()
    println(rawString)

    for (char in c) {
        println(char)
    }

    val contentEquals = c.contentEquals("AAAAAloooo")
    println(contentEquals)

    val contains = c.contains("Janko")
    println(contains)

    val upercase = c.toUpperCase()
    val lover = c.toLowerCase()

    println(upercase)
    println(lover)

    val broj = 5
    val numString = broj.toString()

    val subsequence = c.subSequence(4,11)
    println(subsequence)


    val luke = "Luk Skywalker"
    val bojaKola = "green"
    val kola = "Landspeeder"
    val age = 28

    println("$luke has a $bojaKola $kola and ima $age godina")

    println("Luke bhas ${luke.toUpperCase()}")

}

