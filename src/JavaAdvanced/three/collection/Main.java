package JavaAdvanced.three.collection;

public class Main {
    public static void main(String[] args) {
//niz
        String [] names = new String[4];
        names [0] = "Mitar";
        names [1] = "Amer";
        names [2] = "Amila";
        names [3] = "Aida";
//enhanced
        for (String name: names) {
            System.out.println(name);
        }
    }
}
