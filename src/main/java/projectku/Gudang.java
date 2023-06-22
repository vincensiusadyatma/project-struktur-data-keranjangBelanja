package projectku;

import java.util.ArrayList;

public class Gudang {
    private ArrayList<Barang> elektronik = new ArrayList<>();
    private ArrayList<Barang> fashion = new ArrayList<>();
    private ArrayList<Barang> wearable = new ArrayList<>();

    Gudang() {
        elektronik.add(new Barang("TCL 32 inch Smart LED TV", "TCL 32A7 SERIES, Best New Android TV. A+ Panel Quality, Feel the Comfortable\n" +
                "TCL 32A7, Smart TV terjangkau yang bikin harimu semakin seru\n", 1849000));
        elektronik.add(new Barang("Toshiba LED TV - HD Smart TV 32 inch", "TOSHIBA LED TV - HD SMART VIDAA 32 inch adalah smart TV yang dilengkapi prosesor tercanggih \n" +
                "Vidaa U4.2 yang berkemampuan mengolah data dengan begitu \n" +
                "cepat sehingga Anda bisa lebih mudah dan nyaman menikmati berbagai hiburan\n", 2149000));
        elektronik.add(new Barang("LG Mesin Cuci 7,5 kg, 2 Tabung", "LG Mesin Cuci Twin Tub P7500N - Semi Auto - 7.5 kg.\n" +
                "Mesin cuci dua tabung dengan 3 Program Pencucian - Gentle, Normal, Strong. Atur program pencucian sesuai kebutuhan.\n" +
                "Dengan tiga pilihan program pencucian, Anda dapat memilih yang paling sesuai dengan bahan pakaian Anda\n", 1877000));
        elektronik.add(new Barang("PHILIPS Setrika kering HD1173/80", "- 4 lapis tapak Ceramic, lebih tahan lama, anti-baret dan anti-lengket\n" +
                "- 350 Watt\n" +
                "- Panjang kabel 1,7 m\n" +
                "- Lampu indikator suhu\n" +
                "- Pengaturan suhu sesuai bahan\n", 298000));
        elektronik.add(new Barang("Sanken Rice Cooker 1.2 Liter SJ-150", "Sanken SJ-150 Super Com merupakan Super Com / Rice Cooker yang didesain elegan dan berbagai pilihan warna yang menarik, serta memiliki kapasitas 1.2 liter. Super Com / Rice Cooker ini terbuat dari material berkualitas dan tahan lama serta memiliki 6 fungsi pemasakan yaitu menanak nasi, menghangatkan, mengukus, menggoreng, menumis, dan merebus.\n" +
                "Panci Stainless Steel Food grade kualitas yang sangat baik dan tahan lama\n", 565000));
        elektronik.add(new Barang("LG Kulkas 2 Pintu 205L gross ", "LG Kulkas 2 Pintu 205L gross / 209L nett " +
                "\n- Smart Inverter Compressor Multi Air Flow Rak Tempered Glass " +
                "\n- Dark Graphite Steel " +
                "\n- GN-B215SQMT", 3505000));
        elektronik.add(new Barang("HAN RIVER Mixer HRDDQ01WT", "Mixer Tangan HAN RIVER HE-133 membantu pekerjaan Anda mempermudah proses mixing makanan berjenis semi solid atau pun semi liquid,\n" +
                "sehingga memasak atau membuat kue jadi pekerjaan yang menyenangkan." +
                "\nDengan motor bertenaga 180 Watt yang tangguh, mixer ini hadir dengan pengocok telur", 65000));
        fashion.add(new Barang("Sepatu 910 Yuza matterHorn", "Sepatu lari berwarna hitam dengan paduan warna abu-abu", 476910));
        fashion.add(new Barang("Sepatu Compass Retrograde Black White", "BNIB Low Black White\n" +
                "Original 100%\n" +
                "Pengiriman Double Box\n" +
                "Spesifikasi :\n" +
                "- Potongan rendah\n" +
                "- Upper menggunakan bahan kanvas\n" +
                "- Logo samping menggunakan bahan PVC\n" +
                "- Tali katun\n", 5788000));
        fashion.add(new Barang("Sepatu AeroStreet X Paddle Pop Putih ", "\"TIDAK AKAN JEBOL\" \n" +
                "Setelah dicuci atau kehujanan karena menggunakan teknologi baru \"SHOES INJECTION MOULD\" \n" +
                "Bahan sole di cairkan dengan tekanan tinggi menyatu sempurna dengan bahan kain dari sepatu tanpa menggunakan proses lem\n", 179000));
        fashion.add(new Barang("Kemeja Pique Lengan Panjang Medium Dzargo", "DETAIL PRODUK:\n" +
                "- Bahan Premium Cotton Pique\n" +
                "- Serat Bahan Halus\n" +
                "- Model Slimfit\n" +
                "- Model Kerah Kemeja & Terdapat Kancing\n" +
                "- Model Lengan Panjang\n" +
                "- Ada saku di bagian dada kiri\n" +
                "- Jahitan 100% Cotton\n", 159000));
        fashion.add(new Barang("Celana Chino Panjang Premium Dzargo ukuran 36", "DETAIL PRODUK:\n" +
                "- Bahan : Twill Stretch\n" +
                "- Premium Waistband\n" +
                "- 2 Kantong Depan\n" +
                "- 2 Kantong Belakang (Tanpa Kancing)\n" +
                "- Kancing detail logo DZARGO\n", 130000));
        fashion.add(new Barang("Kaos Polos Premium Putih ukuran S Dzargo", "- Serat bahan Halus & Nyaman di Pake\n" +
                "- Model Kerah O-Neck\n" +
                "- Model Lengan Pendek\n" +
                "- Jahitan 100% Cotton\n" +
                "- Bahan 100% Premium Cotton Combed 30s\n" +
                "- ORIGINAL Brand Local from Indonesia\n", 59000));
        fashion.add(new Barang("Setelan Jas dan celena Formal Pria Hitam ukuran L Goldy Outfit", "BAHAN : PREMIUM POLYESTER\n" +
                "ISI DALAM PAKET :\n" +
                "JAS CELANA\n" +
                "100% INDONESIA\n" +
                "DUKUNG TERUS PRODUK ASLI INDONESIA\n", 395000));
        fashion.add(new Barang("Baju Koki Chef Biru ukuran M", "- Jahitan rapih\n" +
                "- Mudah di cuci\n" +
                "- Kualitas baik\n" +
                "- Unisex ( Pria/wanita)\n" +
                "- Tingkat ketebalan baik\n" +
                "- Bahan halus nyaman di pakai\n" +
                "- Kain Tidak Mudah berbulu\n" +
                "- Kain Tidak Luntur saat di Cuci\n" +
                "- Tidak Panas saat di Pakai\n", 97000));
        fashion.add(new Barang("Seragam Safari Warna Hitam Lengan Pendek S", "Di kemeja terdapat 2 saku di bagian dada, di saku kiri ada lubang buat selipan pulpen\n" +
                "Di celana terdapat 3 saku, dua saku di depan, satu saku belakang buat menympan dompet Dll", 12000));
        fashion.add(new Barang("Kemeja PDI Perjuangan lengan pendek Resmi Ukuran M", "Bahan Drill Katun\n" +
                "Jahitan rapih Semi Taylor\n" +
                "Logo bordir komputer langsung di kemeja.\n" +
                "Bordir bukan tempelan ya gan\n", 80000));
        fashion.add(new Barang("JFR Dompet Pria", "MATERIAL\n" +
                "- Genuine Cow Leather\n" +
                "- Micron Pabric Lining\n" +
                "- Nylon Sewings\n" +
                "- Iron Logo\n" +
                "- Debossed Hot Stamp\n", 118000));
        fashion.add(new Barang("Tas Ransel LED Men Knight Backpack Motorcycle ", "-Nama merek : LOY\n" +
                "-Jenis : Softback\n" +
                "-Tipe Tutup : Zipper\n" +
                "-Interior : Interior Compartment\n" +
                "-Carrying System : Air mesh\n" +
                "Handle/Strap Type : Soft Handle\n" +
                "Bahan Pelapis : Poliester\n" +
                "Bahan Utama : ABS\n" +
                "Gaya : Mode\n" +
                "Fitur : Tahan Air\n" +
                "Backpack size : 38*18*48cm\n" +
                "Product name : 3D Iron Man Backpack With Led Display\n" +
                "Usage : daily, advertising, cycling, sports, travel, etc.\n" +
                "Logo : Accept Customized Logo\n", 2350000));
        fashion.add(new Barang("MLB NY Yankees N-Cover Original", "Brand New 100% Original Authentic\n" +
                "Trusted since 2016\n" +
                "\n" +
                "Penukaran ukuran produk kategori sepatu / sendal / pakaian diperbolehkan. Silahkan cek selengkapnya kebijakan Penukaran Ukuran Produk di catatan toko kami.\n", 899000));
        fashion.add(new Barang("SSST Furii Denim Kimono Oversize Light Indigo S", "Furi Kimono adalah jaket denim yang terinspirasi dengan cutting noragi ala Jepang atau yang biasa disebut kimono." +
                "\nDi desain open front dengan siluet drop shoulder menjadikan Kimono sempurna untuk menjadi layer luar outfitmu." +
                "\nKimoni ini terbuat dari denim 12oz dan memiliki fitur empat saku dan aksen tali ikat di bagian depan.\n", 499000));

    }

    public ArrayList<Barang> getElektronik() {
        return elektronik;
    }

    public ArrayList<Barang> getFashion() {
        return fashion;
    }

    public ArrayList<Barang> getWearable() {
        return wearable;
    }

    int totalItem() {
        return getFashion().size();
    }
}
