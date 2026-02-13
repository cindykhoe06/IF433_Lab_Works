package OOP_116433_Week02

class student (
    val name: String,
    val nim: String,
    var major: String
){
    //body class kosong dulu
}

class student (val name: String, val nim: String, val major: String) {
    init {
        //validasi sederhana : cek panjang nim
        if (nim.length != 5) {
            println("WARNING: obejk tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: objek student $name berhasil dialokasikan di memory.")
        }
    }
}