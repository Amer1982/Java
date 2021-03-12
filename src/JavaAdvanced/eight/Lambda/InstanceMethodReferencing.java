package JavaAdvanced.eight.Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InstanceMethodReferencing {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = Arrays.asList(23, 43, 45, 65, 678, 98, 81);
        listOfNumbers.forEach(System.out::println);
        MojKomparator mojKomparator = new MojKomparator();
        Comparator<Integer> komparator = (n1, n2)->mojKomparator.compare(n1, n2);
        //Pošto Lambda samo poziva drugu funkciju može se pozvati i pomocu Metod referenciranja
        Comparator<Integer> komparator2 = mojKomparator::compare;

        Collections.sort(listOfNumbers, mojKomparator::compare);
        System.out.println("Poslije sortiranja");
        listOfNumbers.forEach(System.out::println);
    }

    static class MojKomparator {
        public int compare(Integer number1, Integer number2) {
            return number1.compareTo(number2);
        }
    }

}
