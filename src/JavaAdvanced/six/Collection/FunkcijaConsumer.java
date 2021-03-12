package JavaAdvanced.six.Collection;

import Vjezba.PovezivanjeSaBazom.Person;
import Vjezba.PovezivanjeSaBazom.PersonDao;

import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunkcijaConsumer {
    public static void main(String[] args) {
        PersonDao personDao = new PersonDao();
        List<Person> personList = personDao.retreiveAll();
        //printPerson(personList); //-stara funkcija
        //printPersonCollection(personList, p -> true); //-LAMBDA(Predicate)
        //processPersonCollection(personList,person -> true,person -> System.out.println(person)); //-LAMBDA(Consumer)


        //printPersonWithGender(personList, Gender.FEMALE);
        //printPersonCollection(personList, p->p.getGender().equals(Gender.FEMALE));
        //processPersonCollection(personList, person -> person.getGender().equals(Gender.FEMALE), person -> System.out.println(person));


        //printPersonOlderThan(personList, 30)
        //printPersonCollection(personList,person -> person.getAge()>30);
        //processPersonCollection(personList,person -> person.getAge()>30,person -> System.out.println(person));


        //printPersonWithin(personList,35,25);
        //printPersonCollection(personList, person -> person.getAge() <= 35 && person.getAge() >= 25);
        processPersonCollection(personList,person -> person.getAge()>=25 && person.getAge()<=35,person -> System.out.println(person));


        //Predicate<Person> personPredicate = person -> true;


    }

    static void processPersonCollection(Collection<Person> persons, Predicate<Person> tester, Consumer<Person> consumer) {
        for (Person person : persons) {
            if (tester.test(person)) {
                consumer.accept(person);
            }
        }
    }
}

