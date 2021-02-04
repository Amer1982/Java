package JavaCore.Predavanje7;

/**
 * Dati su sljedeći ulazni podaci za jedno vozilo:
 * String carMake = "Ford";
 * int doors = 4;
 * • Potrebno je napraviti uslovnu konstrukciju koja će da
 * provjerava da li je proizvođač automobila Ford i
 * ukoliko jeste, da u zavisnosti od broja vrata prikazuje
 * odgovarajuću poruku
 */

public class IfPlusSwitch {
    public static void main(String[] args) {
        String carMake = "Ford";
        int doors = 4;
        if (carMake.equals("Ford")) {
            switch (doors) {
                case 2:
                    System.out.println("Broj vrata je 2");
                case 4:
                    System.out.println("Broj vrata je 4");
            }
        } else
            System.out.println("Auto nije Ford");
    }
}
