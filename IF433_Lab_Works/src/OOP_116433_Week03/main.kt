package OOP_116433_Week03

fun main() {
    val e = employee("budi")

    // 1. test validasi salary
    e.salary = -1000
    e.salary = 5000000
    println("gaji: ${e.salary}")

    //2. test encapsulation
    e.increasePerfomance()
    //e.perfomanceRating = 5 ini error

    //3. test computed property
    println("pajak yang harus dibayar: ${e.tax}")
}