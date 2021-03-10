package Vjezba.PovezivanjeSaBazom2;

import Vjezba.PovezivanjeSaBazom.Person;
import Vjezba.PovezivanjeSaBazom.PersonDao;

public class Main {
    public static void main(String[] args) {

        PersonDao personDao = new PersonDao();
        Person amer = personDao.retreive(5);
        System.out.println(amer);
        String amerovoPrezime = amer.getSurname() + " Popovac";
        amer.setSurname(amerovoPrezime);
        PersonDao.update(amer);
        System.out.println(amer);

        Person amila = personDao.retreive(1);
        System.out.println(amila);
        String amilinoPrezime = "Hasovic-Hasic";
        amila.setSurname(amilinoPrezime);
        PersonDao.update(amila);
        System.out.println(amila);
    }
}
