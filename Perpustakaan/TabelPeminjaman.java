package Perpustakaan;

import java.util.Date;

public class TabelPeminjaman {
    private String idPeminjaman;
    private Date tanggalPinjam;
    private Date tanggalKembali;
    private Anggota anggota;
    private Buku buku;

    public TabelPeminjaman(String idPeminjaman, Anggota anggota, Buku buku, Date tanggalPinjam, Date tanggalKembali) {
        this.idPeminjaman = idPeminjaman;
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
    }

    public String pinjamBuku(Anggota a, Buku b) {
        this.anggota = a;
        this.buku = b;
        return a.pinjamBuku(b);
    }

    public String kembalikanBuku(String idPeminjaman) {
        if (this.idPeminjaman.equals(idPeminjaman)) {
            return anggota.kembalikanBuku(buku);
        } else {
            return "ID peminjaman tidak ditemukan.";
        }
    }

    public String cekStatusPeminjaman() { //operator ternary
        return buku.isDipinjam() ? "Sedang dipinjam" : "Tersedia";
    }

    public String tampilkanDataPeminjaman() {
        return "===== Data Peminjaman =====\n" +
               "ID Peminjaman : " + idPeminjaman + "\n" +
               "Nama Anggota  : " + anggota.getNama() + "\n" +
               "Judul Buku    : " + buku.getJudul() + "\n" +
               "Tanggal Pinjam: " + tanggalPinjam + "\n" +
               "Tanggal Kembali: " + tanggalKembali + "\n" +
               "Status Buku   : " + cekStatusPeminjaman() + "\n" +
               "=============================";
    }
}

