package JavaCore.Predavanje5.Zadaca;

import java.util.Scanner;

//Za uneseni redni broj ispisati godišnja doba. Ako se unese broj 1 ispisati
//“Proljeće”, za 2 “Ljeto”, za 3 ”Jesen”, za 4 “Zima”. Ako se unese neki peti broj
//ispisati da ne postoji godišnje doba sa tim brojem.
public class GodisnjeDoba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Molimo unesite redni broj godisnjeg doba:");
        int korisnickiUnos = sc.nextInt();
        if (korisnickiUnos == 1) {
            System.out.println("Proljece");
        } else if (korisnickiUnos == 2) {
            System.out.println("Ljeto");
        } else if (korisnickiUnos == 3) {
            System.out.println("Jesen");
        } else if (korisnickiUnos == 4) {
            System.out.println("Zima");
        } else {
            System.out.println("Unesite ispravan broj godisnjeg doba");
        }
    }
}
