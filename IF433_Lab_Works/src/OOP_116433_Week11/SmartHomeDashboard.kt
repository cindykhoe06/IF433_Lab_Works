package OOP_116433_Week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice("Philips W2 Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
        println("[Setup] Lampu ${it.name} ditambahkan.")
    }
    SmartDevice("Kolin", "Camera").apply {
        isOnline = true
        powerLoad = 8
    }.also {
        println("[S.OG] Kamera terhubung")
        homeDevices.add(it)
    }
}