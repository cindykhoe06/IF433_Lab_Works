package OOP_116433_Week12

//custom exception dengan membawa data tambahan

class InsufficientFundsException(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")