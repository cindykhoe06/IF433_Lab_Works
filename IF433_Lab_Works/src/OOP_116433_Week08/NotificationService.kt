package OOP_116433_Week08

class NotificationService {
    fun sendEmail(emailAddress: String) {
        println("Mengirim email ke: $emailAddress")
    }

    fun processUser(user: UserProfile) {
        //sendEmail(user.email) // ini akan error : type mismatch

        if (user.email != null) {
            // success via smart cast: compiler tahu 'user.email' pasti tidak null di blok ini
            sendEmail(user.email)
        } else {
            println("User ${user.name} tidak memiliki email.")
        }
        println("\n=== TEST THE RED BUTTON (!!) ===")
        val toxicData: String? = null

        try {
            // DANGEROUS: paksa non-null
            val length = toxicData!!.length
        } catch (e: NullPointerException) {
            println("CRASH (NPE)! Jangan gunakan !! secara sembarangan.")
        }
    }
}