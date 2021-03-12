package JavaAdvanced.three.zadaca.Zadatak2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class dao {


    public void create(dao Person) throws FileNotFoundException {

    }
        static List<Person> retriveAll() {
            List<Person> personList = new ArrayList<>();
            String line = null;
            try (Scanner file = new Scanner(new FileReader
                    ("C:\\Users\\bnc\\Documents\\IT zadaci\\ITAcademy\\ITakademy 2020\\JavaAdvanced\\person.txt"))) {
                while (file.hasNextLine());

                    Person person = new Person();
                    /*String[] tokens = file.split(";");
                    person.setName(tokens[0]);
                    person.setSurname(tokens[1]);
                    person.getAge(tokens[2]);
                    personList.add(person);*/
            }
            catch (IOException exception) {
                System.err.println(exception.getMessage());
            }
            return personList;
    }
}
