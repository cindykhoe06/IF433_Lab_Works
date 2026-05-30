package OOP_116433_Week14

interface Shape {
    fun area(): Int

    class Rectangle(private val width: Int, private val height: Int) : Shape {
        override fun area(): Int = width * height
    }

    class Square(private val side: Int) : Shape {
        override fun area(): Int = side * side
    }
}

