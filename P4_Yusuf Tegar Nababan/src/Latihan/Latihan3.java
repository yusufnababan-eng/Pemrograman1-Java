package Latihan;

public class Latihan3 {
    public static void main(String[] args) {
        
        double makan = 35000;
        double transport = 20000;
        double belanja = 45000;
        double diskonPersen = 10;
        
        double total = makan + transport + belanja;
        double diskon = (diskonPersen / 100) * total;
        double totalbayar = total - diskon;
        
        System.out.println("Total sebelum diskon = " + total);
        System.out.println("Diskon = " + diskon);
        System.out.println("Total Setelah diskon = " + totalbayar);
    }
    
}
