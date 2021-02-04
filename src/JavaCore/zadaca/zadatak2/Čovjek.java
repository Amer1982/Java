package JavaCore.zadaca.zadatak2;

import java.util.ArrayList;

/**
 * Koristeći ArrayList razvrstati niz ljudi na žene I muškarce.
 * Potrebno kreirati apstraktnu klasu Covjek I klase Muskarac I Zena koje nasljedjuju klasu Covjek,
 * zatim kreirati niz od 5 ljudi, te proizvoljno kreirati I dodati muskarce I zene u niz.
 * Nakon toga proci kroz niz, provjeriti svaki element da li je muskarac ili zena, te
 * smjestiti u dvije nove ArrayList (pronadjite na google-u kako upotrijebiti instanceof,
 * te to iskoristite da nadjete razliku izmedju muskarca I zene).
 */
public class Čovjek {
    public static void main(String[] args) {

        ArrayList<String> covjek = new ArrayList<String>();
        covjek.add("Amer");
        covjek.add("Aida");
        covjek.add("Amila");
        covjek.add("Dino");
        covjek.add("Edin");


    }


}
