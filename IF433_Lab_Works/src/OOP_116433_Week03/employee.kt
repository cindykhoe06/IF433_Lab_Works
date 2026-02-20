package OOP_116433_Week03

class employee(val name: String) {
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("error : gaji tidak boleh negatif! di set ke 0")
                field = 0 // gunakan field, bukan this.salary
            } else {
                field = value // gunakan field untuk assign nilai asli
            }
        }


    private var perfomanceRating: Int = 3

    fun increasePerfomationRating() {
        perfomanceRating++
        println("Kinerja $name meningkat! Rating: $perfomanceRating")
    }
// kita tidak buat getter untuk perfomance rating, jadi data ini benar-benar rahasia
//kecuali kita buat function khusus untuk print

    fun printStatus() {
        println("karyawan: $name, rating: $perfomanceRating")
    }

    // tax (pajak) dihitung 10% dari gaji saat ini
    val tax: Double
        get() = salary * 0.1

}