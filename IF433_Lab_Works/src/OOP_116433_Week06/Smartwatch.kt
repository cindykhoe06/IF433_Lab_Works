package OOP_116433_Week06

//menggabungkan 1 parent class dan 2 interfaces
class Smartwatch : Watch(), BluetoothConnectable, Rechargeable {
    override fun showTime() {
        println("Layar OLED menyala: 14:00 WIB")
    }

    override fun connectToBluetooth() {
        println("Mencari Perangkat HP di sekitar untuk pairing")
    }

    override fun chargeBattery() {
        println("Mengisi daya menggunakan charger magnetik 15w")
    }
}