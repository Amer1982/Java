package JavaAdvanced.one.generics;

import JavaAdvanced.one.ponavljanje.person.Person;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Box<String> dininaKutija = new Box<String>("Omiljeni string");
        dininaKutija.setPolje("Drugi ");
        Box<Integer> amilinaKutija = new Box<>(23);
        amilinaKutija.setPolje(123);
        Box<Double> amerovaKutija = new Box<>(23.5);
        //names -> objektni tip ali parametrizirani složeni tip
        ArrayList<String> names = new ArrayList<>();
        names.add("Dino");
        names.add("Armin");
        names.add("Amila");

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person());
    }
}
