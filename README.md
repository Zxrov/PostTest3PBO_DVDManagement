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

## Daftar Menu Program  
- Tambah DVD
- Tambah Film
- Lihat daftar DVD/Film
- Update data DVD/Film
- Hapus DVD/Film
- Sewa DVD/Film
- Kembalikan DVD/Film  
- Keluar 

---

## Penerapan Nilai Tambah (Override)

<img width="758" height="146" alt="image" src="https://github.com/user-attachments/assets/4e3da67d-09b1-4d93-8f33-837dce452b9b" />
<img width="710" height="153" alt="image" src="https://github.com/user-attachments/assets/15e92fdc-1c5f-436c-ad67-012897625821" />

Pada program ini, method tampilkanInfo() didefinisikan di superclass Film sebagai method umum.
Kemudian di subclass DVD dan OnlineMovie, method tersebut di-override dengan implementasi berbeda sesuai kebutuhan:

Di DVD, informasi yang ditampilkan meliputi ID, Judul, Genre, Status, dan Format DVD.
Di OnlineMovie, informasi yang ditampilkan meliputi ID, Judul, Genre, Status, dan Platform online.

Dengan override, meskipun pemanggilannya sama (film.tampilkanInfo()), output yang muncul akan menyesuaikan jenis objeknya (DVD atau OnlineMovie).

---

## Dokumentasi Menu Program  

<img width="998" height="327" alt="image" src="https://github.com/user-attachments/assets/5bc05c27-f85b-4336-82d1-b0d1a4b65ff3" />

Ini adalah tampilan menu dari hasil running project DVDpenyewaan.

---

<img width="634" height="106" alt="Screenshot 2025-09-22 141322" src="https://github.com/user-attachments/assets/639f6dd6-65af-45f1-80b7-90c2745a862a" />

<img width="585" height="97" alt="image" src="https://github.com/user-attachments/assets/6c371831-236b-49e5-9943-daf9bd3cf3ab" />

Ini adalah contoh untuk menambah data dari DVD dan Film.
User diharuskan untuk mengisi ID DVD/ Film. Judul, Genre, Format, Platform untuk menampilkan isi data.

---

<img width="695" height="76" alt="image" src="https://github.com/user-attachments/assets/feb4e2a1-7593-43b2-925f-9f1704effb3e" />

Ini adalah contoh untuk melihat daftar dari DVD dan Film.
User diharuskan untuk memilih Menu Nomor 3 dari daftar menu program. Data Berhasil ditambahkan.

---

<img width="629" height="96" alt="image" src="https://github.com/user-attachments/assets/97c88c3b-e6f4-4512-9375-a1b6c8ebd659" />

Ini adalah contoh untuk merubah data dari DVD dan Film.
User diharuskan untuk memilih Menu Nomor 4 dari daftar menu program. Data berhasil dirubah.

Film Conjuring Last Rites diubah datanya menjadi Conjuring 3: The Devil Made Me Do It!

---

<img width="602" height="50" alt="image" src="https://github.com/user-attachments/assets/dd6787ca-ed9c-4b21-a748-1684dbb1f669" />

Ini adalah contoh untuk menghapus data dari DVD dan Film.
User diharuskan untuk memilih Menu Nomor 5 dari daftar menu program. Data berhasil dihapus

Film Conjuring 3: The Devil Made Me Do It! Berhasil Dihapus.

---

<img width="711" height="44" alt="image" src="https://github.com/user-attachments/assets/4ee1242c-dc8e-494f-b626-68d9232c6cb1" />

Ini adalah contoh untuk menyewa data dari DVD dan Film.
User diharuskan untuk memilih Menu Nomor 6 dari daftar menu program. Data berhasil disewa

Film Cars 4 Berhasil Disewa.

---

<img width="436" height="60" alt="image" src="https://github.com/user-attachments/assets/c98060f6-0309-420d-a753-19f2332f6582" />

Ini adalah contoh untuk mengembalikan data yang disewa dari DVD dan Film.
User diharuskan untuk memilih Menu Nomor 7 dari daftar menu program. 

Film Cars 4 berhasil dikembalikan

---

<img width="602" height="67" alt="image" src="https://github.com/user-attachments/assets/2145fb15-46be-4d97-ba26-df55f54fc8b4" />

Ini adalah contoh untuk keluar dari menu DVD dan Film.
User diharuskan untuk memilih Menu Nomor 8 agar keluar dari daftar menu program. Keluar dari program...

BUILD SUCCESSFUL (total time: 28 minutes 27 seconds)




