/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.klinikhewan.main;

/**
 *
 * @author qomarul
 */



import com.mycompany.klinikhewan.model.*;
import com.mycompany.klinikhewan.service.HewanService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HewanService service = new HewanService();
        Scanner input = new Scanner(System.in);
        int pilihan;

        // ================= Demo Overriding =================
        Burung b = new Burung("Ali", "08123", "Cendrawasih", 2, "Bulu rontok", "Merah");
        Ikan i = new Ikan("Siti", "08234", "Nemo", 1, "Sirip luka", "Air Tawar");

        System.out.println("\n=== Demo Overriding ===");
        b.tampilkanInfo();
        b.beriPerawatan();
        i.tampilkanInfo();
        i.beriPerawatan();

      

        // ================= Menu CRUD Interaktif =================
        do {
            System.out.println("\n=== MENU KLINIK HEWAN ===");
            System.out.println("1. Tambah Data Hewan");
            System.out.println("2. Lihat Data Hewan");
            System.out.println("3. Ubah Data Hewan");
            System.out.println("4. Hapus Data Hewan");
            System.out.println("5. Cari Data Hewan");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1 -> service.tambahHewan();
                case 2 -> service.lihatHewan();
                case 3 -> service.ubahHewan();
                case 4 -> service.hapusHewan();
                case 5 -> {
                    System.out.println("\n=== SUB MENU CARI DATA ===");
                    System.out.println("1. Cari (tanpa parameter, input langsung)");
                    System.out.println("2. Cari berdasarkan nama (1 parameter)");
                    System.out.println("3. Cari berdasarkan nama + jenis (2 parameter)");
                    System.out.print("Pilih sub menu: ");
                    int sub = input.nextInt();
                    input.nextLine();

                    if (sub == 1) {
                        service.cariHewan(); // versi tanpa parameter
                    } else if (sub == 2) {
                        System.out.print("Masukkan nama hewan: ");
                        String nama = input.nextLine();
                        service.cariHewan(nama); // versi 1 parameter
                    } else if (sub == 3) {
                        System.out.print("Masukkan nama hewan: ");
                        String nama = input.nextLine();
                        System.out.print("Masukkan jenis hewan: ");
                        String jenis = input.nextLine();
                        service.cariHewan(nama, jenis); // versi 2 parameter
                    } else {
                        System.out.println("Sub menu tidak tersedia.");
                    }
                }
                case 6 -> System.out.println("Terima kasih, program selesai.");
                default -> System.out.println("Pilihan tidak tersedia.");
            }
        } while (pilihan != 6);

        input.close();
    }
}