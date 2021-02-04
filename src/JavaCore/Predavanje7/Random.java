package JavaCore.Predavanje7;

import java.util.Scanner;


/**
 * Program zamišlja broj i pita nas koji je broj zamislio, zatim nam nudi unos sa
 * tastature. Ukoliko pogodimo zamišljeni broj, računar nam potvrđuje, zamišlja novi
 * broj i ponavlja proceduru
 * • Ukoliko ne pogodimo, program nas obavještava da nismo pogodili i nudi
 * mogućnost unosa novog broja:
 */
public class Random {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Pogodi zamisljeni broj od 1 do 5");
            java.util.Random random = new java.util.Random();
            int zamisljeniBroj = random.nextInt(5);
            while (true) {
                System.out.println("Unesi broj");
                int unesenibroj = scanner.nextInt();
                if (unesenibroj == zamisljeniBroj) {
                    System.out.println("Bravo, idemo ponovo");
                    break;
                } else
                    System.out.println("Nije");
            }
        }
    }
}
