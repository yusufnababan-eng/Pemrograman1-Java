package Latihan;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner inputSistem = new Scanner(System.in);
        
        double padi, jagung, kedelai, kapasitasTotal;
        double persenPadi, persenJagung, persenKedelai;
        
        System.out.println("=== SISTEM MONITORING HASIL PANEN ===");
        
        System.out.print("Input hasil Padi (ton)    : ");
        padi = inputSistem.nextDouble();
        
        System.out.print("Input hasil Jagung (ton)  : ");
        jagung = inputSistem.nextDouble();
        
        System.out.print("Input hasil Kedelai (ton) : ");
        kedelai = inputSistem.nextDouble();
        
        kapasitasTotal = padi + jagung + kedelai;
        
        persenPadi = (padi / kapasitasTotal) * 100;
        persenJagung = (jagung / kapasitasTotal) * 100;
        persenKedelai = (kedelai / kapasitasTotal) * 100;
        
        System.out.println("\n------------------------------------");
        System.out.println("REKAPITULASI DISTRIBUSI GUDANG");
        System.out.println("Total Produksi : " + kapasitasTotal + " Ton");
        System.out.println("Kontribusi Padi    : " + persenPadi + " %");
        System.out.println("Kontribusi Jagung  : " + persenJagung + " %");
        System.out.println("Kontribusi Kedelai : " + persenKedelai + " %");
        System.out.println("------------------------------------");
        
        inputSistem.close();
    }
}
