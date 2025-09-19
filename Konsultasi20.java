import java.time.LocalDate;

public class Konsultasi20 {
    private LocalDate tanggal;
    private Pegawai20 dokter;
    private Pegawai20 perawat;

    public LocalDate getTanggal() { //menambahkan setter dan getter
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public Pegawai20 getDokter() {
        return dokter;
    }

    public void setDokter(Pegawai20 dokter) {
        this.dokter = dokter;
    }

    public Pegawai20 getPerawat() {
        return perawat;
    }

    public void setPerawat(Pegawai20 perawat) {
        this.perawat = perawat;
    }

    public String getInfo() {
    String info = "";
    info += "\tTanggal: " + tanggal;
    info += ", Dokter: " + dokter.getInfo();
    info += ", Perawat: " + perawat.getInfo();
    info += "\n";
    return info;
}
    }
