package OOP_116433_Week08

fun main(){
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    //rantai safe calls yang elegan
    val destination = emptyOrder.deliveryDetails?.address?.city?.name?:"Kota tidak diketahui"
    println("Tujuan pengiriman: $destination")

    println("\n===TEST LET BLOCK====")
    val validOrder = Order(null, 250000)

    val receipt = validOrder.totalPrice?.let {price ->
        //blok ini hanya jalan jika totalPrice tidak null
        val tax = price * 0.11
        "Transaksi Valid. Harga: Rp$price, Pajak: Rp$tax"
    } ?: "Transaksi Invalid: Harga belum di-set!"
    println(receipt)

    println("\n=== TEST SAFE CASTING ===")
    val mixedData: List<Any> = ListOf(
        "Smartphone"
        1500000,
        userProfile("Andi", null),
        "Laptop",
        4500000.0
    )
}
