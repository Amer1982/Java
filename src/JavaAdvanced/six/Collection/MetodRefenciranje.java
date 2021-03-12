package JavaAdvanced.six.Collection;

import Vjezba.PovezivanjeSaBazom.Gender;
import Vjezba.PovezivanjeSaBazom.Person;
import Vjezba.PovezivanjeSaBazom.PersonDao;

import java.util.List;

public class MetodRefenciranje {
    public static void main(String[] args) {
        PersonDao personDao = new PersonDao();
        List<Person> personList = personDao.retreiveAll();
       /* personList.stream().
                filter(person -> person.getGender().equals(Gender.MALE)).
                map(person -> person.getSurname()).
                forEach(person-> System.out.println(person));*/

        //Kada funkcija samo poziva neku drugu metodu onda mozemo koristiti Metod Referencing.
        // Poziva se ImeKlase::Funkcija
        personList.stream().
                filter(person -> person.getGender().equals(Gender.MALE)).
                map(Person::getSurname).
                forEach(System.out::println);
    }
}
