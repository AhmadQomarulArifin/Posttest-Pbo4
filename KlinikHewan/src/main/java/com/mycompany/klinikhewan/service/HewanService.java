/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.klinikhewan.service;

/**
 *
 * @author qomarul
 */

import com.mycompany.klinikhewan.model.*;
import java.util.ArrayList;
import java.util.Scanner;

public class HewanService {
    private ArrayList<Hewan> daftarHewan = new ArrayList<>();
    private Scanner input = new Scanner(System.in);
    
    


    // CREATE
    public void tambahHewan() {
        System.out.print("Nama Pemilik : ");
        String namaPemilik = input.nextLine();

        System.out.print("No HP Pemilik: ");
        String noHP = input.nextLine();
        if (noHP.isEmpty()) {
            System.out.println("No HP tidak boleh kosong!");
            return;
        }

        System.out.print("Nama Hewan   : ");
        String namaHewan = input.nextLine();

        System.out.print("Jenis Hewan (burung/ikan/lain): ");
        String jenisHewan = input.nextLine();

        System.out.print("Umur Hewan   : ");
        int umurHewan = input.nextInt();
        input.nextLine();
        if (umurHewan <= 0) {
            System.out.println("Umur hewan harus lebih dari 0!");
            return;
        }

        System.out.print("Keluhan      : ");
        String keluhan = input.nextLine();

        Hewan h;
        if (jenisHewan.equalsIgnoreCase("burung")) {
            System.out.print("Warna Bulu   : ");
            String warna = input.nextLine();
            h = new Burung(namaPemilik, noHP, namaHewan, umurHewan, keluhan, warna);
        } else if (jenisHewan.equalsIgnoreCase("ikan")) {
            System.out.print("Jenis Air (Tawar/Laut): ");
            String air = input.nextLine();
            h = new Ikan(namaPemilik, noHP, namaHewan, umurHewan, keluhan, air);
        } else {
            h = new Hewan(namaPemilik, noHP, namaHewan, jenisHewan, umurHewan, keluhan) {
                @Override
                public void tampilkanInfo() {
                    System.out.println("Pemilik : " + getNamaPemilik() + " (HP: " + getNoHP() + ")");
                    System.out.println("Hewan   : " + getNamaHewan() + " (" + getJenisHewan() + ")");
                    System.out.println("Umur    : " + getUmurHewan() + " tahun");
                    System.out.println("Keluhan : " + getKeluhan());
                }
            };
        }

        daftarHewan.add(h);
        System.out.println("Data berhasil ditambahkan!");
    }

    // READ
    public void lihatHewan() {
        System.out.println("\n=== Daftar Data Hewan ===");
        if (daftarHewan.isEmpty()) {
            System.out.println("Belum ada data.");
        } else {
            for (int i = 0; i < daftarHewan.size(); i++) {
                System.out.println((i + 1) + ".");
                daftarHewan.get(i).tampilkanInfo();
                if (daftarHewan.get(i) instanceof perawatan p) {
                    p.beriPerawatan();
                }
            }
        }
    }

    // UPDATE
    public void ubahHewan() {
        lihatHewan();
        if (daftarHewan.isEmpty()) return;

        System.out.print("Pilih nomor data yang akan diubah: ");
        int idx = input.nextInt();
        input.nextLine();
        if (idx < 1 || idx > daftarHewan.size()) {
            System.out.println("Nomor tidak valid!");
            return;
        }

        Hewan h = daftarHewan.get(idx - 1);

        System.out.print("Nama Pemilik baru (" + h.getNamaPemilik() + "): ");
        h.setNamaPemilik(input.nextLine());

        System.out.print("No HP baru (" + h.getNoHP() + "): ");
        h.setNoHP(input.nextLine());

        System.out.print("Nama Hewan baru (" + h.getNamaHewan() + "): ");
        h.setNamaHewan(input.nextLine());

        System.out.print("Jenis Hewan baru (" + h.getJenisHewan() + "): ");
        h.setJenisHewan(input.nextLine());

        System.out.print("Umur Hewan baru (" + h.getUmurHewan() + "): ");
        h.setUmurHewan(input.nextInt());
        input.nextLine();

        System.out.print("Keluhan baru (" + h.getKeluhan() + "): ");
        h.setKeluhan(input.nextLine());

        System.out.println(" Data berhasil diubah!");
    }

    // DELETE
    public void hapusHewan() {
        lihatHewan();
        if (daftarHewan.isEmpty()) return;

        System.out.print("Pilih nomor data yang akan dihapus: ");
        int idx = input.nextInt();
        input.nextLine();
        if (idx < 1 || idx > daftarHewan.size()) {
            System.out.println(" Nomor tidak valid!");
            return;
        }

        daftarHewan.remove(idx - 1);
        System.out.println(" Data berhasil dihapus!");
    }

    // SEARCH (Overloading + Overriding demo)
    public void cariHewan() {
        System.out.print("Masukkan nama hewan yang dicari: ");
        String keyword = input.nextLine().toLowerCase();
        cariHewan(keyword);
    }

    public void cariHewan(String keyword) {
        boolean ditemukan = false;
        for (Hewan h : daftarHewan) {
            if (h.getNamaHewan().toLowerCase().contains(keyword)) {
                h.tampilkanInfo();
                if (h instanceof perawatan p) {
                    p.beriPerawatan();
                }
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println(" Data tidak ditemukan.");
        }
    }

    public void cariHewan(String keyword, String jenis) {
        boolean ditemukan = false;
        for (Hewan h : daftarHewan) {
            if (h.getNamaHewan().toLowerCase().contains(keyword) &&
                h.getJenisHewan().equalsIgnoreCase(jenis)) {
                h.tampilkanInfo();
                if (h instanceof perawatan p) {
                    p.beriPerawatan();
                }
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println(" Data tidak ditemukan.");
        }
    }
}
