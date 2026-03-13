package OOP_116433_Week06

//fungsi ini decoupled! tidak peduli kelas aslinya apa.
fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> memulai checkout...")
    method.pay(amount) //dynamic polymorphism in action
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== Testing Checkout ===")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)

    println("\n=== Testing Smart Home ===")

    val lampu = SmartLamp(id = "L01", name = "Ruang Tamu")
    val speaker = SmartSpeaker(id = "S01", name = "Google Nest Dapur")
    val cctv = SmartCCTV(id = "C01", name = "Cindy Garasi")

    val hub = SmartHomeHub()
    hub.addDevice(lampu)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    // Panggil logika Hub
    hub.activateSecurityMode()
    hub.turnOffAllSwitches()
}