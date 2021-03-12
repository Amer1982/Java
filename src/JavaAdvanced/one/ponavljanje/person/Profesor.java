package JavaAdvanced.one.ponavljanje.person;

public class Profesor extends Person{

    private double plata;

    public Profesor(){
        System.out.println("Dolazi profesor...");

    }
    public double getPlata(){
        return plata;
    }
    public void setPlata(double plata){
        this.plata=plata;
    }

}
