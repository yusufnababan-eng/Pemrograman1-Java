package Latihan;

public class Latihan3 {
    public static void main(String[] args) {
        
        double biayaOli = 35000;
        double biayaFilter = 20000;
        double biayaJasa = 45000;
        double promoMemberPersen = 10;
        
        double estimasiAwal = biayaOli + biayaFilter + biayaJasa;
        
        double potonganHarga = (promoMemberPersen / 100) * estimasiAwal;
        
        double biayaAkhir = estimasiAwal - potonganHarga;
        
        System.out.println("=== NOTA ESTIMASI SERVIS KENDARAAN ===");
        System.out.println("Subtotal Biaya       : Rp " + estimasiAwal);
        System.out.println("Potongan Member (10%): Rp " + potonganHarga);
        System.out.println("--------------------------------------");
        System.out.println("Total Bayar Konsumen : Rp " + biayaAkhir);
        System.out.println("======================================");
    }
}
