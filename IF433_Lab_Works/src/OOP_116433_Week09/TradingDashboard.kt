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
}