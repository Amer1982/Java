package JavaCore.Vjezba;

import java.util.Scanner;

/*
Write a Java program to create a new string taking first three characters from a given string.
If the length of the given string is less than 3 use "#" as substitute characters.
 */
public class StringCut {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your word");
        String a = sc.nextLine();
        int x = a.length();
        System.out.println("Your word has " + x + " letters");
        if (x >= 3)
            System.out.println("New word is " + a.substring(0, 3));
        else if (x == 2)
            System.out.println(("New word is " + a.substring(0, 2) + "#"));
        else if (x == 1)
            System.out.println((a.charAt(0) + "##"));
        else
            System.out.println("###");
    }
}
