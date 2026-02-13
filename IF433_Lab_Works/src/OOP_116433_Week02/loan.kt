package OOP_116433_Week02

class Loan(
    val bookTitle: String,
    val borrower: String,
    var loanDuration: Int = 1 // Default Argument 1 hari [cite: 106]
) {
    // Method untuk menghitung denda [cite: 106]
    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000 // Denda Rp 2.000 per hari setelah hari ke-3 [cite: 107]
        } else {
            0 // Denda 0 jika <= 3 hari [cite: 109]
        }
    }
}