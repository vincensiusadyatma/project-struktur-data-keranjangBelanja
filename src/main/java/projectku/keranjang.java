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

    public void tampilkanKeranjang() {
        Node current = first;
        System.out.println("Isi Keranjang:");
        while (current != null) {
          // System.out.println(current.getBarang().getNama());
            //current = current.getKanan();
        }
    }

    public int ukuran() {
        return size;
    }
}
