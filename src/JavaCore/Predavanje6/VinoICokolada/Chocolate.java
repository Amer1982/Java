package JavaCore.Predavanje6.VinoICokolada;

public class Chocolate extends Product {
double težina;

    public Chocolate(String naziv_proizvoda, int bar_kod, double osnovna_cijena,double težina) {
        super(naziv_proizvoda, bar_kod, osnovna_cijena);
        this.težina=težina;
    }
    public double dajCijenu(){
        return super.dajCijenu();
    }
    public String toString(){
return ("Čokolada imena " + this.naziv_proizvoda + ", bar koda " + this.bar_kod + ", osnovne cijene "
        + this.osnovna_cijena + " i težine " + this.težina + " ima konacnu cijenu " + this.dajCijenu());
    }
}
