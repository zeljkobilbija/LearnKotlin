fun main() {
// Imutable

    val imperials = listOf("Emperor", "Dart Vader", "Bobs Feta", "Tarkin")
    println(imperials)
    println(imperials.sorted())
    println(imperials[2])
    println(imperials.sorted()[2])
    println(imperials.last())
    println(imperials.contains("Emperor"))
    println(imperials.contains("Luke"))


    // Mutable

    var rebels = arrayListOf("Leila", "Luke", "Han Solo", "Mon Mothma")
    println(rebels)

    println(rebels.size)

    rebels.add("Chewbacca")
    println(rebels)

    rebels.add(0, "King Kong")
    println(rebels)

    println(rebels.indexOf("Luke"))

    rebels.remove("Han Solo")
    println(rebels)

    rebels.removeAt(0)
    println(rebels)

    // Key -Value pars -Apple Dictionary
// Imuteble
    val rebelVeichlesMap = mapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder")  // Map of type <String: String>
    println(rebelVeichlesMap)

    println(rebelVeichlesMap["Solo"])
    println(rebelVeichlesMap.get("Luke"))
    println(rebelVeichlesMap.getOrDefault("Lejla", "This sheep doesnt exist!"))
    println(rebelVeichlesMap.keys)
    println(rebelVeichlesMap.values)

    // Key -Value pars -Apple Dictionary
// Mutable

    val rebelVozila = hashMapOf("Zeljko" to "Ford", "Tanja" to "Peugeot")
    println(rebelVozila)

    rebelVozila["Zeljko"] = "XXXWing"
    println(rebelVozila)

    rebelVozila.put("Katariana", "Bicikla")
    println(rebelVozila)

    rebelVozila.remove("Zeljko")
    println(rebelVozila)

    rebelVozila.clear()
    println(rebelVozila)

    println(rebelVozila.isEmpty())

}