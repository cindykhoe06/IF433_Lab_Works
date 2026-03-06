package OOP_116433_Week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}