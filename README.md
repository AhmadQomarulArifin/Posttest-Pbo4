# Posttest-Pbo4

# Program CRUD Klinik Hewan Peliharaan

Deskripsi Program

Program ini adalah manajemen data hewan di klinik yang dibuat dengan bahasa Java menggunakan konsep Object-Oriented Programming (OOP). Aplikasi ini menerapkan encapsulation, inheritance, overriding, abstraction dan polymorphism dengan struktur berbasis Model-View-Controller (MVC). Fitur utamanya meliputi CRUD data hewan, validasi input, serta pencarian data. Dengan desain ini, program menjadi rapi, mudah dikembangkan, dan relevan sebagai simulasi manajemen klinik hewan.

### Class

<img width="290" height="201" alt="image" src="https://github.com/user-attachments/assets/5cbab23f-5839-4cb8-b7d2-d4252b53b08a" />

Program ini terdiri dari enam file utama, yaitu class Hewan, Burung, dan Ikan serta interface Perawatan yang berada pada package model, class HewanService pada package service, serta class Main pada package main. Class Hewan berperan sebagai superclass abstrak yang menyimpan data umum hewan, sedangkan Burung dan Ikan merupakan subclass yang mewarisi Hewan sekaligus menambahkan atribut khusus serta melakukan overriding method tampilkanInfo() dan mengimplementasikan interface Perawatan. Class HewanService berfungsi sebagai pengelola logika CRUD dan pencarian data hewan, sementara class Main menjadi pengendali utama program yang menampilkan menu interaktif kepada pengguna serta menampilkan demo Overriding dan Overloading.

### Properties

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/65a4b108-f3f5-4f50-955d-f22bd613bd31" />

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/701a1a00-3c66-406b-ad16-3019a34f34d0" />

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/0d56f04d-475f-430b-81bd-01aadfc81a49" />

Pada program ini, setiap class memiliki properti yang berbeda sesuai dengan perannya. Class Hewan sebagai superclass memiliki enam properti, yaitu namaPemilik, noHP, namaHewan, jenisHewan, umurHewan, dan keluhan. Properti ini digunakan untuk menyimpan informasi umum tentang hewan yang didaftarkan ke klinik. Subclass Burung menambahkan satu properti baru yaitu warnaBulu, yang merepresentasikan ciri khas burung. Subclass Ikan juga menambahkan satu properti khusus yaitu jenisAir, yang menunjukkan apakah ikan hidup di air tawar atau air laut.

### Constructor

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/cce2ae64-c507-4bd3-9523-329a8f5f7435" />

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/0a383bb4-566d-46b8-8d35-19188f15eb40" />

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/e39642ca-3e2e-42d5-8e1e-4c9fecd3affa" />

Class Hewan memiliki constructor yang digunakan untuk menginisialisasi enam properti utama, yaitu namaPemilik, noHP, namaHewan, jenisHewan, umurHewan, dan keluhan. Constructor ini memastikan bahwa setiap kali objek hewan dibuat, semua data penting langsung terisi. Subclass Burung juga memiliki constructor yang memanggil constructor superclass (super(...)) untuk mengisi data umum hewan, lalu menambahkan inisialisasi properti khusus yaitu warnaBulu, sedangkan subclass Ikan, di mana constructor-nya memanggil constructor Hewan untuk data umum dan menambahkan pengisian properti jenisAir.

### Access Modifier

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/945aa54f-c65a-4aaf-aa31-b4f7f2d32ba8" />

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/60b5c6c1-7941-46d9-96fb-3faa02f1cf04" />

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/9afbd37a-afb9-4415-a9e4-64383a91b7a5" />

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/e6d9bd7b-a019-45e1-9de7-3b7a1d5da798" />

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/6f1b7559-ac90-4cd2-9579-06cdec44af70" />

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/12d7a70c-3223-4133-ac50-b022c257fe14" />

