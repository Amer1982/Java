package JavaCore.Predavanje6.VinoICokolada;

public class Wine extends Product {
    double zapremina;
    final static double porezWine = 1.10;

    public Wine(String naziv_proizvoda, int bar_kod, double osnovna_cijena, double zapremina) {
        super(naziv_proizvoda, bar_kod, osnovna_cijena);
        this.zapremina = zapremina;
    }

    public double dajCijenu() {
        double cijena_prije_poreza = super.dajCijenu();
        double cijena_poslije_dodatnog_poreza = cijena_prije_poreza + porezWine;
        return cijena_poslije_dodatnog_poreza;
    }

    public String toString() {
        return ("Vino imena " + this.naziv_proizvoda + ", bar koda " + this.bar_kod + ", osnovne cijene "
                + this.osnovna_cijena + " i težine " + this.zapremina + " ima konacnu cijenu " + this.dajCijenu());
    }
}
