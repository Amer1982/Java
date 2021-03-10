package JavaCore.Vjezba;

import java.util.Scanner;

/*
Write a Java program to accept a number and check the number is even or not.
 */
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int i = sc.nextInt();
        if (i % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}
