fun main() {

    val car = Car("Toyota", "Corola", "Red")

    println(car.make)
    println(car.model)

    car.accelerate()

    val kuca = Kuca("Neimar","Trosobna", "Cigla Boja")

    println(kuca.izvodjac)
    println(kuca.model)

    val newCar = CarChild("Ford", "Iveco", "Green")
    newCar.accelerate()
    newCar.park()
    newCar.brake()

}


open class Veicolo(val maker: String, val model: String ){

    open fun accelerate(){
        println("Wroom,   Wrooooommmm!!!")
    }

    fun park(){
        println("parking the vehicle")
    }

    open fun brake() {
        println("Stop")
    }

}

class CarChild(maker: String, model: String, var coclor: String) : Veicolo(maker, model) {


    override fun brake() {

        println("OVERIDE BRAKE FUN")
    }

}



open class Car constructor(make: String, model: String, var color: String){

    val make = make
    val model = model

    fun accelerate(){
       println("vroom, vrooom")
         }

    }

class Kuca(val izvodjac: String, val model: String, var color: String){
// isto kao i class Car bez constructora i lokalnih variabli

}