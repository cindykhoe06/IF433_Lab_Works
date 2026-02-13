package OOP_116433_CindyPermatasari_WEEK01

fun GradingSystem() {
    //Refactor: gunakan val dan hapus tipe data eksplisit
    val name: String = "John Thor"
    val score: Int = 80

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

    val studentId: String? = null

    //jika null, gunakan nilai default o
    val idLength: Int = studentId?.length ?: 0

    println("Panjang Id: $idLength")
}

fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"