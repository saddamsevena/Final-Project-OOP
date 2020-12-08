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
   - Memulai pembuatan board
   - Pembuatan menu di board dan main java untuk menjalankan

- **[Sprint 2](changelog/sprint-2.md) - (date from 25 Nov until 1 Dec)** 
   - Pembuatan level dan memasukkannya kedalam GUI
   - Pengacakan angka serta menyatukan file GUI menjadi satu
   
- **[Sprint 3](changelog/sprint-3.md) - (date from 2 Dec until 8 Dec)** 
   - Challenge Idea Menu Bar
   - Penyelesaian Tampilan

## Running The App

- Buka folder file program sudoku
- Buka cmd / terminal lain
- Compile Program dengan command "javac Sudoku.java"
- Run Program dengan command "java Sudoku"
- Jika ingin langsung bermain sesuai level dapat run dengan command "java Sudoku (level)"
- Sudoku sudah bisa dimainkan dengan 3 pilihan level

## Classes Used

1. Class SudokuPuzzle, merupakan class untuk menginput serta mengacak angka yang ada pada sudoku
2. Class Sudoku, berfungsi untuk menampilkan tampilan game sudoku dan main class untuk menjalankan permainan sudoku

![UML](/images/UML.jpg)

## Notable Assumption and Design App Details

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
