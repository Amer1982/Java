package JavaCore.Predavanje5.Zadaca;
//Izračunati minimum od tri broja upotrebom naredbe if-else.

import java.util.Scanner;

public class MinIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a < b && a < c) {
            System.out.println("Najmanji je a"+a);}
        else if (b < a && b < c) {
            System.out.println("Najmanji je b"+b);}
        else {
            System.out.println("Najmanji je c"+c);}
    }
}
