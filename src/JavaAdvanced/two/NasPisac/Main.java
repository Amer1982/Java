package JavaAdvanced.two.NasPisac;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (NasPisac nasPisac = new NasPisac()) {
            System.out.println("Prazan blok koda");
        } catch (IOException exp) {
            System.err.println(exp.getMessage());
        }
    }
}

