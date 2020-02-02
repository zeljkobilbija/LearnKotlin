fun main() {

    var name : String = "JohnnyB"

   // name = null  ->> NIJE MOGUCE NAPRAVITI null od non nul objekta

    var nulableName: String? = "Do I really exist?"
    println(nulableName)

    //nulableName = null
    //nulableName = null


    println(nulableName)

    // NULL Chek

    var lenght = 0

    if (nulableName != null){
        lenght = nulableName.length
        println(lenght)
    } else {
        lenght = -1
        println(lenght)
    }

    // Ovo je isto kjao i ovo gore
    val l = if (nulableName != null) nulableName.length else -1

    // Second NULL chek method call opetaror ?

    println(nulableName?.length)

    // Third method is Elvis Operator

    val len = nulableName?.length ?: -1
    println(len)

    val noName = nulableName ?: "No one knows me..." // Default value if is null
    println(noName)


    // !! method  ->>  Kao force unvraping in Swift (!)
    println(nulableName!!.length)

}