package JavaCore.Predavanje4.inheritance;

public class Profesor extends Person {
    public String classRoom;

    public Profesor(String firstName, String lastName, String classRoom) {
        super(firstName, lastName);
        this.classRoom = classRoom;
    }

    public void show() {
        System.out.println("Profesor " + firstName + " " + lastName + " na predmetu " + classRoom);
    }
}
