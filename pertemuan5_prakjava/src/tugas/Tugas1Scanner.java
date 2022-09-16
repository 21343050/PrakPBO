package tugas;

import java.util.Scanner;

public class Tugas1Scanner {
    public static void main(String[] args) {
        Scanner inputKataScanner = new Scanner(System.in);

        String word1, word2, word3;

        System.out.print("Enter word1:");
        word1 = inputKataScanner.nextLine();
        System.out.print("Enter word2:");
        word2 = inputKataScanner.nextLine();
        System.out.print("Enter word3:");
        word3 = inputKataScanner.nextLine();

        System.out.println(word1+" "+word2+" "+word3);

        inputKataScanner.close();
    }
}
