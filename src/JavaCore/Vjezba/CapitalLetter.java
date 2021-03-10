package JavaCore.Vjezba;

import java.util.Scanner;

/*
Write a Java program to capitalize the first letter of each word in a sentence.
 */
public class CapitalLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sentence with small letters: ");
        String a = sc.nextLine();
        String upper_case_line = "";
        Scanner lineScan = new Scanner(a);
        while (lineScan.hasNext()) {
            String word = lineScan.next();
            upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println(upper_case_line.trim());
    }
}
