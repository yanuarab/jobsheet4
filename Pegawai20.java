public class Pegawai20 {
    private String nip;
    private String nama;

    public Pegawai20(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }
    public String getNip() {
        return nip;
    }
    public void setNip(String nip) {
        this.nip = nip;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getInfo(){
        return nama + " (" + nip + ")";
    }
}