Pada program Klinik Hewan, seluruh atribut pada class Hewan, Burung, dan Ikan menggunakan access modifier private untuk menjaga prinsip encapsulation sehingga data tidak dapat diakses langsung dari luar class. Akses terhadap data dilakukan melalui getter dan setter yang bersifat public, sehingga tetap aman namun fleksibel. Method CRUD pada class HewanService juga menggunakan public agar dapat dipanggil dari class Main, sementara method tampilkanInfo() dibuat public agar bisa dioverride di subclass dan diakses dari luar.

### Struktur packages

<img width="285" height="201" alt="image" src="https://github.com/user-attachments/assets/c63f9452-4f23-49e2-8492-bcbb7768403b" />

Program Klinik Hewan ini disusun menggunakan konsep package untuk memisahkan class berdasarkan fungsinya agar kode lebih terstruktur dan mudah dipahami. Package model berisi class yang merepresentasikan data, yaitu Hewan sebagai superclass serta Burung dan Ikan sebagai subclass yang menambahkan atribut khusus dan melakukan overriding method, dan terdapat 1 interfaces. Package service berisi class HewanService yang mengatur logika bisnis, terutama operasi CRUD dan pencarian data. Sementara itu, package main berisi class Main yang menjadi titik awal program, menampilkan menu interaktif, dan memanggil method dari service.

## MVC

<img width="281" height="208" alt="image" src="https://github.com/user-attachments/assets/ceddbf92-41fb-4020-8fab-841674252b51" />

Program Klinik Hewan ini menerapkan pola Model–View–Controller (MVC) untuk memisahkan struktur kode berdasarkan fungsinya. Model direpresentasikan oleh package model yang berisi class Hewan, Burung, dan Ikan, dan interfaces perawatan. Bagian ini bertugas menyimpan data dan menyediakan constructor, atribut, serta method getter, setter, dan tampilkanInfo(). Controller direpresentasikan oleh package service melalui class HewanService, yang berfungsi mengatur logika program seperti operasi CRUD dan pencarian data. Sementara itu, View berada pada package main dengan class Main, yang menampilkan menu interaktif di console serta menerima input dari pengguna.

## Validasi Input

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/ae8df0e1-5a87-47cc-bb16-d4ea6ee230da" />

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/a5edaa27-f415-4d38-aa86-ae033067795f" />

Program Klinik Hewan sudah dilengkapi dengan validasi input untuk memastikan data yang dimasukkan pengguna sesuai aturan. Pada saat menambahkan data hewan, input nomor HP pemilik tidak boleh kosong; jika kosong, program akan menampilkan pesan "No HP tidak boleh kosong!" dan proses penambahan data dibatalkan. Selain itu, input umur hewan harus lebih dari nol; jika pengguna memasukkan angka nol atau negatif, program akan menampilkan pesan "Umur hewan harus lebih dari 0!" dan data tidak akan disimpan.

## Fitur Search

<img width="393" height="268" alt="image" src="https://github.com/user-attachments/assets/20c9fcef-82a8-457a-bfe7-5f9b1817487b" />

Program Klinik Hewan menyediakan fitur pencarian data hewan (search) untuk memudahkan pengguna menemukan informasi tertentu. Fitur ini bekerja dengan meminta pengguna memasukkan kata kunci berupa nama hewan, kemudian program akan melakukan pencocokan dengan seluruh data yang tersimpan di dalam ArrayList<Hewan>.

### encapsulation (getter dan setter)

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/85e016d4-cde3-4f5d-90d7-b95288007647" />

Program Klinik Hewan menerapkan konsep encapsulation dengan cara menjadikan semua atribut di dalam class Hewan, Burung, dan Ikan sebagai private, sehingga atribut-atribut tersebut tidak bisa diakses langsung dari luar class. Untuk mengakses dan mengubah nilai atribut, disediakan getter dan setter yang bersifat public.

### inheritance

<img width="288" height="203" alt="image" src="https://github.com/user-attachments/assets/1f85a5a3-7e13-4a6d-a79c-e58b57eda70c" />

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/2e0d3153-3616-44fd-93a8-de70fb1bd0d4" />

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/a766a43b-09de-4f03-9a87-3864a5e16a5b" />

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/d6a68bdc-fcb6-4193-8040-d5dcb150a83a" />

