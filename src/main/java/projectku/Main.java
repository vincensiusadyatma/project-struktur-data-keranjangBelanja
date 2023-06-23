package projectku;

import projectku.Barang;
import projectku.Gudang;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat currency = new DecimalFormat("###,###.##");
        boolean loop = true;
        ArrayList<Barang> keranjang = new ArrayList<>();
        ArrayList<Barang> choose = null;
        Gudang gudang = new Gudang();
        keranjang keranjangku = new keranjang();

        while(loop == true) {
            boolean loop2 = true;
            menu();
            int menuAwal = input.nextInt();

            if (menuAwal == 1) {
                System.out.println();
                System.out.print("""
                        kategori
                            1. Elektronik
                            2. Fashion
                            3. Wearable
                        input (1-3):\s""");
                int kategori = input.nextInt();
                if (kategori == 1) {
                    System.out.println();
                    choose = gudang.getElektronik();
                    cetakBarang(choose);

                } else if (kategori == 2) {
                    System.out.println();
                    choose = gudang.getFashion();
                    cetakBarang(choose);


                } else if (kategori == 3) {
                    System.out.println();
                    choose = gudang.getWearable();
                    cetakBarang(choose);

                }

                while (loop2 == true) {
                    System.out.println("_".repeat(50));
                    System.out.print("""
                                    1. Pilih barang
                                    2. Kembali
                                input:\s""");
                    int pilihan = input.nextInt();
                    if (pilihan == 1) {
                        System.out.print("Pilih barang: ");
                        int barangPilih = input.nextInt();

                        System.out.println();
                        System.out.println(choose.get(barangPilih-1).toString());
                        System.out.print("Apakah anda ingin memasukan item ini ke keranjang?? 1 untuk ya dan 2 untuk tidak ==> ");
                        int masukanItem = input.nextInt();

                        if (masukanItem == 1) {
                            keranjangku.tambahBarang(choose.get(barangPilih-1));
                            loop2 = false;
                        }
                    } else {
                        loop2 = false;
                    }
                }

            } else if (menuAwal == 2) {
                if (keranjangku.ukuran() == 0) {
                    System.out.println("item di keranjang saat ini kosong");
                } else {
                    System.out.println("_".repeat(50));
                    System.out.println("Barang yang ada di keranjang anda: ");
                    System.out.println("_".repeat(50));
                    keranjangku.tampilkanKeranjang();
                    System.out.println("_".repeat(50));
                    System.out.println();
                    System.out.print("""
                                1. Checkout barang
                                2. kembali
                            input:\s""");
                    int menuKeranjang = input.nextInt();

                    if (menuKeranjang == 1) {
                        System.out.print("""
                                    1. Checkout semua
                                    2. Checkout satu barang
                                input:\s""");
                        int menuCheck = input.nextInt();

                        if (menuCheck == 1) {
                            System.out.println("Total biaya: " + currency.format(keranjangku.biayaTotal()));
                            System.out.print("Apakah anda yakin ingin checkout semua? 1 untuk ya dan 2 untuk tidak ==> ");
                            int check = input.nextInt();

                            if (check == 1) {
                                keranjangku.clear();
                            }
                        } else if (menuCheck == 2) {
                            System.out.print("Barang mana yang akan anda bayar: ");
                            int bayarBarang = input.nextInt();
                            Barang pilihBarang = choose.get(bayarBarang-1);
                            System.out.println(pilihBarang.getNamaBarang()+ " dengan harga " + currency.format(pilihBarang.getHarga()));
                            keranjangku.hapusBarang(pilihBarang);
                        }
                    }
                }
            } else if (menuAwal == 3) {
                System.out.println("Terimakasih telah berbelanja disini");
                loop = false;
            } else {
                System.out.println("Pilihan tidak ada di menu utama. Silahkan input sesuai pada pilihan yang ada");
            }
            System.out.println();
        }
    }

    static void cetakBarang(ArrayList<Barang> barang) {
        for (int i = 0; i < barang.size(); i++) {
            System.out.printf("%d. %s\n", (i+1), barang.get(i).getNamaBarang());
        }
    }

    static int tampilkanBiaya(ArrayList<Barang> barang) {
        int total = 0;
        for (int i = 0; i < barang.size(); i++) {
            total += barang.get(i).getHarga();
        }
        return total;
    }

    static void menu() {
        System.out.println("========== MENU KERANJANG BELANJA ==========");
        System.out.print("""
                        1. Pilih Barang
                        2. Keranjang
                        3. Keluar
                    input(1-3):\s""");
    }
}