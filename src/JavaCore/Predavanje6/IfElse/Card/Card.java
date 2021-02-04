package JavaCore.Predavanje6.IfElse.Card;

public class Card {

    double balance;
    public Card(double balance){
        this.balance=balance;
    }
    public void charge (double racun){
        if (racun>balance){
            System.out.println("Nema dovoljno sredstava");
        }else {
            balance-=racun;
            System.out.println("Naplata je izvrsena");
        }
    }
}
