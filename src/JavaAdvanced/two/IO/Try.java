package JavaAdvanced.two.IO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner("imena.txt")
        ) {
            System.out.println("Saljem txt file");
            while (sc.hasNext()){
                String line = sc.nextLine();
                System.out.println(line);
            }
        }/*catch (FileNotFoundException fnf){
            System.err.println(fnf.getMessage());
        }*/
    }
}
