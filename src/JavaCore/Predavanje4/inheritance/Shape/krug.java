package JavaCore.Predavanje4.inheritance.Shape;

public class krug extends Shape {
    public int r;
    final static double PI = 3.14;

    public krug(int x, int y, String boja, String naziv, int r) {
        super(x, y, boja, naziv);
        this.r = r;
    }

    public void dajPovrsinu() {
        super.dajPovrsinu();
        System.out.println(" krug p = " + (r*r*PI));
    }
}

