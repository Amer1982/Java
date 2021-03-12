package JavaAdvanced.six.Collection;

import Vjezba.PovezivanjeSaBazom.Person;
import Vjezba.PovezivanjeSaBazom.PersonDao;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class FunkcijaPredicate {
    public static void main(String[] args) {

        PersonDao personDao = new PersonDao();
        List<Person> personList = personDao.retreiveAll();
        //printPersonCollection(personList, p -> true);
        //printPersonCollection(personList, p->p.getGender().equals(Gender.FEMALE));
        //printPersonCollection(personList, person -> person.getAge() > 30);
        //printPersonCollection(personList, person -> person.getAge() >= 25 && person.getAge() <= 35);


    }

    static void printPersonCollection(Collection<Person> personCollection, Predicate<Person> personPredicate) {
        for (Person person : personCollection) {
            if (personPredicate.test(person)) {
                System.out.println(person);
            }
        }
    }
}
