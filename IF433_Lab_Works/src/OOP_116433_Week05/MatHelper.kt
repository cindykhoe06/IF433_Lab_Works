package OOP_116433_Week05

class MathHelper {
    // menghitung luas persegi
    fun hitungLuas(sisi: Int): Int {
        return sisi * sisi
    }

    // menghitung luas persegi panjang
    fun hitungLuas(panjang: Int, lebar: Int): Int {
        return panjang * lebar
    }

    // menghitung luas lingkaran
    fun hitungLuas(jarijari: Double): Double {
        return 3.14 * jarijari * jarijari
    }
}