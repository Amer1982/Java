package JavaCore.Predavanje2;

import java.util.Scanner;

public class PravoguaonikSaSkenerom {
    final static String measure = "cm";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite stranicu a");
        int a = sc.nextInt();
        System.out.println("Unesite stranicu b");
        int b = sc.nextInt();
        int res = a * b;

        System.out.println("Povrsina pravougaonika stranice a= " + a + measure + " i stranice b= " + b + measure + " iznosi " + res + measure);
    }
}
