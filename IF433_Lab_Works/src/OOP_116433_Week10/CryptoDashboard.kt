package OOP_116433_Week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 2.3))
    coinRepo.add(Coin("USDT", 100.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("=== Crypto Dashboard ===")
    println("Response Status: ${response.status}")
    println("\n--- Coin List ---")
    response.data.forEach { coin ->
        println("Coin: ${coin.name} | Balance: ${coin.balance}")
    }
    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX001", 50.0))
    txRepo.add(Transaction("TX002", 150.0))
    txRepo.add(Transaction("TX003", 75.0))

    val txResponse = ApiResponse("200 OK", txRepo.getAll())

    println("\n--- Transaction List ---")
    println("Response Status: ${txResponse.status}")
    txResponse.data.forEach { tx ->
        println("ID: ${tx.id} | Amount: ${tx.amount}")
    }
}