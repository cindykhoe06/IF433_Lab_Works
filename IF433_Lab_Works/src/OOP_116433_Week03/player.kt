package OOP_116433_Week03

class Player(val username: String) {

    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount > 0) {
            val oldLevel = level
            xp += amount
            if (level > oldLevel) {
                println("Level Up! Selamat $username naik ke level $level")
            }
        } else {
            println("Peringatan: XP yang ditambahkan harus angka positif!")
        }
    }

}