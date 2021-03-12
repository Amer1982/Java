package JavaAdvanced.three.zadaca.Zadatak2;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private String surname;
    private LocalDate birthday;

    public Person(String name, String surname, LocalDate birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge(String token) {
       LocalDate now = LocalDate.now();
       Period period=birthday.until(now);
       int years = period.getYears();
        return years;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ime='" + name + ' ' +
                ", prezime='" + surname + ' ' +
                ", datum rođenja=" + birthday +
                '}';
    }
}
