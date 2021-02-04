package JavaCore.Predavanje2;

public class FormatiranjeIzlaza {
    public static void main(String[] args) {
        double a = (113.0/112.0);
        System.out.println("Rezultat je "+a);
        System.out.format("Rezultat je %.2f%n ",a);
    }
}
