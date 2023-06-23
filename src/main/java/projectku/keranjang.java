/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectku;

import java.util.ArrayList;

class Node {
    private Barang barang;
    private Node kanan;

    public Node(Barang barang) {
        this.barang = barang;
        this.kanan = null;
    }

    public Barang getBarang() {
        return barang;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }

    public Node getKanan() {
        return kanan;
    }

    public void setKanan(Node kanan) {
        this.kanan = kanan;
    }
}

public class keranjang {
    private Node first;
    private Node last;
    private int size;

    public keranjang() {
        first = null;
        last = null;
        size = 0;
    }

    public void tambahBarang(Barang barang) {
        Node newNode = new Node(barang);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.setKanan(newNode);
            last = newNode;
        }
        size++;
    }
    
    

    public Barang ambilBarang(int indeks) {
        if (indeks < 0 || indeks >= size) {
            throw new IndexOutOfBoundsException("Indeks di luar batas keranjang.");
        }

        Node current = first;
        for (int i = 0; i < indeks; i++) {
            current = current.getKanan();
        }

        return current.getBarang();
    }
    
   public void hapusBarang(Barang barang) {
    Node saatIni = first;
    Node sebelumnya = null;
    
    while (saatIni != null) {
        if (saatIni.getBarang().equals(barang)) {
            if (sebelumnya == null) {
                first = saatIni.getKanan();
            } else {
                sebelumnya.setKanan(saatIni.getKanan());
            }
            
            if (saatIni == last) {
                last = sebelumnya;
            }
            
            size--;
            return;
        }
        
        sebelumnya = saatIni;
        saatIni = saatIni.getKanan();
    }
}

    public void tampilkanKeranjang() {
        Node current = first;
        System.out.println("Isi Keranjang:");
        while (current != null) {
           System.out.println(current.getBarang().getNamaBarang());
            current = current.getKanan();
        }
    }
    
     public Barang cariBarang(String nama) {
        Node current = first;
        while (current != null) {
            if (current.getBarang().getNamaBarang().equals(nama)) {
                return current.getBarang();
            }
            current = current.getKanan();
        }
        return null; // Barang tidak ditemukan
    }
     
    public double biayaTotal() {
    double total = 0;
    Node saatIni = first;

    while (saatIni != null) {
        total += saatIni.getBarang().getHarga();
        saatIni = saatIni.getKanan();
    }

    return total;
}
     
    public void clear() {
        first = null;
        last = null;
        size = 0;
    }
    public int ukuran() {
        return size;
    }
}
