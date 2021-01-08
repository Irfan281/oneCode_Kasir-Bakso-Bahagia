package proses;



public class Transaksi {
    private Integer uangBayar;
    private Integer uangKembalian;
    
    public Transaksi() {
        
    }
    
    public Transaksi(int uang) {
        uangBayar = uang;
    }

    public String pembayaran(int totalHarga) {
        uangKembalian = uangBayar - totalHarga;
        return uangKembalian.toString();
    }

    public int getUangKembalian() {
        return uangKembalian;
    }

    public int getUangBayar() {
        return this.uangBayar;
    }

    public void setUangBayar(int uangBayar) {
        this.uangBayar = uangBayar;
    }

}
