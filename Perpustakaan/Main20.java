package Perpustakaan;

import java.util.Date;

public class Main20 {
    public static void main(String[] args) {
        Buku b1 = new Buku("Pemrograman Java", "Andi");
        Buku b2 = new Buku("Struktur Data", "Budi");

        Anggota a1 = new Anggota("Yanuar");

        // Buat data peminjaman
        TabelPeminjaman tp = new TabelPeminjaman("P001", a1, b1, new Date(), new Date());

        // Proses pinjam buku
        System.out.println(tp.pinjamBuku(a1, b1));
        System.out.println(tp.tampilkanDataPeminjaman());

        // Coba pinjam buku yang sama
        System.out.println(tp.pinjamBuku(a1, b1));

        // Kembalikan buku
        System.out.println(tp.kembalikanBuku("P001"));
        System.out.println(tp.tampilkanDataPeminjaman());

        // Pinjam buku lain
        System.out.println(tp.pinjamBuku(a1, b2));
        System.out.println(tp.tampilkanDataPeminjaman());
    }
}


