package OOP_116433_Week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Pembayaran E-Wallet sukses. Saldo tersisa: $balance")
        } else {
            println("Saldo tidak cukup")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("Top Up berhasil sebesar $amount. Saldo saat ini: $balance")
    }
}