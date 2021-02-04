package JavaCore.Predavanje3.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Amer";
        person.Surname = "Jahjefendić";
        person.age = 38;
        person.height = 186;
        person.weight = 83;
        System.out.println(person.name+" "+ person.Surname+" je jedna jako dobra osoba. On ima "+ person.age+
                " godina, visok je "+ person.height+" cm, i tezak "+ person.weight+" kg.");
    }
}
