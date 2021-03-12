package JavaAdvanced.two.NasPisac;

import java.io.Closeable;
import java.io.IOException;

public class NasPisac implements AutoCloseable {

    public NasPisac() throws IOException {
        System.out.println("Kreiramo naseg pisca...");
    }

    @Override
    public void close() throws IOException {
        System.out.println("Poziva se CLOSE metoda od naseg pisca...");
    }
}
