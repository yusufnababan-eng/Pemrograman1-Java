package Latihan;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        
        int bil1, bil2;
        char aksi;
        double nilaiAkhir = 0;
        
        System.out.println("--- APLIKASI HITUNG SEDERHANA ---");
        
        System.out.print("Input bilangan ke-1 : ");
        bil1 = inputData.nextInt();
        
        System.out.print("Pilih aksi (+, -, *, /) : ");
        aksi = inputData.next().charAt(0);
        
        System.out.print("Input bilangan ke-2 : ");
        bil2 = inputData.nextInt();
        
        if (aksi == '+') {
            nilaiAkhir = bil1 + bil2;
        } else if (aksi == '-') {
            nilaiAkhir = bil1 - bil2;
        } else if (aksi == '*') {
            nilaiAkhir = bil1 * bil2;
        } else if (aksi == '/') {
            if (bil2 != 0) {
                nilaiAkhir = (double) bil1 / bil2;                
            } else {
                System.out.println("Peringatan: Pembagian dengan angka 0 dilarang!");
                return;
            }
        } else {
            System.out.println("Peringatan: Aksi tidak dikenali sistem!");
            return;
        }
        
        System.out.println("Total Kalkulasi: " + nilaiAkhir);
    }
}