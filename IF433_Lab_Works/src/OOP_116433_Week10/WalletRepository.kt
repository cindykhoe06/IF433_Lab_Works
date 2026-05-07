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