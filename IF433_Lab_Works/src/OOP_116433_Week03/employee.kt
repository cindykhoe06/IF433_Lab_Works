package OOP_116433_Week03

class employee(val name: String) {
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("error : gaji tidak boleh negatif! di set ke 0")
                field = 0
            } else {
                field = value
            }
        }


    private var perfomanceRating: Int = 3

    fun increasePerfomationRating() {
        perfomanceRating++
        println("Kinerja $name meningkat! Rating: $perfomanceRating")
    }


    fun printStatus() {
        println("karyawan: $name, rating: $perfomanceRating")
    }

    val tax: Double
        get() = salary * 0.1

}