package JavaCore.Vjezba;

/*
Write a Java program to reverse a string.
 */

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Molimo unesite zeljenu recenicu:");
        char[] letters = sc.nextLine().toCharArray();
        System.out.print("Vasa recenica naopako glasi: \n");
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
        System.out.print("\n");

    }
}

