package OOP_116433_week04

fun main () {
    println("---Testing Vehicle---")
    val generalvehicle = vehicle(brand = "sepeda onthel")
    generalvehicle.honk()
    generalvehicle.accelerate()

    println("\n---Testing Car---")
    val mycar = car(brand = "toyota", numberOfDoors = 4)
    mycar.openTrunk() //memanggil method milik sendiri
    mycar.honk() // memanggil method yang sudah di-override
    mycar.accelerate() // memanggil gabungan method parent dan child
}