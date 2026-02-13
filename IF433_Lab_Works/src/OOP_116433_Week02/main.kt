package OOP_116433_Week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("----APLIKASI PMB UMN---")

    print("Masukkan Nama:")
    val name = scanner.nextLine()

    print("Masukkan Nim (Wajib 5 karakter):")
    val nim = scanner.next()

    scanner.nextLine() // bersihkan buffer newline (penyakit klasik scanner)

    //validasi di sisi pemanggil (Main)
    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
        // program berhenti di sini untuk mahasiswa ini, tidak membuat objek
    } else {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()
    }

    // instansiasi objek karena data sudah aman
    val s1 = student(name, nim, major)
}

