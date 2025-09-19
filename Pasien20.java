import java.util.ArrayList;
import java.time.LocalDate;

public class Pasien20 {
    private String noRekamMedis;
    private String nama;
    private ArrayList<Konsultasi20> riwayatKonsultasi; //menambah atribut arraylist

    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public Pasien20(String noRekamMedis, String nama) {
        this.noRekamMedis = noRekamMedis;
        this.nama = nama;
        this.riwayatKonsultasi = new ArrayList<>(); //menambah inisialisasi arraylist
    }

    // Menambah konsultasi baru
    public void tambahKonsultasi(LocalDate tanggal, Pegawai20 dokter, Pegawai20 perawat) {
        Konsultasi20 konsultasi = new Konsultasi20();
        konsultasi.setTanggal(tanggal);
        konsultasi.setDokter(dokter);
        konsultasi.setPerawat(perawat);
        riwayatKonsultasi.add(konsultasi);
    }

    // Menampilkan info pasien dan riwayat konsultasi
    public String getInfo() {
        String info = "";
        info += "No Rekam Medis: " + this.noRekamMedis + "\n";
        info += "Nama: " + this.nama + "\n";

        if (!riwayatKonsultasi.isEmpty()) {
            info += "Riwayat Konsultasi:\n";
            for (Konsultasi20 konsultasi : riwayatKonsultasi) {
                info += konsultasi.getInfo();
            }
        } else {
            info += "Belum ada riwayat konsultasi.\n";
        }

        info += "\n";
        return info;
    }
}