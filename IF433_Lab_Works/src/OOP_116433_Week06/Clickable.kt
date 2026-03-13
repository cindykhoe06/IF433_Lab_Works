interface Clickable {
    // error : property in an interface cannot have a backing field
    val name: String = "Tombol Rahasia"
     // function without body (implicitly abstract)
    fun click()
}