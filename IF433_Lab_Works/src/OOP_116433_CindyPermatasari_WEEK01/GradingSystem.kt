package OOP_116433_CindyPermatasari_WEEK01

fun main() {
    //Refactor: gunakan val dan hapus tipe data eksplisit
    val name: = "John Thor"
    val score: = 80

    //Refactor: string template ($name)
    println("Nama:" + name +", Nilai: " + score)
    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println("Grade Kamu: $grade")
    println("Status: ${calculateStatus(score)}")
}

fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"