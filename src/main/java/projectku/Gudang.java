package projectku;

import java.util.ArrayList;

public class Gudang {
    private ArrayList<Barang> elektronik = new ArrayList<>();
    private ArrayList<Barang> fashion = new ArrayList<>();
    private ArrayList<Barang> wearable = new ArrayList<>();

    Gudang() {
        //Kategori  Elektronik
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
        elektronik.add(new Barang("TEKO LISTRIK SCARLETT 2 LITER","Material bahan dengan lapisan stainless anti karat yang sangat tahan lama dan aman untuk air mendidih. "
                + "\nKetel hemat energi ini memiliki desain unik dengan penuangan sempurna sehingga sangat mudah digunakan, "
                + "\nAnda dapat membuat secangkir minuman favorit Anda kapan pun Anda mau Kapasitas 2L yang cukup besar untuk Anda gunakan.",54000));
        elektronik.add(new Barang("SETRIKA UAP PORTABLE","BISA BERPUTAR 180DERAJAT GAMPANG DIBAWA KEMANA-MANA GAMPANG DIPAKAI JIKA BARANG BERKENDALA WAJIB UNBOX,DAN JGAN KONFIM DLU",75738));
        elektronik.add(new Barang("SHARP RICE COOKER / MAGIC COM KS-N18MG-RD(1,8 LITER)","SHARP KSN18MG Rice Cooker [1.8 Liter], rice cooker dengan desainnya yang modern dan elegan membuat nuansa di dapur anda semakin lebih stylish. "
                + "\nDengan Anda pun dapat membuat kukusan kue serta menghangatkan makanan kembali dengan mudah.",189000));
        elektronik.add(new Barang("Mesin Jahit Mini Portable (Plus Meja)","Mesin jahit mini yg efisien dan simple untuk menjahit baju, kain dan berbagai macam kerajinan tangan. Sangat membantu sekali, \ndengan cara penggunaan yang mudah dan praktis. "
                + "\nTidak hanya untuk dewasa, buat anak-anak yang mau belajar menjahit pun bisa",134900));
        elektronik.add(new Barang("TNW Car Vacum Cleaner Penyedot Debu 12000Pa","Penyedot debu mini kami adalah bagian tak terpisahkan dari rumah, mobil, dan kantor. Alat ini dapat membersihkan ceceran sampah di lemari, celah sofa, rel jendela, "
                + "\nsisa cemilan, bulu hewan peliharaan, celah mobil, keyboard, dll. "
                + "\nUntuk memberi Anda lingkungan rumah dan lingkungan kantor yang bersih dan rapi.",129000));
        elektronik.add(new Barang("Stik PS3 / Stick PS3 PlaytSation 3 OP Freegun Edition Wireless","Stik Stick Playt-Sation 3 Wireles OP Getar Kualitas Terbaik, Harga Murah Tapi Tidak Murahan, Kualitas Dijamin, Bukan Stik Abal-abal Buktikan Sendiri Guyss !!! Tidak Bagus Kembalikan Saja",48900));
        elektronik.add(new Barang("CCTV 3 Antena Wireless Smart Camera HD 1080P 2 MP Auto Tracking Camera Q5YS","~Auto screen shot saat terdeteksi gerakan yg tersimpan di Server bs di download ke App & Hp, bs dibuka meski camera offline/dirusakin maling, kl merk yg lain ga bisa "
                + "\n~Rekaman bs lbh lama dibanding merk lain "
                + "\n~Putar Horizontal 360, Vertikal 120 derajat "
                + "\n~Cycle Recording: hapus & timpa otomatis dgn rekaman baru",135000));
        elektronik.add(new Barang("RADIO AC/DC 4250 PORTABLE INTERNATIONAL 2 BAND FM - AM ANTIK CLASSIC JADUL","Radio ini dapat dioperasikan dengan kabel (termasuk dalam pembelian) sehingga Anda tak perlu repot-repot membeli baterai. "
                + "\nNamun jika Anda ingin lebih mobile dengan radio ini, bisa juga dipasangi baterai.",69990));
        
        
        //Kategori Fashion
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
        
        
        //Kategori Wearable
        wearable.add(new Barang("Smartwatch Apple Watch Series 7","Tampil lebih stylish dengan Apple Watch Series 7! Smartwatch canggih dengan desain elegan dan fitur terbaru. Layar yang lebih besar, deteksi detak jantung, "
                + "\nGPS terintegrasi dan kemampuan water-resistant membuat Apple Watch Series 7 menjadi pilihan sempurna untuk gaya hidup aktif Anda. "
                + "\nNikmati kontrol penuh atas kesehatan, notifikasi penting, serta akses mudah ke aplikasi favorit Anda, semua dalam satu perangkat yang mewah.",6499000));
        wearable.add(new Barang("Smartwatch Samsung Galaxy Watch 4","Hadir dengan teknologi terdepan, Samsung Galaxy Watch 4 adalah teman sempurna bagi gaya hidup aktif Anda. Dengan layar AMOLED yang cerah dan tahan air hingga 50 meter, "
                + "\nAnda dapat memantau aktivitas olahraga, tidur, detak jantung, dan bahkan menjawab panggilan telepon langsung dari pergelangan tangan Anda. "
                + "\nDapatkan akses cepat ke notifikasi, aplikasi, dan berbagai fitur pintar lainnya dengan Samsung Galaxy Watch 4.",3999000));
        wearable.add(new Barang("Earbuds Apple AirPods Pro","Rasakan pengalaman mendengarkan musik yang luar biasa dengan Apple AirPods Pro! Earbuds berkualitas tinggi ini dilengkapi dengan fitur noise cancellation aktif yang memungkinkan "
                + "\nAnda menikmati suara yang jernih dan detail tanpa gangguan dari lingkungan sekitar. Desain in-ear yang nyaman dan tahan air membuat AirPods Pro menjadi pasangan sempurna untuk kegiatan sehari-hari Anda. "
                + "\nSegera nikmati kebebasan musik tanpa batas dengan AirPods Pro",2499000));
        wearable.add(new Barang("Fitbit Versa 3 Smartwatch","Tingkatkan gaya hidup sehat dan aktif Anda dengan Fitbit Versa 3 Smartwatch. Smartwatch ini dilengkapi dengan monitor detak jantung, GPS terintegrasi, "
                + "\nserta pelacakan tidur dan aktivitas yang canggih. Nikmati notifikasi cerdas, kontrol musik, dan akses ke aplikasi di pergelangan tangan Anda. "
                + "\nDengan tampilan yang elegan dan tahan air, Fitbit Versa 3 adalah teman sejati untuk gaya hidup sehat Anda",3199000));
        wearable.add(new Barang("Samsung Galaxy Buds Pro","Hadir dengan kualitas suara premium, Samsung Galaxy Buds Pro memberikan pengalaman mendengarkan musik yang tak tertandingi. "
                + "\nFitur noise cancellation yang adaptif memungkinkan Anda fokus pada musik tanpa terganggu oleh suara di sekitar. "
                + "\nDengan desain yang ergonomis dan tahan air, Galaxy Buds Pro memberikan kenyamanan maksimal sepanjang hari. "
                + "\nJelajahi dunia suara yang kaya dan mendalam dengan Samsung Galaxy Buds Pro.",2299000));
        wearable.add(new Barang("Garmin Forerunner 945 Smartwatch","Untuk pelari dan penggemar kebugaran serius, Garmin Forerunner 945 adalah pilihan yang tepat. Dengan pelacakan GPS yang akurat, "
                + "\nmonitor detak jantung, dan analisis kebugaran yang mendalam, smartwatch ini membantu Anda mencapai performa terbaik Anda. "
                + "\nFitur-fitur cerdas seperti notifikasi smartphone, pemantauan stres, dan pemulihan yang disesuaikan menjadikan "
                + "\nForerunner 945 pendamping sempurna dalam setiap latihan",9999000));
        wearable.add(new Barang("Xiaomi Mi Band 6","Xiaomi Mi Band 6 memberikan pemantauan kebugaran yang canggih dengan harga yang terjangkau. Layar AMOLED yang cerah dan warna-warni, "
                + "\npelacakan tidur yang akurat, serta sensor detak jantung dan SpO2 membuat Mi Band 6 menjadi alat pelacak kesehatan yang hebat. "
                + "\nTersedia berbagai mode olahraga dan notifikasi cerdas untuk membuat gaya hidup aktif Anda semakin menyenangkan.",499000));
        wearable.add(new Barang("JBL Free X Earbuds","Dengarkan musik dengan kebebasan tanpa kabel dengan JBL Free X Earbuds! Earbuds ini hadir dengan suara yang kuat dan jernih, "
                + "\nserta desain yang ergonomis untuk kenyamanan maksimal. Dengan baterai yang tahan lama dan fitur pengisian cepat, "
                + "\nAnda dapat menikmati hingga 24 jam musik non-stop. JBL Free X Earbuds adalah teman sempurna untuk penggemar musik yang aktif.",1299000));
        wearable.add(new Barang("Huawei Watch Fit Smartwatch","Dapatkan pengalaman smartwatch yang canggih dengan Huawei Watch Fit! Dengan tampilan AMOLED yang cerah dan pelacakan olahraga yang komprehensif, "
                + "\nAnda dapat memantau dan meningkatkan kesehatan serta kebugaran Anda. Watch Fit dilengkapi dengan sensor detak jantung, pemantauan tidur, "
                + "\ndan berbagai mode olahraga yang membantu Anda mencapai target fitness Anda. Nikmati notifikasi cerdas, musik, "
                + "\ndan baterai tahan lama dalam satu perangkat yang ringkas.",1899000));
        wearable.add(new Barang("Sony WF-1000XM4 True Wireless Earbuds","Rasakan suara premium tanpa batas dengan Sony WF-1000XM4 True Wireless Earbuds! Dilengkapi dengan teknologi noise cancellation yang adaptif, "
                + "\nearbuds ini memungkinkan Anda menikmati suara yang jernih dan detail tanpa gangguan. Desain yang nyaman, "
                + "\nbaterai tahan lama, dan fitur-fitur cerdas seperti pengenalan aktivitas membuat WF-1000XM4 menjadi pilihan "
                + "\nterbaik untuk pengalaman mendengarkan musik yang luar biasa.",3899000));
        wearable.add(new Barang("Fitbit Charge 4 Fitness Tracker","Dapatkan pelacak kebugaran yang andal dengan Fitbit Charge 4. Dilengkapi dengan monitor detak jantung, GPS terintegrasi, "
                + "\ndan pelacakan aktivitas yang komprehensif, Fitbit Charge 4 membantu Anda mencapai tujuan kebugaran Anda."
                + "\nLayar berwarna yang cerah, notifikasi smartphone, dan baterai tahan lama membuatnya menjadi teman setia sepanjang hari.",1799000));
        wearable.add(new Barang("Bose Frames Audio Sunglasses","Gabungkan gaya dan teknologi dengan Bose Frames Audio Sunglasses. Kacamata hitam ini dilengkapi dengan speaker terintegrasi yang menghadirkan suara yang jernih dan imersif langsung ke telinga Anda. "
                + "\nSelain melindungi mata dari sinar matahari, Anda juga dapat menikmati musik, panggilan telepon, dan asisten suara tanpa memerlukan headphone tambahan. "
                + "\nTampil trendy sambil tetap terhubung dengan dunia di sekitar Anda.",3499000));
        wearable.add(new Barang("Garmin Venu 2 Smartwatch","Dengan layar AMOLED yang cerah dan tahan air, Garmin Venu 2 Smartwatch memberikan kombinasi sempurna antara kecantikan dan kinerja."
                + "\nDilengkapi dengan berbagai fitur kebugaran seperti pemantauan oksigen darah, pelacakan energi tubuh, dan ratusan mode olahraga, "
                + "\nVenu 2 membantu Anda mencapai performa terbaik. Dapatkan juga akses ke notifikasi cerdas, aplikasi, dan pemutar musik langsung di pergelangan tangan Anda.",5999000));
        wearable.add(new Barang("Sony WH-1000XM4 Wireless Noise-Canceling Headphones","Rasakan pengalaman mendengarkan musik tanpa batas dengan Sony WH-1000XM4. Headphone nirkabel ini dilengkapi dengan teknologi noise cancellation yang unggul, "
                + "\nmenghilangkan suara bising di sekitar Anda untuk kualitas suara yang optimal. Kualitas suara yang mendalam, kenyamanan yang luar biasa, "
                + "\ndan baterai tahan lama menjadikan WH-1000XM4 pilihan terbaik bagi penggemar musik yang menginginkan pengalaman dengar yang istimewa.",4999000));
        wearable.add(new Barang("Xiaomi Amazfit GTS 2 Smartwatch","Dapatkan gaya dan kinerja dalam satu paket dengan Xiaomi Amazfit GTS 2 Smartwatch. Dilengkapi dengan layar AMOLED yang indah, pemantauan detak jantung, "
                + "\ndan pelacakan tidur yang akurat, GTS 2 membantu Anda menjaga kesehatan dan kebugaran Anda. Fitur-fitur seperti notifikasi cerdas, "
                + "\npemutar musik, dan tahan air hingga 50 meter menjadikannya pilihan sempurna untuk gaya hidup aktif Anda.",2099000));
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