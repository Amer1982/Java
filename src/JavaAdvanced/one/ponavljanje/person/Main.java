package JavaAdvanced.one.ponavljanje.person;

import JavaAdvanced.one.ponavljanje.animal.Cat;
import JavaAdvanced.one.ponavljanje.animal.Dog;
import JavaAdvanced.one.ponavljanje.animal.Hamster;

public class Main {
    public static void main(String[] args) {
        int number=23;
        number=13;

        int[]numbers = new int[5];
        numbers[0]= 23;
        numbers[1]= 13;

        Person Dino = new Person();
        Cat dininaMacka = new Cat(23,"Tom");
        Dino.setAnimal(dininaMacka);
        Dino.setAge(26);
        int dinineGodine= Dino.getAge();
        System.out.println(dinineGodine);

        Dino.setName("Dino");
        Dino.setSurname("Deletic");
        printPerson(Dino);

        Person p2 = new Person();
        p2.setName("Amer");
        p2.setSurname("Jahjefendic");
        p2.setAge(38);
        printPerson(p2);

        Student s1 = new Student();
        s1.setName("Mitar");
        s1.setSurname("Mitric");
        s1.setBrojIndexa(1234);
        Dog dog = new Dog(12,"Garo");
        s1.setAnimal(dog);
        printPerson(s1);

        Profesor profesor = new Profesor();
        Cat cat2 = new Cat(1, "Kitty Kat 2");
        profesor.setAnimal(cat2);
        Hamster hamster = new Hamster(321, "Hrčak");
        profesor.setAnimal(hamster);


    }
    static void printPerson(Person person){
        System.out.println(person.getName()+ " "+ person.getSurname());
    }
}
