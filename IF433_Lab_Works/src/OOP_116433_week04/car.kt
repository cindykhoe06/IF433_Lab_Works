package OOP_116433_week04

//car "is-a" vehicle. parameter brand dilempar ke atas melalui vehicle(brand)
open class car(brand: String, val numberOfDoors:Int) : vehicle(brand) {
    fun openTrunk() {
        println("bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }

    override fun honk() {
        println("Tin Tin! mobil $brand lewat!")
    }

    override fun accelerate() {
        super.accelerate() //memanggil logika penambahan kecepatan milik parent
        println("mobil $brand menggunakan transmisi gigi untuk menambah kecepatan")
    }
}

