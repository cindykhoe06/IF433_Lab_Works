package OOP_116433_Week09

fun main () {
    println("=== TEST LIST ===")
    //immutable list: tidak bisa diubah setelah dibuat
    val frameworks: List<String> = listOf("kotlin", "java", "C++")
    //frameworks.add("Phython") // uncomment ini akan error
    println("Immutable List: $frameworks")

    //mutable list: bisa ditambah/dikurangi
    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: $scores")

    println("\n=== TEST SET ===")
    val uniqueNumbers = setOf(1, 2, 2, 3, 3, 4)
    println("Unique numbers (Set) : $uniqueNumbers") // duplikat hilang

    val activeUsers = mutableSetOf("UserA", "UserB")
    activeUsers.add("UserC")
    activeUsers.add("UserA") // diabaikan karena sudah ada
    println("Active Users: $activeUsers")

    println("\n=== TEST MAP ===")
    val studentGrades = mapOf(
        "Alice" to "A",
        "Bob" to "B",
        "Charlie" to "A" //value boleh duplikat key tidak
    )
    println("Nilai Bob: ${studentGrades["Bob"]}")

    val inventory =  mutableMapOf("Apples" to 50, "Bananas" to 30)
    inventory["Oranges"] = 20 //menambah data baru
    inventory["Apples"] = 45 //mengupdate data lama
    println("Inventory: $inventory")
}