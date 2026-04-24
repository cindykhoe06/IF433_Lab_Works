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
}