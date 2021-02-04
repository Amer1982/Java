package JavaCore.Predavanje4.inheritance.test2;

public class Person {
    public int godine;
    public double visina;
    public double tezina;
    public String ime;
    public String prezime;
    public String boja_kose;

    public Person(String ime, String prezime, int godine,
                  double visina, double tezina, String boja_kose) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine=godine;
        this.visina=visina;
        this.tezina=tezina;
        this.boja_kose=boja_kose;
    }public void show (){
        System.out.println("Ja sam "+ime+" "+prezime+". Imam "+godine+" godina, visok sam "+visina+" cm i " +
                "tezak "+tezina+" kg. Boja kose mi je "+boja_kose);
    }

}
