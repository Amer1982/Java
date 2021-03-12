package JavaAdvanced.three.zadaca.zadatak1;

import JavaAdvanced.three.zadaca.Zadatak2.Person;

import java.io.FileNotFoundException;
import java.time.LocalDate;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        LocalDate birthday = LocalDate.of(1995,1,5);
        Person person = new Person("Dino","Deletic",birthday);
        System.out.println(person);
    }
}
