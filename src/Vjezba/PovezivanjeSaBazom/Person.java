package Vjezba.PovezivanjeSaBazom;

import java.time.LocalDate;
import java.time.Period;

public class Person implements Comparable<Person> {


    private int id;
    private String name;
    private String surname;
    private LocalDate birthday;
    private Gender gender;

    public Person(){


    }

    public Person(String name, String surname, LocalDate birthday) {

        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }


    public int getId() {
        return id;
    }

    public Person setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge(){
        LocalDate now=LocalDate.now();
        Period period = birthday.until(now);
        int years=period.getYears();
        return years;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                ", gender=" + gender +
                ", age=" + getAge()+
                '}';
    }

    @Override
    public int compareTo(Person person) {
        return 0;
    }
}
