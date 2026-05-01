package Latihan;

import java.text.NumberFormat;
import java.util.Scanner;

public class Latihan5 {
    public static void main (String [] args) {
        Scanner keyboard = new Scanner(System.in);
        double rasioProfit;
        
        System.out.println("=== SISTEM ANALISIS PROFITABILITAS ===");
        System.out.print("Masukkan rasio laba (contoh 0.25 untuk 25%): ");
        rasioProfit = keyboard.nextDouble();
        
        NumberFormat formatPersentase = NumberFormat.getPercentInstance();
        
        System.out.println("--------------------------------------");
        System.out.println("Margin Keuntungan Bersih: " + formatPersentase.format(rasioProfit));
        
        keyboard.close();
    }
}
