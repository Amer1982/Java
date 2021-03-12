package JavaAdvanced.two.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CopyLines {
    public static void main(String[] args) {

        try (FileReader fr = new FileReader("imena.txt");
             BufferedReader br = new BufferedReader(fr)
        ) {
            String line = null;
            System.out.println("Saljem txt file");
            while ((line = br.readLine()) != null) {
                System.out.println(line );
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
