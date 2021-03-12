package JavaAdvanced.six.factory;

class Esspresso extends Beverage{
    public Esspresso() {
        super("Esspresso");
    }

    @Override
    public double cost() {
        return 1.5;
    }
}
