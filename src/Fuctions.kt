fun main() {

    var rezultat = zbir(5, 9)

    println("Ukupan zbir je $rezultat")

    println("Ukupan rezultat je ${zbir(5,12)}")

    rasoilopzenje()
    rasoilopzenje("Osecam se sjajno")


}


fun zbir(brojA: Int, brojB: Int): Int {
    var rez = brojA + brojB
    return rez
}


// fun sa default valur

fun rasoilopzenje(mood: String = "Besan ko ris"){
    println(mood)
}