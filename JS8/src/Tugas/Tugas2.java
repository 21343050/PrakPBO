package Tugas;

import javax.swing.JOptionPane;

public class Tugas2 {
    public static void main(String[] args) {
        int no[] = new int[10];
        String str[] = new String[10];
        int jumlah = 10;
        int max;
        int lokasi = 1;

        try {
            for (int i = 1; i <= no.length; i++) {
                str[i] = JOptionPane.showInputDialog("Masukkan Angka: ");

                no[i] = Integer.parseInt(str[i]);
            }


        } catch (Exception e) {
            System.err.println("error3");
        }

        max = no[0];

        for (int i = 0; i <= jumlah; i++) {
            if (no[i] > max) {
                max = no[i];
                lokasi = i+1;
            }

            System.out.println(lokasi);
            JOptionPane.showMessageDialog(null, max);
        }



    }
}
