package Vjezba.PovezivanjeSaBazom;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        PersonDao personDao = new PersonDao();
        //personDao.retreiveAll();
        List<Person> personList = personDao.retreiveAll();
        printPersons(personList);

    }

    static void printPersons(List<Person> personList) {
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}
