package JavaAdvanced.three.zadaca.zadatak5;
/*
 * Data je List<Double> listOfNumbers = Arrays.asList(23.5, 12345.67, 98.7, 43.456, 12.34, 987.56).
 * Izračunati sumu brojeva koje skladišti listOfNumbers i ispisati sumu u konzolu.
 */

import java.util.Arrays;
import java.util.List;

public class Zadatak5 {
    public static void main(String[] args) {

        List<Double> listOfNumbers = Arrays.asList(23.5, 12345.67, 98.7, 43.456, 12.34, 987.56);
        System.out.print("Za brojeve: " + listOfNumbers);

        double sum = 0;
        for (Double i : listOfNumbers) {
            sum += i;
        }
        System.out.println(" suma iznosi " + sum);

    }
}


