package OOP_116433_Week11

data class SmartDevice(
    var name: String,
    var category: String,
    var isOnline: Boolean = false,
    var id: Int = 0,
    var powerLoad: Int = 0
)

fun SmartDevice.diagnose(): String {
    val status = if (isOnline) "Online" else "Offline"
    return "Nama: $name | Kategori: $category | Status: $status | Daya: ${powerLoad}W"
}