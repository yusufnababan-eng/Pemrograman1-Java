package Latihan;

import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner resepsionis = new Scanner(System.in);
        
        String namaTamu;
        int nomorKamar = 204;
        
        // Variabel pendukung disiapkan untuk menggantikan diskon/kredit/debit
        int lamaMenginap, biayaLayanan, totalTagihan; 
        
        System.out.print("Masukkan nama lengkap tamu untuk check-in: ");
        namaTamu = resepsionis.nextLine();
        
        if (!namaTamu.isEmpty()) {
            System.out.println("\n=== SISTEM RESERVASI & KAMAR ===");
            System.out.println("Selamat datang di sistem manajemen, " + namaTamu);
            System.out.println("Kamar yang telah disiapkan untuk Anda: Kamar " + nomorKamar);
            System.out.println("Status: Siap ditempati.");
        } else {
            System.out.println("Sistem Ditolak: Nama tamu tidak boleh dibiarkan kosong!");
        }
        
        resepsionis.close();
    }
}