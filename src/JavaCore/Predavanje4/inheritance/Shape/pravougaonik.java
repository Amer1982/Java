package JavaCore.Predavanje4.inheritance.Shape;

public class pravougaonik extends Shape{
    public double a,b;

    public pravougaonik(int x, int y, String boja, String naziv, double a, double b) {
        super(x, y, boja, naziv);
        this.a=a;
        this.b=b;
    }
    public void dajPovrsinu(){
        super.dajPovrsinu();
        System.out.println(" pravougaonik p = "+(a*b));
    }
}
