package JavaAdvanced.one.ponavljanje.person;

public class Student extends Person{

    private int brojIndexa;

    public Student(){
        System.out.println("Student upisao fax...");
    }
    public void setBrojIndexa(int brojIndexa){
        this.brojIndexa=brojIndexa;
    }

    public int getBrojIndexa() {
        return brojIndexa;
    }
}
