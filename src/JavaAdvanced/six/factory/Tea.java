package JavaAdvanced.six.factory;

class Tea extends Beverage{
    public Tea() {
        super("Čaj");
    }

    @Override
    public double cost() {
        return 2;
    }
}
