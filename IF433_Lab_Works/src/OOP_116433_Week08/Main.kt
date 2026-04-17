package OOP_116433_Week08

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    //rantai safe calls yang elegan
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota tidak diketahui"
    println("Tujuan pengiriman: $destination")

    println("\n===TEST LET BLOCK====")
    val validOrder = Order(null, 250000)

    val receipt = validOrder.totalPrice?.let { price ->
        //blok ini hanya jalan jika totalPrice tidak null
        val tax = price * 0.11
        "Transaksi Valid. Harga: Rp$price, Pajak: Rp$tax"
    } ?: "Transaksi Invalid: Harga belum di-set!"
    println(receipt)

    println("\n=== TEST SAFE CASTING ===")
    val mixedData: List<Any> = listOf(
        "Smartphone",
        1500000,
        UserProfile("Andi", null),
        "Laptop",
        4500000.0
    )
    for (item in mixedData) {
        val text = item as? String

        // hanya jalan kalau berhasil cast ke String
        text?.let {
            println("Ditemukan teks: ${it.uppercase()}")
        }
    }
    println("\n=== SAFE CAST + ELVIS FALLBACK ===")

    val someObject: Any = 100 // Integer

    val safeString = someObject as? String ?: "Unknown String"
    println("Hasil cast + fallback: $safeString")

    println("\n=== TEST JAVA INTEROP===")
    val javaResponse = LegacyJavaAPI.fetchServerStatus()
    //kita menekan tombol !! karena kita tahu implementasi java-nya aman
    val statusLength = javaResponse!!.length
    println("Status dari Java: $javaResponse (Length: $statusLength)")
}