disini kita  menerapkan konsep inheritance (pewarisan) dengan menjadikan class Hewan sebagai superclass dan class Burung serta Ikan sebagai subclass. Class Hewan menyimpan atribut umum seperti namaPemilik, noHP, namaHewan, jenisHewan, umurHewan, dan keluhan. Class Burung mewarisi seluruh atribut dan method dari Hewan, lalu menambahkan atribut baru yaitu warnaBulu. Begitu juga dengan class Ikan yang mewarisi data dari Hewan serta menambahkan atribut khusus jenisAir.

### abstract class

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/28272c0a-d1fb-4599-8b56-f3646c79a148" />

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/7ea9ff52-6cca-43d0-a630-13f2e8cf1c1e" />

Dalam program Klinik Hewan ini, penerapan abstract class terdapat pada class Hewan yang berada di package model. Class ini dideklarasikan sebagai abstract karena memiliki method abstrak tampilkanInfo() yang tidak memiliki implementasi langsung, sehingga setiap subclass seperti Burung dan Ikan wajib melakukan overriding terhadap method tersebut.

### interface

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/c70dc252-6f10-490c-9543-7f189a35426c" />

Sementara itu, penerapan interface terdapat pada file Perawatan.java yang juga berada pada package model. Interface ini berisi kontrak berupa method beriPerawatan() yang harus diimplementasikan oleh setiap class yang menggunakannya.

### nilai tambah

Kombinasi abstract class dan interface digunakan secara bersamaan pada class Burung dan Ikan. Kedua class ini mewarisi sifat umum dari abstract class Hewan sekaligus mengimplementasikan interface Perawatan. Dengan cara ini, Burung dan Ikan tidak hanya memiliki struktur dasar yang sama seperti atribut pemilik, nama, jenis, umur, dan keluhan dari Hewan, tetapi juga dipaksa untuk memberikan implementasi khusus terhadap aturan perawatan yang ditetapkan di interface Perawatan.

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/8ac99571-7020-414d-bfdf-b10e5529f2bc" />

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/b849357a-b323-480d-94bb-80d614f93357" />


<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/062e8f17-a707-49a9-9dec-d9bfa192bd98" />

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/3c7d3780-da06-4fbf-bfa6-03ad3ef4ed70" />

### overriding

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/cf482439-e9ad-4081-b302-f74d6a3f8a91" />

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/cac520de-e974-403c-b2bb-f4fddcdb59f8" />

Dalam program Klinik Hewan ini, penerapan overriding terlihat pada class Burung dan Ikan yang merupakan subclass dari Hewan. Kedua class tersebut melakukan overriding terhadap method abstrak tampilkanInfo() dari superclass Hewan. Walaupun nama method sama, isi implementasinya berbeda sesuai dengan jenis hewan. Pada Burung, method ini menambahkan informasi khusus seperti warna bulu, sedangkan pada Ikan, method ini menambahkan informasi tentang jenis air. Dengan demikian, ketika method tampilkanInfo() dipanggil melalui objek Burung atau Ikan, hasil keluaran menyesuaikan dengan implementasi masing-masing subclass.

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/e526f963-13a3-4c7d-800b-c073be0ee03f" />

### overloading

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/3d96bdf4-cc14-4a1c-8b23-a8fd11978ce7" />

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/f04ed0d5-6ad7-44c8-8f7f-19aab1f6c865" />

overloading diterapkan pada class HewanService melalui method cariHewan(). Method ini memiliki beberapa versi dengan parameter yang berbeda: versi tanpa parameter yang meminta input langsung dari pengguna, versi dengan satu parameter String keyword untuk mencari data hewan berdasarkan nama, serta versi dengan dua parameter String keyword dan String jenis untuk mencari data hewan yang lebih spesifik berdasarkan nama dan jenis sekaligus. Walaupun nama method sama, perbedaan jumlah dan jenis parameter inilah yang membuat method cariHewan() menjadi contoh nyata dari overloading.

# Alur Program

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/4f19fd2a-dd94-4156-bacf-55aa1efa0acf" />

Program memiliki 6 pilihan menu:

