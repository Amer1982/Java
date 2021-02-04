package JavaCore.Predavanje7.ForPetlja;

/**
 * Kreirati for petlju koja će prikazati tablicu množenja sa 1,
 * 2 i 3 za brojeve od 1 do 10
 */
public class TablicaMnoženja {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((i+1) * (j+1)+" ");
            }
            System.out.println();
        }
    }
}
