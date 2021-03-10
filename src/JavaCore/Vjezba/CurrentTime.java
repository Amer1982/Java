package JavaCore.Vjezba;

import java.util.Date;

/*
Write a Java program to display the system time.
 */
public class CurrentTime {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Current date and time is:"+date);

        System.out.format("Trenutno vrijeme je: %tc%n", System.currentTimeMillis());

    }
}
