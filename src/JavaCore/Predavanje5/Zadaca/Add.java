package JavaCore.Predavanje5.Zadaca;
//Napisati program za sabiranje dva realna broja, pri čemu se brojevi unose sa
//tastature.
import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite prvi broj:");
        int a = sc.nextInt();
        System.out.println("Unesite drugi broj:");
        int b = sc.nextInt();
        System.out.println("Rezultat je "+(a+b));

    }
}
