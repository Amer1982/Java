package JavaAdvanced.two;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TryWithResourceAfterJava8 {
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

        try (FileWriter fw = new FileWriter("imena.txt");
             PrintWriter pw = new PrintWriter(fw)) {

            for (int i = 0; i < ListofNames.size(); i++) {
                String name = ListofNames.get(i);
                System.out.println(name);
                pw.println(name);
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
