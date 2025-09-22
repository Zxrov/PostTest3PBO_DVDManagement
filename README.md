# Sistem Manajemen Penyewaan DVD 
Post Test 3 PBO: Sistem Manajemen Penyewaan Film/DVD berbasis Java. Menerapkan konsep OOP (Encapsulation, Inheritance, Overriding) dengan pola MVC sederhana, serta fitur CRUD, Sewa, dan Pengembalian.

Fitur utama mencakup:  
- CRUD (Create, Read, Update, Delete) data DVD/ Film Online
- Penyewaan DVD  
- Pengembalian DVD

## Konsep OOP yang Diterapkan
- **Encapsulation** → properti dibuat `private`, diakses dengan getter & setter.  
- **Inheritance** → class `Film` (superclass) diturunkan ke `DVD` dan `OnlineMovie`.  
- **Polymorphism & Overriding** → method `tampilkanInfo()` dioverride sesuai jenis film.  
- **Packages** → kode dipisah berdasarkan fungsinya (main, model, service).  

---

## ✨ Fitur Program  
- Tambah DVD
- Tambah Film
- Lihat daftar DVD/Film
- Update data DVD/Film
- Hapus DVD/Film
- Sewa DVD/Film
- Kembalikan DVD/Film  
- Keluar 

---

## 🚀 Cara Menjalankan  
1. Clone repository ini.  
2. Buka di **NetBeans** atau IDE Java lainnya.  
3. Pastikan `MainApp` diset sebagai **Main Class**.  
4. Jalankan program dengan **Run Project (F6)**.  

---

## 📖 Contoh Jalannya Program
=== Sistem Manajemen Penyewaan DVD ===

Tambah DVD

Lihat Daftar DVD

Update DVD

Hapus DVD

Sewa DVD

Kembalikan DVD

Keluar


---

### 📌 Penjelasan MVC
- **Model (`model/DVD.java`)**  
  Berisi struktur data DVD: `id`, `judul`, `genre`, dan `status`.  
  - Menerapkan **constructor** untuk inisialisasi data.  
  - Menggunakan **access modifier (private)** dengan getter dan setter.  

- **View & Controller (`main/MainApp.java`)**  
  - View: Menampilkan menu dan menerima input dari user (Scanner).  
  - Controller: Menghubungkan input user ke logika program (memanggil method di `DVDService`).  

- **Service (`service/DVDService.java`)**  
  Berisi logika utama program:  
  - Menyimpan data DVD di dalam `ArrayList`.  
  - Operasi CRUD (tambah, lihat, update, hapus).  
  - Operasi khusus penyewaan dan pengembalian DVD.  

---

## 🔄 Alur Program  





