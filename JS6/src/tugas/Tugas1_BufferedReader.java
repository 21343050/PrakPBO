package tugas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tugas1_BufferedReader {
    public static void main(String[] args) {
        BufferedReader inputNilai = new BufferedReader(new InputStreamReader(System.in));

        String a, b, c;
        float nilai1, nilai2, nilai3, rata;

        try {
            System.out.print("Masukkan Nilai ke-1: ");
            a = inputNilai.readLine();
            nilai1 = Float.parseFloat(a);

            System.out.print("Masukkan Nilai ke-2: ");
            b = inputNilai.readLine();
            nilai2 = Float.parseFloat(b);

            System.out.print("Masukkan Nilai ke-3: ");
            c = inputNilai.readLine();
            nilai3 = Float.parseFloat(c);

            rata = (nilai1 + nilai2 + nilai3) / 3;

            if ( rata >= 60 ) {
                System.out.printf("Anda Lulus :-), Dengan Nilai: %.2f", rata);
            } else {
                System.out.printf("Anda Tidak Lulus :-(, Dengan Nilai: %.2f", rata);
            }
        } catch (Exception e) {
            System.out.println("Maaf! Salah Membaca Inputan");
        }
    }
}
