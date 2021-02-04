package JavaCore.Predavanje4.inheritance;

public class Person {
    public String firstName;
    public String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void show() {
        System.out.println("Ime i prezime osobe 'Person' je: " + firstName + " " + lastName);
    }
}
