package JavaCore.Predavanje2;

public class PovrsinaPravougaonika {
    final static String measure = "cm";
    public static void main(String[] args) {
      int a = 2, b = 3;
      int res = a*b;
      String message = "Povrsina pravougaonika stranica "+ a + measure+ " i "+ b + measure + " je "+ res + measure;
        System.out.println(message);

    }
}
