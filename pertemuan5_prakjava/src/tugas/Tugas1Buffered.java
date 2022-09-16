package tugas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tugas1Buffered {
    public static void main(String[] args) {
        BufferedReader inputKataReader = new BufferedReader(new InputStreamReader(System.in));

        String word1 = "", word2 = "", word3 = "";

        try {
            System.out.print("Enter word1:");
            word1 = inputKataReader.readLine();
            System.out.print("Enter word2:");
            word2 = inputKataReader.readLine();
            System.out.print("Enter word3:");
            word3 = inputKataReader.readLine();
        } catch (Exception e) {
            System.out.println("Gagal membaca keyboard");
        }
        System.out.println(word1+" "+word2+" "+word3);
    }
}
