fun main() {
    val gameTitle = "Mobile Legends"
    val price = 650000
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