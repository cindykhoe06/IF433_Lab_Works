package OOP_116433_Week10

class WalletRepository<T> {
    private var items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items.toList()
    }
}

fun <T : Named> WalletRepository<T>.search(query: String): List<T> {
    return getAll().filter { it.name.contains(query, ignoreCase = true) }
}
