package OOP_116433_Week08

fun main() {
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"),
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"), // Missing ID
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD") // Unknown type
    )

    val parser = ApiParser()

    for (raw in rawApiData) {
        try {
            val product = parser.parseProduct(raw)

            // Menggunakan .let jika tidak null
            product?.let {
                parser.checkout(it)
            }
        } catch (e: IllegalArgumentException) {
            println("Peringatan Log: Data korup ditangkap - ${e.message}")
        }
    }
}