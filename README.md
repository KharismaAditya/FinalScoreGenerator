# 🎓 Student Final Score Calculator

## 📘 Deskripsi Proyek
Proyek ini merupakan program sederhana berbasis Java yang digunakan untuk **menghitung nilai akhir siswa** berdasarkan dua faktor utama:
- **Nilai akademik (grade)**
- **Kehadiran (attendance)**

Setiap siswa akan mendapatkan nilai akhir dengan bobot tertentu, kemudian program akan menentukan apakah siswa **lulus atau tidak** berdasarkan skor akhir.

---

## 🧩 Struktur File

| File | Deskripsi |
|------|------------|
| **Mainapp.java** | Kelas utama yang menjalankan program, menerima input dari pengguna, dan memproses daftar siswa. |
| **Student.java** | Kelas yang merepresentasikan data siswa (nama, nilai, kehadiran) beserta getter dan setter. |
| **School.java** | Kelas yang mengimplementasikan interface `Calculated`, berfungsi menampilkan hasil akhir perhitungan nilai siswa. |
| **Calculated.java** | Interface yang berisi method statis `calculateFinalScore()` untuk menghitung nilai akhir berdasarkan bobot. |

---

## ⚙️ Cara Menjalankan Program

1. Pastikan kamu memiliki **Java Development Kit (JDK)** terinstal di komputer.  
   Cek dengan perintah:
   ```bash
   java -version
2. Simpan semua file .java dalam satu folder.
3. Buka terminal pada folder tersebut, lalu kompilasi semua file:
   ```bash
   javac *.java
4. Jalankan program utama:
   ```bash
   java Mainapp
5. Masukkan jumlah siswa dan data tiap siswa sesuai instruksi di layar.

## 🧠 Logika Perhitungan
Nilai akhir siswa dihitung dengan rumus berikut:
  Final Score = (Grade * 0.8) + (Attendance * 0.2)
Jika nilai akhir ≥ 75, maka siswa lulus; jika tidak, maka tidak lulus.



## 🧮 Contoh Output
  ```bash
  === CALCULATE FINAL SCORE ===
  Enter the number of Students: 2
  ==STUDENT 1 ==
  Insert Student Name: Andi
  Insert Student Grade: 90
  Insert Student Attendance: 80
  
  ==STUDENT 2 ==
  Insert Student Name: Budi
  Insert Student Grade: 60
  Insert Student Attendance: 90
  
  === RESULT(S) ===
  Andi passed with score :88.0
  Budi failed with score :66.0


