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


    // instansiasi objek karena data sudah aman
    val s1 = student(name, nim, major)
    println("status: pendaftaran selesai.")
    }

    print("Pilih jalur (1. Reguler, 2. Umum): ")
    val type = scanner.nextInt()
    scanner.nextLine() //consume newline

    if (type == 1) {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()
        // memanggil primary constructor
        val s1 = student(name, nim, major)
        println("terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
    } else if (type == 2) {
        val s2 = student(name, nim)
        println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
    } else {
        println("Pilihan ngawur, pendaftaran batal!")
    }
}

