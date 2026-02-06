package OOP_116433_CindyPermatasari_WEEK01

fun main(args: Array<String>) {
    //variable definition
    val radius  = 7.0
    val pi  = 3.14

    //calculation
    var area = pi * radius * radius

    //output concatenation
    println("Radius: $radius")

    //logic check
    checkSize(area)
    println("Check Size: ${checkSize(area)}")
}

fun checkSize(area: Double) { if (area > 100)
    "This is a Big Circle"
     else
        "This is a Small Circle"
}