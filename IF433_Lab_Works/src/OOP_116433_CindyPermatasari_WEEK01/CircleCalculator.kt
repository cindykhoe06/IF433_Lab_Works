package OOP_116433_CindyPermatasari_WEEK01

fun main() {
    val radius  = 7.0
    val pi  = 3.14

    var area = pi * radius * radius

    println("Radius: $radius")
    println("Check Size: ${checkSize(area)}")
}

fun checkSize(area: Double): String {
    if (area > 100) {
        return "This is a Big Circle"
    } else {
        return "This is a Small Circle"
    }
}