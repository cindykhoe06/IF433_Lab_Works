package OOP_116433_Week05

class Dosen(nama: String, val nidn: String): Pegawai(nama) {
    //wajib di override karena fungsi bekerja() bersifat abstract di parent
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan merevisi rpkps.")
    }

    //fungsi unik/spesifik yang hanya dimiliki dosen
    fun mengajar() {
        println("[$nama] sedang mengajar mahasiswa di kelas.")
    }
}