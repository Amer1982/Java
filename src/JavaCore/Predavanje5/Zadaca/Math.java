package JavaCore.Predavanje5.Zadaca;
//Izračunati najmanji od proizvoljno unesena 4 broja, koristite klasu Math.
import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Molimo unesite prvi broj: ");
        double a =sc.nextDouble();
        System.out.println("Molimo unesite drugi broj: ");
        double b =sc.nextDouble();
        System.out.println("Molimo unesite treci broj: ");
        double c =sc.nextDouble();
        System.out.println("Molimo unesite cetvrti broj: ");
        double d =sc.nextDouble();
        System.out.println("Najmanji od unesenih brojeva je "+java.lang.Math.min(a, java.lang.Math.min(b, java.lang.Math.min(c,d))));
    }
}
