package JavaCore.Vjezba;

import java.util.Scanner;

/*
Write a Java program to test if 10 appears as either the first or last element of an array of integers.
The length of the array must be greater than or equal to 2
 */
public class FirstLastInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 5 numbers and I will check if 10 appears as either the first or last element");
        int[] n = new int[5];
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        System.out.println(n[0] == 10 || n[n.length - 1] == 10);
    }
}
