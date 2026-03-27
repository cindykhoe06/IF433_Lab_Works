package OOP_116433_Week07

fun main() {
    fun main() {
        println("=== TEST SINGLETON ====")
        println("Status: ${DatabaseManager.connectionStatus}")
        DatabaseManager.connect()
        DatabaseManager.connect()

        val weapon = Weapon.forgeStarterSword()

        val upgradedItem = weapon.item.copy(damage = 25)

        processEvent(BattleState.SafeZone)
        processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
        processEvent(BattleState.LootDropped(upgradedItem))
        processEvent(BattleState.GameOver("Terkena jebakan racun"))
    }
}