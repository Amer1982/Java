package JavaAdvanced.two.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ScannerUsage {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            //System.out.println("Šaljem imena u konzolu...\n");
            File dokument = new File("imena.txt");
            Scanner sc = new Scanner(dokument);
            System.out.println("Šaljem imena u konzolu...\n");
            while (sc.hasNextLine()) {
                String tekst = sc.nextLine();
                System.out.print(tekst+", ");
            }
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
    }
}
