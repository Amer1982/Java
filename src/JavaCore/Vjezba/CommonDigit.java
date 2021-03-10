package JavaCore.Vjezba;

import java.util.Scanner;

/*
Write a Java program that accepts two integer values between 25 to 75 and return true if there is a common digit in both numbers
 */
public class CommonDigit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first number between 25 and 75");
        int a = sc.nextInt();
        System.out.println("Enter second number between 25 and 75");
        int b = sc.nextInt();
        System.out.println("Common No. exists: "+commonDigit(a,b));

    }public static boolean commonDigit(int c, int d){
        if (c<25 || d>75)
            return false;
        int x = c%10;
        int y = d%10;
        c/=10;
        d/=10;
        return (c==d||c==y||x==d||x==y);
    }
}
