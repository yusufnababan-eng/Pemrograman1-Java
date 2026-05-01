package Latihan;


import javax.swing.JOptionPane;

public class Latihan3 {
    public static void main (String [] args) {
        String nama = "";
        
        nama = JOptionPane.showInputDialog("Masukkan Nama Anda : " );
        
        String pesan =" Assalamualaikum " + nama + " !! " ;
        
        JOptionPane.showMessageDialog(null, pesan);
    }
}
