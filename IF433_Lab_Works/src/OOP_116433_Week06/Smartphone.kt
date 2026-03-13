package OOP_116433_Week06

//error: class smartphone inherits multiple implementations of turnOn()
class Smartphone : Camera, Phone {
    //manually override to resolve ambiguity
    override fun turnOn() {
        super<Phone>.turnOn() //menjalankan logika camera
        super<Phone>.turnOn() //menjalankan logika phone
        println("Sistem operasi Smartphone berhasil booting.")
    }
}