interface Clickable {
    val name: String // abstract property, tidak ada nilai default
    fun click()
}

class Button(override val name: String) : Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}