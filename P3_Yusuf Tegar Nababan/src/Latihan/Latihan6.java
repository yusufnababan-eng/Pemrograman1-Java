package Latihan;

import java.text.NumberFormat; // Impor spesifik agar lebih rapi

public class Latihan6 {
    public static void main(String [] args) {
        double nilaiEksperimen = 95230.754821;
        double rasioKeberhasilan = 0.8845672;
        
        NumberFormat fmtNumerik = NumberFormat.getNumberInstance(); 
        NumberFormat fmtMataUang = NumberFormat.getCurrencyInstance();
        NumberFormat fmtPersentase = NumberFormat.getPercentInstance();
        
        System.out.println("--- LOG DATA LABORATORIUM (DEFAULT) ---");
        System.out.println("Nilai Uji   : " + fmtNumerik.format(nilaiEksperimen));
        System.out.println("Biaya Riset : " + fmtMataUang.format(nilaiEksperimen));
        System.out.println("Rasio Sukses: " + fmtPersentase.format(rasioKeberhasilan));
        
        System.out.println("\n--- PENYESUAIAN PRESISI DATA (CUSTOM) ---");
        
        fmtNumerik.setMaximumIntegerDigits(8);
        fmtMataUang.setMaximumIntegerDigits(12);
        fmtPersentase.setMinimumIntegerDigits(2);
        
        fmtNumerik.setMinimumFractionDigits(3);
        fmtNumerik.setMaximumFractionDigits(4);
        
        fmtMataUang.setMinimumFractionDigits(0);
        fmtMataUang.setMaximumFractionDigits(1);
        
        fmtPersentase.setMinimumFractionDigits(5);
        fmtPersentase.setMaximumFractionDigits(7);
        
        // Output Hasil Akhir
        System.out.println("Format Numerik (3-4 desimal) : " + fmtNumerik.format(nilaiEksperimen));
        System.out.println("Format Moneter (0-1 desimal) : " + fmtMataUang.format(nilaiEksperimen));
        System.out.println("Format Akurasi Persen        : " + fmtPersentase.format(rasioKeberhasilan));
    }
}
