package JavaAdvanced.one.ponavljanje.animal;

public class Dog extends Animal{

    public Dog(int id, String name) {
        super(id, name);
        System.out.println("Stvara se pas...");
    }

    @Override
    public void playSound() {
        System.out.println("av av av...");

    }
}
