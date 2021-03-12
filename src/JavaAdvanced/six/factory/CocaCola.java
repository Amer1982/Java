package JavaAdvanced.six.factory;

class CocaCola extends Beverage{
    public CocaCola() {
        super("Coca Cola");
    }

    @Override
    public double cost() {
        return 3;
    }
}
