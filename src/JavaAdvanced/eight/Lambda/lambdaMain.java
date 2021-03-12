package JavaAdvanced.eight.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class lambdaMain {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Consumer<Integer> numberConsumer = t -> System.out.println(t);
        //kada Lambda ne radi nista drugo nego poziva funkciju moze se koristiti i MetodReferencing
        listOfNumbers.forEach(lambdaMain::consumeNumber);

        //listOfNumbers.stream().forEach(it -> lambdaMain.consumeNumber(it));

        /* Stara for petlja
        for (Integer number : listOfNumbers) {
            lambdaMain.consumeNumber(number);*/
        }


        //lambdaMain.consumeNumbers(23, 34, 54, 67, 54, 29);

    static void consumeNumbers(int... numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    static void consumeNumber(int number) {
        System.out.println(number);
    }
}
