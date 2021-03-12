package JavaAdvanced.two;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

/*
PrintWriter
fileWriter

-IOException

 */

public class TryCatchFinalybfJava8 {
    public static void main(String[] args) throws IOException {

        List<String> ListofNames = new ArrayList<>();
        ListofNames.add("Dino");
        ListofNames.add("Armin");
        ListofNames.add("Amila");
        ListofNames.add("Mitar");
        ListofNames.add("Dino");
        ListofNames.add("Benjamin");
        ListofNames.add("Amer");
        ListofNames.add("Aida");
        ListofNames.add("Emir");
        ListofNames.add("Edin");

        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("imena.txt");
            pw = new PrintWriter(fw);
            for (int i = 0; i < ListofNames.size(); i++) {
                String name = ListofNames.get(i);
                System.out.println(name);
                pw.println(name);
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }
}
