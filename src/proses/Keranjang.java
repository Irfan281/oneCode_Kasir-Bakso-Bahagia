package proses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Keranjang extends Menu{
    
    private HashMap<String, Integer> keranjang;

    public Keranjang() {
        keranjang = new HashMap<String, Integer>();
    }
    
    public Integer getKeranjang(String kata) {
        return this.keranjang.get(kata);
    }
    
    public HashMap<String, Integer> getKeranjang2() {
        return this.keranjang;
    }
    
    public void setKeranjang(HashMap<String, Integer> keranjang) {
        this.keranjang = keranjang;
    }
    

    
    public String getJumlah(int angka, boolean cek) {
        String kata = makananKeranjang(angka);
        
        if (kata.equalsIgnoreCase("")) {
            return "";
        } else {
            if(cek){
                return this.keranjang.get(kata).toString();
            } else {
                return "x" + this.keranjang.get(kata).toString();
            }
        }
    }

    public Integer hargaTotal() {
        int harga = 0;

        for (Map.Entry<String, Integer> entry : keranjang.entrySet()) {
            harga += retHarga(entry.getKey()) * entry.getValue();
        }
        
        return harga;
    }
    
    public String hargaPerItem(int angka) {
        String kata = makananKeranjang(angka);
        Integer perItem;
        
        if (kata.equalsIgnoreCase("")) {
            return "";
        } else {
            perItem =  getKeranjang(kata) * retHarga(kata);
            return perItem.toString();
        }
    }
    
    public String hargaSatuan(int angka) {
        String kata = makananKeranjang(angka);
        Integer harga;
        
        if (kata.equalsIgnoreCase("")) {
            return "";
        } else {
            harga = retHarga(kata);
            return harga.toString();
        }
    }

    public void tambahKeranjang (String kata, int banyak) {
        keranjang.put(kata, banyak);
    }

    public String makananKeranjang(int noMenu) {
        int index = noMenu - 1;

        Set<String> menuSet = keranjang.keySet();

        ArrayList<String> listMenu = new ArrayList<String>(menuSet);

        String key = "";
        if (index < listMenu.size()) {
            key = listMenu.get(index);
        }

        return key;
    }
    
    public int jumlahKeranjang() {
        int jumlah = 0;
        for (Map.Entry<String, Integer> entry : keranjang.entrySet()) {
            jumlah = jumlah + entry.getValue();
        }
        return jumlah;
    }

}
