package JavaAdvanced.three.collection.Person;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class main {
    public static void main(String[] args) {

        /**
         * <li>1. Predicate<T> -> TESTER</li>
         */
                PersonDAO  personDao = new PersonDAO();
                List<Person> listaPersona = personDao.retrieveAll();
                //LAMBDA operator -> new kada kreiramo objekte tipa funkcionalnog interfejsa
                Predicate<Person> tester = p->p.getAge()>23;
                printTestedPersons(listaPersona, p->true);
                printTestedPersons(listaPersona, p->p.getAge()>=23);
                printTestedPersons(listaPersona, p->p.getAge()<23);
                printTestedPersons(listaPersona, p->p.getSurname().equals("Hadžić"));

            }

            static void printTestedPersons(Collection<Person> collectionOfPersons, Predicate<Person> tester){
                for(Person person: collectionOfPersons){
                    if(tester.test(person)){
                        System.out.println(person);
                    }
                }
            }
/*
    static void printPersons(Collection<Person> collectionOfPersons){
        for(Person person : collectionOfPersons){
            System.out.println(person);
        }
    }
    static void printOlderThan(Collection<Person> collectionOfPersons, int age){
        for(Person person : collectionOfPersons){
            if(person.getAge()>=age){
                System.out.println(person);
            }
        }
    }
    static void printYoungerThan(Collection<Person> collectionOfPersons, int age){
        for(Person person : collectionOfPersons){
            if(person.getAge()<age){
                System.out.println(person);
            }
        }
    }*/

        }