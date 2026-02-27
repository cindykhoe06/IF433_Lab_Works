package OOP_116433_week04

// asumsi class car sudah ada dari tugas sebelumnya
class ElectricCar(
    brand: String,
    numberOfDoors: Int,
    val batteryCapacity: Int
) : car(brand, numberOfDoors) {

    final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
    }
}

