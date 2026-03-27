package OOP_116433_Week07

fun main() {
    fun main() {
        println("=== TEST SINGLETON ====")
        println("Status: ${DatabaseManager.connectionStatus}")
        DatabaseManager.connect()
        DatabaseManager.connect()

        println("Drop chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")

        val weapon = Weapon.forgeStarterSword()
        println("Weapon: ${weapon.item.name}, Damage: ${weapon.item.damage}")
    }
}