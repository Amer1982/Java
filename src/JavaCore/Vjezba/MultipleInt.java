package JavaCore.Vjezba;
/*
Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
 */

import java.util.Scanner;

public class MultipleInt {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        String a = in.nextLine();
        String s1 = a;
        String s2 = a + a;
        String s3 = a + a + a;
        int i = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);
        int i3 = Integer.parseInt(s3);
        int s4 = i+i2+i3;
        System.out.print("Input num: ");
        int n = in.nextInt();
        System.out.println(s1 + " + " + s2 + " + " + s3 + " = " + s4);
        System.out.printf("%d + %d%d + %d%d%d\n", n, n, n, n, n, n);
    }
}
