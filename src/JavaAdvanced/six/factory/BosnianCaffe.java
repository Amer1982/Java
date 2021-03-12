package JavaAdvanced.six.factory;

class BosnianCaffe extends Beverage{
    public BosnianCaffe() {
        super("Bosanska kahva");
    }

    @Override
    public double cost() {
        return 2;
    }
}
