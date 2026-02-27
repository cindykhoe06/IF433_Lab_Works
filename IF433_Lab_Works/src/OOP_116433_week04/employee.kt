package OOP_116433_week04

open class Employee(val name: String, val baseSalary: Int) {

    open fun work() {
        println("$name sedang bekerja.")
    }

    open fun calculateBonus(): Int {
        // Mengembalikan nilai 10% dari baseSalary
        return (baseSalary * 10) / 100
    }
}