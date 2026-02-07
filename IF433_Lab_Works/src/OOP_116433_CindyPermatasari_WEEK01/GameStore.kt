fun main() {
    val gameTitle = "Mobile Legends"
    val price = 650000

    val userNote: String? = null

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(title = gameTitle, finalPrice = finalPrice)

    println("Catatan    : ${userNote ?: "Tidak ada catatan"}")
}

fun calculateDiscount(price: Int): Int = if (price > 500000) {
    (price * 20) / 100
} else {
    (price * 10) / 100
}

fun printReceipt(title: String, finalPrice: Int) {
    println("=== Struk Pembelian ===")
    println("Judul Game : $title")
    println("Harga Akhir: Rp$finalPrice")
}