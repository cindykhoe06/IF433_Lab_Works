package OOP_116433_Week05

fun main() {
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    //polymorphic collection: list yang berisi tipe paent, tapi yang isinya objek anak
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("====AKTIVITAS PEGAWAI====")
    for (pegawai in daftarPegawai) {
        //pemanggilan runtime polymorphism
        pegawai.bekerja()

        //pegawai.mengajar() // ini akan error karena tipe referensinya adalah pegawai
        // smart casting dengan is dan when

        when (pegawai) {
            is Dosen -> {
                println("=> terdeteksi sebagai dosen (NIDN: ${pegawai.nidn}")
                pegawai.mengajar() // smart cast! tidak perlu manual casting (as)
            }
            is Admin -> {
                println("=> terdeteksi sebagai admin")
                pegawai.doAdminWork()
            }
        }
        println("--------------------")
    }
}