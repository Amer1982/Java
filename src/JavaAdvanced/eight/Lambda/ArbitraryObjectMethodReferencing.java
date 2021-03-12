package JavaAdvanced.eight.Lambda;

import java.util.Arrays;
import java.util.List;

public class ArbitraryObjectMethodReferencing {
    public static void main(String[] args) {

        List<String> listOfNames = Arrays.asList("Mitar", "Amer", "Edin", "Amila", "Aida");
        Person person = new Person("Amer");
        ArbitraryObjectMethodReferencing arb = new ArbitraryObjectMethodReferencing();
        arb.pritn();

        List<Person> listOfPersons = Arrays.asList(
                new Person("Mitar"),
                new Person("Amer"),
                new Person("Edin"),
                new Person("Aida"),
                new Person("Amila")
        );
        listOfPersons.forEach(p->p.printName());
        listOfPersons.forEach(Person::printName);
    }
    private void pritn(){

    }
    static class Person{
        private String name;
        public Person(String name){
            this.name=name;
        }
        public void printName(){
            System.out.println(name);
        }
    }
}
