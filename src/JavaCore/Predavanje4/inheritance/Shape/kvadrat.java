package JavaCore.Predavanje4.inheritance.Shape;

public class kvadrat extends Shape {
    public double a;

    public kvadrat(int x, int y, String boja, String naziv, double a) {
        super(x, y, boja, naziv);
        this.a = a;
    }

    public void dajPovrsinu() {
        super.dajPovrsinu();
        System.out.println(" kvadrat p = " + (a * a));
    }
}
