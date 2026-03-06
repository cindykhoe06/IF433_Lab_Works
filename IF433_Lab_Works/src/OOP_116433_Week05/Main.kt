package OOP_116433_Week05

fun main() {
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    //polymorphic collection: list yang berisi tipe paent, tapi yang isinya objek anak
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("====AKTIVITAS PEGAWAI====")
    for (pegawai in daftarPegawai) {
        //pemanggilan runtime polymorphism
        pegawai.bekerja()

        //pegawai.mengajar() // ini akan error karena tipe referensinya adalah pegawai
        // smart casting dengan is dan when

        when (pegawai) {
            is Dosen -> {
                println("=> terdeteksi sebagai dosen (NIDN: ${pegawai.nidn}")
                pegawai.mengajar() // smart cast! tidak perlu manual casting (as)
            }
            is Admin -> {
                println("=> terdeteksi sebagai admin")
                pegawai.doAdminWork()
            }
        }
        println("--------------------")
    }
    println("\n====TUGAS MANDIRI 1====")
    val mathHelper = MathHelper()
    println("Luas Persegi (4): ${mathHelper.hitungLuas(4)}")
    println("Luas Persegi Panjang (5,3): ${mathHelper.hitungLuas(5, 3)}")
    println("Luas Lingkaran (7.0): ${mathHelper.hitungLuas(7.0)}")

    println("\n====TUGAS MANDIRI 2: POLYMORPHISM====")
    val myEWallet = EWallet("Akun E-Wallet", 50000.0)
    val myCreditCard = CreditCard("Akun Credit Card", 100000.0)

    val paymentList: List<PaymentMethod> = listOf(myEWallet, myCreditCard)
    val tagihan = 75000.0

    for (method in paymentList) {
        println("--> Mencoba pembayaran dengan ${method.accountName}")
        method.processPayment(tagihan)
        if (method is EWallet) {
            println("[Sistem mendeteksi ini adalah E-Wallet. Memulai Recovery Top Up...]")
            method.topUp(50000.0) // method otomatis menjadi EWallet
            println("--> Mencoba pembayaran ulang dengan E-Wallet...")
            method.processPayment(tagihan)
        }
        println("--------------------")
    }
}