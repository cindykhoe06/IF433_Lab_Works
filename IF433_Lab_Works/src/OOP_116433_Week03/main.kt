package OOP_116433_Week03

fun main() {
    val e = employee("budi")
    e.salary = -1000
    e.salary = 5000000
    println("gaji: ${e.salary}")
    e.increasePerfomationRating()
    println("pajak yang harus dibayar: ${e.tax}")

    println("TUGAS 1: UJI COBA WEAPON")
    val pedang = Weapon("Excalibur")
    pedang.damage = -50
    println("Damage setelah di-set -50: ${pedang.damage}")
    pedang.damage = 9999
    println("Damage setelah di-set 9999: ${pedang.damage}")
    println("Tier Senjata: ${pedang.tier}")

    println("TUGAS 2: PLAYER")
    val player1 = Player("Gamer123")
    player1.addXp(50)
    println("Level ${player1.username} saat ini: ${player1.level}")
    player1.addXp(60)
}
