package Latihan;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Latihan4 {
    public static void main (String [] args) {
        Scanner inputSistem = new Scanner(System.in);
        
        System.out.println("=== PENETAPAN LABEL HARGA BARANG ===");
        System.out.print("Masukkan nominal harga: ");
        double hargaInput = inputSistem.nextDouble();
        
        Locale wilayahIndo = new Locale("id", "ID");
        NumberFormat formatMataUang = NumberFormat.getCurrencyInstance(wilayahIndo);
        
        System.out.println("------------------------------------");
        System.out.println("Hasil Label : " + formatMataUang.format(hargaInput));
        System.out.println("Keterangan  : Harga sudah termasuk PPN");
        
        inputSistem.close();
    }
}
