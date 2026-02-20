package OOP_116433_Week03

class Weapon(val name: String) {

    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("Peringatan: Damage tidak boleh negatif! Nilai dipertahankan.")
                // Kita tidak melakukan 'field = value', sehingga nilai tetap yang lama
            } else if (value > 1000) {
                field = 1000 // Paksa jadi 1000 jika overpowered
            } else {
                field = value // Nilai valid
            }
        }

    val tier: String
        get() {
            return when {
                damage > 800 -> "Legendary"
                damage > 500 -> "Epic"
                else -> "Common"
            }
        }
}