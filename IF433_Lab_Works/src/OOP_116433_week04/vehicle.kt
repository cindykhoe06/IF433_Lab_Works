package OOP_116433_week04

//gunakan keyword 'open' agar class bisa diwariskan
open class vehicle(val brand: String) {
    var speed: Int = 0

    //method juga bersifat final secara default. Gunakan 'open' agar bisa di-override.
    open fun accelerate() {
        speed += 10
        println("$brand melaju. kecepatan: $speed km/jam")
    }

    open fun honk() {
        println("Beep Beep!")
    }
}