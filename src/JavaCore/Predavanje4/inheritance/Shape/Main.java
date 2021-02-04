package JavaCore.Predavanje4.inheritance.Shape;

public class Main {
    public static void main(String[] args) {
        pravougaonik P = new pravougaonik(1,2,"crvena","pravougaonik",4.5,5.2);
        P.dajPovrsinu();
        krug K = new krug(2,3,"plava","krug",5);
        K.dajPovrsinu();
        kvadrat KV = new kvadrat(3,4,"zuta","kvadrat",4);
        KV.dajPovrsinu();
    }
}
