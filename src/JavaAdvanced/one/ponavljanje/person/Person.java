package JavaAdvanced.one.ponavljanje.person;

import JavaAdvanced.one.ponavljanje.animal.Animal;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private String surname;
    private int age;
    private Animal animal;

    public Person(){

    }
    public void setAge(int godine){
        if (godine >=0){
            age = godine;
        }
    }
    public int getAge(){
        return age;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()){
            this.name= name;
        }
    }
    public String getName(){
        return name;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    public String getSurname(){
        return surname;
    }
    public void setAnimal(Animal animal){
        this.animal=animal;
    }
    public Animal getAnimal(){
        return animal;
    }
}

