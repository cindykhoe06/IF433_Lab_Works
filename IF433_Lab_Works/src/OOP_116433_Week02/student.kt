package OOP_116433_Week02

class student (val name: String, val nim: String, val major: String, var gpa: Double = 0.0) {
    init {
        //validasi sederhana : cek panjang nim
        if (nim.length != 5) {
            println("WARNING: obejk tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: objek student $name berhasil dialokasikan di memory.")
        }
    }
    //secondary constructor
//wajib memanggil primary constructor menggunakan 'this()' constructor
    constructor(name: String, nim: String) : this(name, nim, "Non-Matriculated") {
        println("LOG: Menggunakan constructor  jalur umum (Tanpa Jurusan).")
    }
}