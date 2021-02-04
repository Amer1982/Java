package JavaCore.Predavanje3;
/*
Napraviti program koji će na izlazu prikazati da li je vrijednost
promjenljive koju je korisnik unio parna. Takođe, treba da bude
prikazana unešena vrijednost
 */
import java.util.Scanner;

public class Vjezba2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Molimo unesite vrijednost:");
        int vrijednost = sc.nextInt();
        System.out.println("Unesena vrijednost je "+vrijednost);
        System.out.println("Vrijednost je parna: "+(0==vrijednost%2));
    }
}
