


fun main() {

    val printMessage =  { message: String -> println(message)}

    printMessage("Hojla micojla!!!")

    val sumA = { x: Int, y: Int -> x + y}

    println(sumA(5,8))


    fun downloadSomeData(url: String, completion: () -> Unit){
        // set downlosad request
        // we got a data back
        // there where no network errors

        completion()
    }

    // i sada kada pozovermo ovu funkciju ...

    downloadSomeData("www.apèple.com", {
        println("Ovaj cod se izvrsava naKn completion()")
    })



    fun downloadCarData(url: String, completion: (Car) -> Unit){
        // SEnd download request
        // we got bacvk Car data

        var car = Car("Peugeot", "308", "Red")
        completion(car)

    }


    downloadCarData("www.fake.com", {car ->

        println(car.model)
        println(car.accelerate())

    })


    downloadCarData("www.fake.com") {

        println(it.model)
        println(it.accelerate())

    }




    fun downloadKucaDAta(url: String, completionHandler: (Kuca?, Boolean) -> Unit){
        // SEnd download request
        // we got bacvk result of request

        val webRequestSucces = true
        if (webRequestSucces){
            // Primili smo Kuca data

            val newKIuca = Kuca("Mile,", "Trokatnica", "Zelwena")
            completionHandler(newKIuca, true)
        }else {
            completionHandler(null, false)
        }

    }

    downloadKucaDAta("www.dddd•com") { kuca, success ->
        if (success == true){

            // use kuca data za sta mi trebaju
            // change image , table wiew data etc

            if (kuca != null) {
                println(kuca.izvodjac)
                println(kuca.model)
                println(kuca.color)

                println("Izvodjac radova ${kuca.izvodjac} je  napravio divnu ${kuca.model} ${kuca.color} boje.")
            }

        }else{
                // handle the web request failuyre
            println("Something went wrong")
        }
    }




}