1. menu pertama yaitu tambah data, pada bagian ini user bakal diminta untuk mengisi data data seperti nama pemilik,nomor hp pemilik,nama hewan,jenis hewan,umur hewan, dan keluhan. pada pilihan jenis hewan kita disuruh pilih antara ikan, burung atau kita menuliskan hewan semau kita, kemudian pada no hp pemilik tidak boleh kosong, dan umur hewan tidak boleh kurang dari 0

<img width="300" height="293" alt="image" src="https://github.com/user-attachments/assets/e74d0c4a-fd51-4b2d-ad4e-cf4b4255153f" />

<img width="320" height="277" alt="image" src="https://github.com/user-attachments/assets/a93a7d00-45f4-44ff-a81f-72cbd2670bd2" />

dan ini adalh tampilan jika nomor hp kosng dan umur kurang dari 0 maka akan terkeluar sdari menambah data

<img width="251" height="361" alt="image" src="https://github.com/user-attachments/assets/3e152fc2-9c5c-4eb4-9738-8cb723707731" />

<img width="290" height="411" alt="image" src="https://github.com/user-attachments/assets/b7d6846f-a5f7-400f-99e2-2d1f0ae42440" />

2. menu yang kedua adalah lihat data, dimenu ini program bakal menampilkan semua data yang sudah di tambahkan.

<img width="425" height="535" alt="image" src="https://github.com/user-attachments/assets/543d995e-983f-465c-aac0-357ee1a71928" />

dan ini adalah tampilan menu ke 2 jika data belum ada


<img width="239" height="339" alt="image" src="https://github.com/user-attachments/assets/8160676f-5e9e-486e-ab76-2a084883b7cd" />

3.menu yang ketiga adalah ubah data, jadi pada menu ini user memilih nomor mana yang akan diubah, kemudian user mengubah datanya


<img width="354" height="397" alt="image" src="https://github.com/user-attachments/assets/c0bc3b6a-57cf-4bf2-8137-48553f8d9d28" />

tampilan menu ke 3 jika nomor yang diinput tidak ada di data


<img width="297" height="313" alt="image" src="https://github.com/user-attachments/assets/62d5046d-d3fb-4a0d-9ba4-faa11116d2b2" />

4. menu yang keempat adalah hapus data, jadi dimenu ini user dapat menghapus data dengan memilih nomor yang ingin dihapus.


<img width="348" height="302" alt="image" src="https://github.com/user-attachments/assets/b2a55888-7f0d-4750-b5db-d573b1250326" />

tampilan menu ke 4 jika data yang mau di hapus tidak ada dalam data


<img width="399" height="338" alt="image" src="https://github.com/user-attachments/assets/d204c4fe-422a-4849-8c70-0e5cd7c2da3f" />

tampilan menu ke 4 jika data belum ada


<img width="299" height="212" alt="image" src="https://github.com/user-attachments/assets/2bfc7a01-ed8a-44c1-986c-aa7120de7d62" />


5. menu yang kelima adalah cari data hewan jadi disini user bisa mencari data hewan dengan menuliskan nama hewannya, dan berdasarkan nama hewan plus jenisnya


<img width="385" height="392" alt="image" src="https://github.com/user-attachments/assets/907b41ce-1afa-43a9-ad51-c0e38b2c0ef4" />


<img width="376" height="384" alt="image" src="https://github.com/user-attachments/assets/e74a266a-5a83-4dc7-806b-7417dc75b50d" />


<img width="365" height="393" alt="image" src="https://github.com/user-attachments/assets/597757ab-de93-4a79-9f7c-7ead13032dbd" />



6. menu ke enam adalah keluar,  jika user memilih menu ini maka program yang dijalankan akan selesai.


<img width="540" height="290" alt="image" src="https://github.com/user-attachments/assets/a652051b-89e1-4e38-bdf1-a1708b6e8ffb" />

jika user memilih angka 7 atau seterusnya maka pilihan tidak valid


<img width="285" height="181" alt="image" src="https://github.com/user-attachments/assets/023a2631-74e5-4cfd-b8ee-0716d8523185" />

Program hanya akan berhenti jika user memilih menu Keluar (pilihan nomor 6).

































