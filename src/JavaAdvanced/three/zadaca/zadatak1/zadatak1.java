package JavaAdvanced.three.zadaca.zadatak1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\bnc\\Documents\\IT zadaci\\ITAcademy\\ITakademy 2020\\JavaAdvanced\\person.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                ArrayList<String> tekst = new ArrayList<>(Collections.singleton(sc.nextLine()));
                for (String osobe : tekst) {
                    System.out.println(osobe);
                }
            }
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
    }
}
