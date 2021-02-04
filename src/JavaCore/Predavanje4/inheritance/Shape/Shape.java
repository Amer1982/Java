package JavaCore.Predavanje4.inheritance.Shape;
/*
Potrebno je napraviti jednu klasu Shape koja bi sadržala neke
podatke o geometrijskom obliku:
o poziciju (x,y)
o boju i naziv.
• Potrebno je napraviti tri klase koje nasljeđuju ovu klasu, jednu za
krug, jednu za kvadrat i jednu za pravougaonik.
• Svaka treba da sadrži metodu za izračunavanje površine, kao i
sopstvene atribute koji su neophodni za ovo izračunavanje (strane
za pravougaonik i kvadrat i poluprečnik za krug).
• Krug, takođe, treba da posjeduje i konstantu PI.
 */
public class Shape {

    public int x;
    public int y;
    public String boja;
    public String naziv;

    public Shape(int x, int y, String boja, String naziv) {
        this.x = x;
        this.y = y;
        this.boja = boja;
        this.naziv = naziv;
    }
    public void dajPovrsinu() {
        System.out.println("Povrsina za "+naziv+ " na poziciji "+x+" i "+y+", boje "+boja+" iznosi: ");
    }
}
