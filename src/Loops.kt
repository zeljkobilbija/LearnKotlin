fun main() {

    var rebels = arrayListOf("Leila", "Luke", "Han Solo", "Mon Mothma")

    val rebelVozila = hashMapOf("Zeljko" to "Ford", "Tanja" to "Peugeot")


    for (rebel in rebels){
        println("Name : $rebel")
    }



    for ((key, value) in rebelVozila){
        println("$key gets around in their $value")
    }


    var x = 10

    while (x > 0) {
        println(x)
        x = x - 1
    }

    var y = 10

    while (y > 0) {
        println(y)
        y--  // y++
    }

}