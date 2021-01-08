package proses;

public class Pelanggan {
    private String nama;
    private int nomorMeja;

    public Pelanggan() {
        nama = "default";
        nomorMeja = 0;
    }
    
    public Pelanggan(String nama, int nomorMeja) {
        this.nama = nama;
        this.nomorMeja = nomorMeja;
    }

    public String getNama() {
        return this.nama;
    }

    public int getNomorMeja() {
        return this.nomorMeja;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNomorMeja(int nomorMeja) {
        this.nomorMeja = nomorMeja;
    }
}
