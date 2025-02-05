# MuhammadRidhoAbdawi-2110010175-UTS
 Apikasi Buku Alamat

Aplikasi Buku Alamat adalah program berbasis Java yang memungkinkan pengguna untuk menyimpan, mencari, memperbarui, dan menghapus data kontak dalam sebuah database SQLite. Aplikasi ini juga mendukung ekspor dan impor data ke/dari file teks.

## 📌 Fitur Utama
- **Tambah Data**: Menambahkan kontak baru dengan nama, alamat, dan nomor telepon.
- **Perbarui Data**: Memperbarui informasi kontak yang sudah ada.
- **Hapus Data**: Menghapus kontak berdasarkan ID.
- **Pencarian Data**: Mencari kontak berdasarkan nama, alamat, atau nomor telepon.
- **Ekspor ke File**: Menyimpan data dalam file teks.
- **Impor dari File**: Memasukkan data dari file teks ke dalam database.
- **Validasi Input**: Memastikan semua data yang dimasukkan valid.

## ⚙️ Teknologi yang Digunakan
- **Java (Swing)** – Untuk antarmuka pengguna.
- **SQLite (JDBC)** – Untuk penyimpanan database.
- **Maven/Gradle** (Opsional) – Untuk manajemen dependensi.

## 📥 Instalasi dan Penggunaan
### **1. Clone Repository**
```sh
git clone https://github.com/username/aplikasi-buku-alamat.git
cd aplikasi-buku-alamat
```

### **2. Pastikan Java Sudah Terinstal**
Pastikan Anda memiliki **Java JDK 8+** terinstal. Cek dengan perintah berikut:
```sh
java -version
```

### **3. Jalankan Aplikasi**
Kompilasi dan jalankan aplikasi menggunakan perintah berikut:
```sh
javac -cp .;sqlite-jdbc.jar AplikasiBukuAlamat.java
java -cp .;sqlite-jdbc.jar AplikasiBukuAlamat
```
Jika menggunakan IDE seperti **IntelliJ IDEA** atau **NetBeans**, cukup jalankan file `AplikasiBukuAlamat.java`.

## 📚 Struktur Proyek
```
├── src/
│   ├── AplikasiBukuAlamat.java   # Kelas utama aplikasi
│   ├── DatabaseConnection.java   # Kelas untuk koneksi database
│   ├── GUIForm.java              # Kelas untuk tampilan GUI
│   ├── utils/                    # Folder untuk fungsi utilitas
│   ├── assets/                   # Folder untuk ikon/gambar
├── addressbook.db                # Database SQLite
├── README.md                     # Dokumentasi proyek
├── sqlite-jdbc.jar                # Driver JDBC SQLite
```

## 🛠️ Pengembangan
### **Menambahkan Fitur Baru**
1. Fork repository ini.
2. Buat branch baru (`feature-nama-fitur`):
   ```sh
   git checkout -b feature-nama-fitur
   ```
3. Lakukan perubahan dan commit:
   ```sh
   git commit -m "Menambahkan fitur pencarian berdasarkan email"
   ```
4. Push branch ke GitHub:
   ```sh
   git push origin feature-nama-fitur
   ```
5. Buat **Pull Request** untuk menggabungkan perubahan.

## 📝 Lisensi
Proyek ini menggunakan lisensi **MIT License**. Anda bebas untuk menggunakan dan memodifikasinya.

## 👨‍💻 Kontributor
Jika Anda ingin berkontribusi, silakan buat **Pull Request** atau ajukan **Issue**.

---
**📩 Kontak**: Jika ada pertanyaan, hubungi [ashakun20@gmail.com](mailto:ashakun20@gmail.com).

