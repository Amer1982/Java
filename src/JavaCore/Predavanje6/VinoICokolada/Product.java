package JavaCore.Predavanje6.VinoICokolada;
/*
Zamislite da je potrebno da modelujete informacioni sistem jedne trgovine. Potrebno je
da napravite klasu Product koja će predstavljati osnovu za dalje nasljeđivanje i neće se
moći instancirati. Ovu klasu nasljeđuju dvije klase koje predstavljaju konkretne grupe
proizvoda: Chocolate i Wine. Ova hijerarhija prikazana grafikom izgleda ovako:
Svaki proizvod posjeduje određene osobine:
naziv proizvoda, bar-kod, osnovnu cijenu,
porez.
Takođe, svaki proizvod posjeduje i metodu za računanje cijene, koja se izračunava kada se osnovna cijena i uveća
za iznos poreza. Porez (PDV) za svaki proizvod je 20% i ovo je podatak koji je konstantan i neće se mijenjati.
Ipak, proizvodi iz grupe vina, imaju i dodatni porez, pošto spadaju u grupu alkoholnih pića i on iznosi 10% od cijene već
uvećane za iznos PDV-a. I ovo je podatak koji je konstantan i neće se mijenjati.
Zbog ovoga je potrebno redefinisati metodu za računanje cijene u okviru klase Wine.
Pored ovoga, klasa Wine treba da posjeduje atribut koji definiše zapreminu boce, a klasa Chocolate atribut koji definiše
težinu.
U klasama Chocolate i Wine, potrebno je napraviti parametrizovane konstruktore za kreiranje objekata.
Potrebno je, takođe, u klasama redefinisati metodu to String za prikaz informacija o objektu.
 */

public abstract class Product {
    String naziv_proizvoda;
    double osnovna_cijena;
    final double porez = 1.20;
    int bar_kod;

    public Product (String naziv_proizvoda, int bar_kod, double osnovna_cijena){
        this.naziv_proizvoda= naziv_proizvoda;
        this.bar_kod=bar_kod;
        this.osnovna_cijena=osnovna_cijena;
    }
    public double dajCijenu (){
        return osnovna_cijena*=porez;
    }
}
