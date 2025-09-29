/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.klinikhewan.model;

/**
 *
 * @author qomarul
 */

public class Ikan extends Hewan implements perawatan {
    private String jenisAir;

    public Ikan(String namaPemilik, String noHP, String namaHewan, int umurHewan, String keluhan, String jenisAir) {
        super(namaPemilik, noHP, namaHewan, "Ikan", umurHewan, keluhan);
        this.jenisAir = jenisAir;
    }

    public String getJenisAir() { return jenisAir; }
    public void setJenisAir(String jenisAir) { this.jenisAir = jenisAir; }

    @Override
    public void tampilkanInfo() {
        System.out.println("Pemilik : " + getNamaPemilik() + " (HP: " + getNoHP() + ")");
        System.out.println("Hewan   : " + getNamaHewan() + " (" + getJenisHewan() + ")");
        System.out.println("Umur    : " + getUmurHewan() + " tahun");
        System.out.println("Keluhan : " + getKeluhan());
        System.out.println("Jenis Air: " + jenisAir);
    }

    @Override
    public void beriPerawatan() {
        System.out.println("Perawatan: Ikan butuh air bersih & pakan teratur");
    }
}
