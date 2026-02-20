package OOP_116433_Week03

fun main() {
    val e = employee("budi")
    e.salary = -1000
    e.salary = 5000000
    println("gaji: ${e.salary}")
    e.increasePerfomationRating()
    println("pajak yang harus dibayar: ${e.tax}")

    println("TUGAS 1: UJI COBA WEAPON")

    // 1. Buat objek Weapon
    val pedang = Weapon("Excalibur")

    // 2. Coba set damage ke -50 (harus gagal/tetap nilai default)
    pedang.damage = -50
    println("Damage setelah di-set -50: ${pedang.damage}")

    // 3. Coba set damage ke 9999 (harus dipaksa jadi 1000)
    pedang.damage = 9999
    println("Damage setelah di-set 9999: ${pedang.damage}")

    // 4. Print Tier-nya
    println("Tier Senjata: ${pedang.tier}")
}