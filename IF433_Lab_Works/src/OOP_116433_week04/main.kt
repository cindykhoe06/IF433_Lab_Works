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

    println("--- TUGAS MANDIRI 1 ---")
    // Instansiasi ElectricCar (isi parameter sesuai keinginanmu)
    val myEV = ElectricCar("Tesla", 4, 98)

    // Memanggil method sesuai instruksi
    myEV.accelerate()
    myEV.honk()       // Memanggil method dari parent Car
    myEV.openTrunk()  // Memanggil method dari parent Car

    println("\n--- TUGAS MANDIRI 2 ---")
    // Instansiasi Manager dan Developer
    val manager = Manager("Budi", 10000000)
    val developer = Developer("Siti", 8000000, "Kotlin")

    // Panggil fungsi work dan cetak calculateBonus untuk Manager
    manager.work()
    println("Bonus yang didapat: Rp ${manager.calculateBonus()}")

    println()

    // Panggil fungsi work dan cetak calculateBonus untuk Developer
    developer.work()
    println("Bonus yang didapat: Rp ${developer.calculateBonus()}")
}