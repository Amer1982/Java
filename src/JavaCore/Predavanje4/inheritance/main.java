package JavaCore.Predavanje4.inheritance;

public class main {
    public static void main(String[] args) {
        Person p = new Person("Amer", "Jahjefendic");
        p.show();
        Student s = new Student("Ajra", "Jahjefendic", "1234/12");
        s.show();
        Profesor prof = new Profesor("Aida","Popovac-Jahjefendic", "JavaProgramiranje");
        prof.show();

        System.out.println("Osoba " + p.firstName+ " " + p.lastName+" je otac od " + s.firstName + " "+s.lastName+" koja je student, broj indexa "+ s.indexNum);
    }
}
