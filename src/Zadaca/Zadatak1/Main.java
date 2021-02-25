package Zadaca.Zadatak1;

import java.util.List;

/**
 * Kreirati jednostavan program koji će omogućavati korisniku da
 * unosi podatke u hiscores listu pomoću konzole
 * • Prilikom svakog unosa, prikazuje se lista svih igrača i njihovih
 * poena
 */

public class Main {

    public static void main(String[] args) {
        PlayerDAO playerDAO = new PlayerDAO();
        playerDAO.insert(new PLayer("Aida",25));
        List<PLayer> pLayerList = playerDAO.retreiveAll();
        printTable(pLayerList);

    }
    static void printTable(List<PLayer> pLayerList) {
        for (PLayer pLayer:pLayerList) {
            System.out.println(pLayer);

        }
    }
}


