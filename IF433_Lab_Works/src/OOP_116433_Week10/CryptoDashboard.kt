package OOP_116433_Week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 2.3))
    coinRepo.add(Coin("USDT", 100.0))

    println("=== Crypto Dashboard ===")
    println("Coin repository populated with BTC, ETH, USDT.")
}