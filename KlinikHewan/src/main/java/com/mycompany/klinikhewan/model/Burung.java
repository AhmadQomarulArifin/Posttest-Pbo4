/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.klinikhewan.model;

/**
 *
 * @author qomarul
 */

public class Burung extends Hewan implements perawatan {
    private String warnaBulu;

    public Burung(String namaPemilik, String noHP, String namaHewan, int umurHewan, String keluhan, String warnaBulu) {
        super(namaPemilik, noHP, namaHewan, "Burung", umurHewan, keluhan);
        this.warnaBulu = warnaBulu;
    }

    public String getWarnaBulu() { return warnaBulu; }
    public void setWarnaBulu(String warnaBulu) { this.warnaBulu = warnaBulu; }

    @Override
    public void tampilkanInfo() {
        System.out.println("Pemilik : " + getNamaPemilik() + " (HP: " + getNoHP() + ")");
        System.out.println("Hewan   : " + getNamaHewan() + " (" + getJenisHewan() + ")");
        System.out.println("Umur    : " + getUmurHewan() + " tahun");
        System.out.println("Keluhan : " + getKeluhan());
        System.out.println("Warna Bulu: " + warnaBulu);
    }

    @Override
    public void beriPerawatan() {
        System.out.println("Perawatan: Burung butuh kandang bersih & vitamin");
    }
}
