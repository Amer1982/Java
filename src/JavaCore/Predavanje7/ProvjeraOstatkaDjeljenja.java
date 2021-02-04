package JavaCore.Predavanje7;

/**
 * U program ulaze sljedeći podaci:
 * • Potrebno je izvršiti provjeru ostatka dijeljenja x i y.
 * Ukoliko ne postoji ostatak, prikazati poruku da
 * ostatak ne postoji, u suprotnom, provjeriti da li je
 * ostatak veći ili manji od hiljadu i dati odgovarajuću
 * poruku.
 */
public class ProvjeraOstatkaDjeljenja {

    public static void main(String[] args) {

        int x = 523134;
        int y = 325423;
        int a = x % y;
        System.out.println(a);

        if (a == 0)
            System.out.println("Ostatak ne postoji");
        else if (a > 1000)
            System.out.println("Ostatak je veci od hiljadu");
        else
            System.out.println("Ostatak je manji od hiljadu");
    }
}

