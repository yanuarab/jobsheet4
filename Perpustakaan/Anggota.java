package Perpustakaan;

import java.util.ArrayList;

public class Anggota {
    private String nama;
    private ArrayList<Buku> daftarPinjaman;

    public Anggota(String nama) {
        this.nama = nama;
        this.daftarPinjaman = new ArrayList<>();
    }

    public String getNama() { 
        return nama;
    }

    public String pinjamBuku(Buku b) {
        if (!b.isDipinjam()) {
            daftarPinjaman.add(b);
            return b.pinjam();
        } else {
            return "Buku sudah dipinjam orang lain.";
        }
    }

    public String kembalikanBuku(Buku b) {
        if (daftarPinjaman.contains(b)) { //mengecek apakah buku ada di daftar pinjaman
            daftarPinjaman.remove(b);
            return b.kembalikan();
        } else {
            return "Buku tidak ada dalam daftar pinjaman " + nama;
        }
    }
}