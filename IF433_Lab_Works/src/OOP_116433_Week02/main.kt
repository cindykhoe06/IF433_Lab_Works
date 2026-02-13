package OOP_116433_Week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("----APLIKASI PMB UMN---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan Nim (Wajib 5 karakter): ")
    val nim = scanner.next()
    scanner.nextLine() // Bersihkan buffer

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        print("Pilih jalur (1. Reguler, 2. Umum): ")
        val type = scanner.nextInt()
        scanner.nextLine() // Consume newline

        if (type == 1) {
            print("Masukkan Jurusan: ")
            val majorInput = scanner.nextLine()
            val s1 = student(name, nim, majorInput)
            println("Status: Pendaftaran Selesai.")
            println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
        } else if (type == 2) {
            val s2 = student(name, nim)
            println("Status: Pendaftaran Selesai.")
            println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
        } else {
            println("Pilihan ngawur, pendaftaran batal!")
        }
    }

    println("\n--- INPUT PEMINJAMAN BUKU ---")

    print("Judul Buku: ")
    val title = scanner.nextLine()

    print("Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    // Validasi input
    if (duration < 0) {
        duration = 1
    }

    val loan = Loan(title, borrower, duration)

    println("\n--- DETAIL PEMINJAMAN ---")
    println("Buku: ${loan.bookTitle}")
    println("Peminjam: ${loan.borrower}")
    println("Durasi: ${loan.loanDuration} hari")
    println("Total Denda: Rp ${loan.calculateFine()}")

    scanner.nextLine()

    println("\n--- WELCOME TO MINI RPG ---")
    print("Nama Hero: ")
    val heroName = scanner.nextLine() // Ganti next() jadi nextLine() biar bisa spasi

    print("Base Damage: ")
    val damage = scanner.nextInt()

    val myHero = Hero(heroName, damage)
    var enemyHp = 100

    // Main Loop
    while (myHero.isAlive() && enemyHp > 0) {
        println("\nHP ${myHero.name}: ${myHero.hp} | HP Enemy: $enemyHp")
        println("Menu: 1. Serang, 2. Kabur")
        print("Pilihan: ")
        val choice = scanner.nextInt()

        if (choice == 1) {
            // Hero Menyerang
            myHero.attack("Enemy")
            enemyHp -= myHero.baseDamage
            println("HP Musuh tersisa: $enemyHp")

            // Musuh membalas jika masih hidup
            if (enemyHp > 0) {
                val monsterDamage = (10..20).random()
                myHero.takeDamage(monsterDamage)
                println("Musuh menyerang balik! $heroName menerima $monsterDamage damage.")
            }
        } else if (choice == 2) {
            println("Kamu melarikan diri dari pertarungan!")
            break
        }
    }

    // Pengumuman pemenang
    if (!myHero.isAlive()) {
        println("\nGAME OVER... ${myHero.name} telah gugur.")
    } else if (enemyHp <= 0) {
        println("\nVICTORY! Musuh berhasil dikalahkan.")
    }
}