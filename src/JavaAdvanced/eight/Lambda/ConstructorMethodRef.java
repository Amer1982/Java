package JavaAdvanced.eight.Lambda;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.function.Supplier;

public class ConstructorMethodRef {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = Arrays.asList(23, 32, 44, 55, 43);
        //Supplier -> Supplier<Integer>  Integer ..get
        //Supplier<Person>  Person...get
        //Supplier<Collection<Integer>>     Collection<Integer> ... get
        copyElements(listOfNumbers, () -> new HashSet<Integer>());
        copyElements(listOfNumbers, HashSet::new);
    }

    static void copyElements(List<Integer> listaBrojeva, Supplier<Collection<Integer>> collectionSupplier) {
        Collection<Integer> odredisnaKolekcija = collectionSupplier.get();
        for (Integer number : listaBrojeva) {
            odredisnaKolekcija.add(number);
        }
    }
}