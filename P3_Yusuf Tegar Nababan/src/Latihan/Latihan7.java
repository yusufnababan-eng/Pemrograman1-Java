package Latihan;

import java.text.NumberFormat;
import java.util.Locale;

public class Latihan7 {
    public static void main (String [] args) {
        double nilaiPasar = 125000750.85;
        double rasioPertumbuhan = 0.15752;
        
        NumberFormat fmtAngkaUK = NumberFormat.getNumberInstance(Locale.UK);
        NumberFormat fmtMataUangUK = NumberFormat.getCurrencyInstance(Locale.UK);  
        NumberFormat fmtPersenUK = NumberFormat.getPercentInstance(Locale.UK);
        
        System.out.println("=== LAPORAN INVESTASI (WILAYAH: UNITED KINGDOM) ===");
        System.out.println("Nilai Aset   : " + fmtAngkaUK.format(nilaiPasar));
        System.out.println("Total Pound  : " + fmtMataUangUK.format(nilaiPasar));
        System.out.println("Margin Profit: " + fmtPersenUK.format(rasioPertumbuhan));
        
        System.out.println("\n" + "=".repeat(45) + "\n");
        
        NumberFormat fmtAngkaJAPAN = NumberFormat.getNumberInstance(Locale.JAPAN);
        NumberFormat fmtMataUangJAPAN = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        NumberFormat fmtPersenJAPAN = NumberFormat.getPercentInstance(Locale.JAPAN);
        
        System.out.println("=== GLOBAL INVESTMENT REPORT (REGION: JAPAN) ===");
        System.out.println("Market Value : " + fmtAngkaJAPAN.format(nilaiPasar));
        System.out.println("Total Yen    : " + fmtMataUangJAPAN.format(nilaiPasar));
        System.out.println("Growth Ratio : " + fmtPersenJAPAN.format(rasioPertumbuhan));
        
        System.out.println("\nSistem Pelaporan Global Berhasil Dijalankan.");
    }
}
