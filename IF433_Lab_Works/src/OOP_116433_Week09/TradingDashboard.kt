package OOP_116433_Week09

fun main() {
    // 2. Inisialisasi Data Uji
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 5, 2.0, "OPEN"), // Status OPEN (akan difilter)
        TradeLog("BTCUSDT", "SHORT", 50, -25.0, "CLOSED"),
        TradeLog("BNBUSDT", "LONG", 15, 10.0, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 10, -1.5, "OPEN")  // Status OPEN (akan difilter)
    )
    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades = closedTrades.filter { it.roe <= 0 }
    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }

    val worstPerformersString = losingTrades
        .sortedBy { it.roe } // Diurutkan dari minus terbesar ke terkecil
        .map { "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }

    val uniquePairs = tradeHistory.map { it.pair }.toSet()

    println("=== CRYPTO TRADING DASHBOARD ===")
    topPerformersString.forEach { println(it) }

    worstPerformersString.forEach { println(it) }
    println("\nUnique Pairs Traded: $uniquePairs")
}