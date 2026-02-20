package OOP_116433_Week03

fun main() {
    val e = employee("budi")
    e.salary = -1000
    e.salary = 5000000
    println("gaji: ${e.salary}")
    e.increasePerfomationRating()
    println("pajak yang harus dibayar: ${e.tax}")
}