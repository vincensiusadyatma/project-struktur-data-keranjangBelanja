package projectku;

import java.text.DecimalFormat;

public class Barang {
    DecimalFormat currency = new DecimalFormat("###,###.##");
    private String namaBarang;
    private String deskripsi;
    private int harga;

    public Barang(String namaBarang, String deskripsi, int harga) {
        this.namaBarang = namaBarang;
        this.deskripsi = deskripsi;
        this.harga = harga;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public int getHarga() {
        return harga;
    }

    @Override
    public String toString() {
        return String.format("""
                Nama barang: %s
                Harga barang: Rp%s
                Deskripsi: %s""", getNamaBarang(), currency.format(getHarga()), getDeskripsi());
    }
}
