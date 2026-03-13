package OOP_116433_Week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }

    fun turnOffAllSwitches() {
        println("\n--- Mematikan Semua Perangkat (Switchable) ---")
        for (device in devices) {
            // Smart Casting
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }

// Lanjut ke fungsi activateSecurityMode di bawah...