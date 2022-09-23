package tugas;

import javax.swing.JOptionPane;

public class Tugas1_JOptionPane {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Masukkan Nilai ke-1: ");
        String b = JOptionPane.showInputDialog("Masukkan Nilai ke-2: ");
        String c = JOptionPane.showInputDialog("Masukkan Nilai ke-3: ");

        int nilai1 = Integer.parseInt(a);
        int nilai2 = Integer.parseInt(b);
        int nilai3 = Integer.parseInt(c);

        int rata = (nilai1 + nilai2 + nilai3) / 3;

        if ( rata >= 60 ) {
            String msg1 = "Anda Lulus :-), Dengan Nilai: "+ rata;
            JOptionPane.showMessageDialog(null, msg1);
        } else {
            String msg2 = "Anda Tidak Lulus :-(, Dengan Nilai: "+ rata;
            JOptionPane.showMessageDialog(null, msg2);
        }
    }
}
