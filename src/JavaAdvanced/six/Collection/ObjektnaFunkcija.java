package JavaAdvanced.six.Collection;

import Vjezba.PovezivanjeSaBazom.Gender;
import Vjezba.PovezivanjeSaBazom.Person;
import Vjezba.PovezivanjeSaBazom.PersonDao;

import java.util.Collection;
import java.util.List;

public class ObjektnaFunkcija {
    public static void main(String[] args) {
        PersonDao personDao = new PersonDao();
        List<Person> personList = personDao.retreiveAll();
        //printPerson(personList);
        //printPersonWithGender(personList, Gender.FEMALE);
        //printPersonOlderThan(personList, 30);
        printPersonWithin(personList,35,25);
    }
    //druga opcija ispisa sa vise metoda

    static void printPerson(Collection<Person> personCollection) {
        for (Person person : personCollection) {
            System.out.println(person + " verzija2");
        }
    }

    static void printPersonWithGender(Collection<Person> personCollection, Gender spol) {
        for (Person person : personCollection) {
            if (person.getGender().equals(spol)) {
                System.out.println(person);
            }
        }
    }

    static void printPersonOlderThan(Collection<Person> personCollection, int age) {
        for (Person person : personCollection) {
            if (person.getAge() > age) {
                System.out.println(person);
            }
        }
    }
    static void printPersonWithin(Collection<Person> personCollection, int high, int low) {
        for (Person person : personCollection) {
            if (person.getAge() <= high && person.getAge() >= low) {
                System.out.println(person);
            }
        }
    }
    /*Jedna varijanta za pozivanje liste iz baze
        Iterator<Person>personIterator=personCollection.iterator();
        while (personIterator.hasNext()){
            Person person=personIterator.next();
            System.out.println(person+" verzija1");
        }*/
}
