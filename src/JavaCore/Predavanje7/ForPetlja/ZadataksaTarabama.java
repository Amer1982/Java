package JavaCore.Predavanje7.ForPetlja;

/**
 * Ako su date promjenljive w = 10 i h = 20
 * <p>
 * • Potrebno je kreirati program koji na
 * izlazu kreira sljedeću sliku, tako da je
 * njena širina jednaka vrijednosti
 * promjenljive w, a visina jednaka
 * vrijednosti promjenljive h
 */
public class ZadataksaTarabama {
    public static void main(String[] args) {

        int w = 10;
        int h = 20;

        for (int i = 0; i <= w; i++) {
            for (int j = 0; j <= h; j++) {
                if (j == h || j == 0 || i == w || i == 0) {
                    System.out.print("#");
                } else
                    System.out.print("o");
            }System.out.println();
        }
    }
}
