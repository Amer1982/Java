package JavaCore.Vjezba;

import java.util.Scanner;

/*
Write a Java program that accepts three integers from the user and return true if the second number is greater than
first number and third number is greater than second number.
If another variable "abc" is true second number does not need to be greater than first number.
 */
public class GraterThan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first number:");
        int a = sc.nextInt();
        System.out.println("Please enter your second number:");
        int b = sc.nextInt();
        System.out.println("Please enter your third number:");
        int c = sc.nextInt();
        System.out.print("The result is: " + test(a, b, c, true));
        System.out.println();
    }

    public static boolean test(int a, int b, int c, boolean abc) {
        if (abc)
            return (c > b);
        return (b > a && c > b);

    }
}
