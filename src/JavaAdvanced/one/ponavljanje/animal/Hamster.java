package JavaAdvanced.one.ponavljanje.animal;

public class Hamster extends Animal{
    public Hamster(int id, String name) {
        super(id, name);
        System.out.println("Stvara se hrcak...");
    }

    @Override
    public void playSound() {
        System.out.println("koji god hrcak pravi zvuk...");

    }
}
