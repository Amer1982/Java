package JavaCore.Predavanje4.inheritance;

public class Student extends Person{
    public String indexNum;

    public Student(String studentIme, String studentPrezime, String indexNum) {
        super(studentIme, studentPrezime);
        this.indexNum=indexNum;
    }
        public void show(){
        super.show();//Pozivamo izlaz iz klase Person
            System.out.println("Ime i prezime osobe 'Student' je "+firstName+" "+lastName+" i broj indexa je "+indexNum);

    }
}
