package Perpustakaan;

public class Buku {
    private String judul;
    private String penulis;
    private boolean dipinjam;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.dipinjam = false;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    public String pinjam() {
        if (!dipinjam) {
            dipinjam = true;
            return "Buku \"" + judul + "\" berhasil dipinjam.";
        } else {
            return "Buku \"" + judul + "\" sedang dipinjam.";
        }
    }

    public String kembalikan() {
        if (dipinjam) {
            dipinjam = false;
            return "Buku \"" + judul + "\" berhasil dikembalikan.";
        } else {
            return "Buku \"" + judul + "\" tidak sedang dipinjam.";
        }
    }
}

