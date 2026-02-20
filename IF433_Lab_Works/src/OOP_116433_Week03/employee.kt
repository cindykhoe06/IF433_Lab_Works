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
}