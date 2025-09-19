import java.time.LocalDate;

public class RumahSakitDemo20 {
    public static void main(String[] args) {
        Pegawai20 ani = new Pegawai20("1234", "dr. Ani");
        Pegawai20 bagus = new Pegawai20("4567", "dr. Bagus");

        Pegawai20 desi = new Pegawai20("1234", "Ns. Desi");
        Pegawai20 eka = new Pegawai20("4567", "Ns. Eka");

        Pasien20 pasien1 = new Pasien20("343298", "Puspa Widya");
        pasien1.tambahKonsultasi(LocalDate.of(2021, 8, 11), ani, desi);
        pasien1.tambahKonsultasi(LocalDate.of(2021, 9, 11), bagus, eka);

        System.out.println(pasien1.getInfo());

        Pasien20 pasien2 = new Pasien20("997744", "Yenny Anggraeni");
        System.out.println(pasien2.getInfo());
    }
}
