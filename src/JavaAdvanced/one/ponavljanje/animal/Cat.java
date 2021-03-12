package JavaAdvanced.one.ponavljanje.animal;

public class Cat extends Animal{


    public Cat(int id, String name) {
        super(id, name);
        System.out.println("Stvara se macka...");
    }

    @Override
    public void playSound() {
        System.out.println("Mjau mjau mjau...");

    }
}
