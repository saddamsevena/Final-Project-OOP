# Sudoku

This repository is a final project (Java GUI) from Object-Oriented Programming Class, Teknik Informatika Universitas Padjadjaran. 

[Challenge Guidelines](challenge-guideline.md)

**Project Sudoku (Java GUI) dengan implementasi konsep OOP (Object Oriented Programming) dan Java Swing berbasis GUI. Sudoku adalah sejenis teka-teki logika. Tujuannya adalah untuk mengisikan angka-angka dari 1 sampai 9 ke dalam jaring-jaring 9×9 yang terdiri dari 9 kotak 3×3 tanpa ada angka yang berulang di satu baris, kolom atau kotak**

## Credits
| NPM           | Name                 |
| ------------- |----------------------|
| 140810190017  | Saddam Habibi Utomo  |
| 140810190029  | Rellisa Puspa Kusuma |
| 140810190049  | Anastasia Victoria Y |

## Change log
- **[Sprint Planning](changelog/sprint-planning.md) - (18 Nov)** 
   - Pencarinan referensi GUI sudoku di Java
   - Diskusi dengan team tentang pembuatan GUI

- **[Sprint 1](changelog/sprint-1.md) - (date from 18 Nov until 24 Nov)** 
   - Short changes 1
   - Short changes 2

- **[Sprint 2](changelog/sprint-2.md) - (date from 25 Nov until 1 Dec)** 
   - Short changes 1
   - Short changes 2
   
- **[Sprint 3](changelog/sprint-3.md) - (date from 2 Dec until 8 Dec)** 
   - Short changes 1
   - Short changes 2

## Running The App

- Tampilkan grid ubin dengan besar 9 x 9 yang terdiri dari 3 x 3 sub-grids dimana ubin adalah komponen drawing board.
- Acak angka di dalam ubin dengan syarat unik (tidak ada angka yang sama pada 1 baris, 1 kolom, dan 1 sub-grids).
- Lakukan masking terhadap ubin tertentu (angka disembunyikan dan dijadikan text field)
- Ubin yang tidak dimasking bersifat read-only (angka didalamnya tidak bisa diubah)
- Cek apakah urutan tersebut dapat dipecahkan dengan aturan: Setiap angka yang didahului oleh angka yang lebih besar dianggap sebagai inversi, jumlah inversi dari puzzle harus genap.
- Buat listener untuk memproses input. Setiap inputan user akan dicek:
    - Koordinat x dan y dimana inputan tersebut berada
    - Apakah nilai yang dimasukan pada ubin sesuai dengan jawaban, jika sesuai maka ubah warna tulisan menjadi hijau, jika tidak sesuai maka ubah menjadi warna merah
    - Highlight ubin yang sudah berisi angka, jika dalam 1 baris, 1 kolom, atau 1 sub-grids berisi angka yang sama dengan inputan user
- Buat button “Reset/Restart” untuk mengacak ulang grid dan memulai game baru.

## Classes Used

TO;DO

UML image here

## Notable Assumption and Design App Details

TO;DO
