package JavaAdvanced.six.Collection;

import Vjezba.PovezivanjeSaBazom.Gender;
import Vjezba.PovezivanjeSaBazom.Person;
import Vjezba.PovezivanjeSaBazom.PersonDao;

import java.util.List;

public class FunkcijaStream {
    public static void main(String[] args) {
        PersonDao personDao = new PersonDao();
        List<Person> personList = personDao.retreiveAll();
        //personList.stream().forEach(person -> System.out.println(person));
        //personList.stream().filter(person -> person.getGender().equals(Gender.FEMALE)).forEach(person -> System.out.println(person));
        //personList.stream().filter(person -> person.getAge()>30).forEach(person -> System.out.println(person));
        //personList.stream().filter(person -> person.getAge() >= 25 && person.getAge() <= 35).forEach(person -> System.out.println(person));
        personList.stream().filter(person -> person.getGender().equals(Gender.MALE)).filter(person -> person.getAge() > 37).forEach(person -> System.out.println(person));

    }
}
