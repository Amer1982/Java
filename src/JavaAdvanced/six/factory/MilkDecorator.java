package JavaAdvanced.six.factory;

class MilkDecorator extends Beverage{
    private Beverage beverage;
    public MilkDecorator(Beverage esspresso) {
        super(esspresso.getName()+" s mlijekom");
        this.beverage =esspresso;
    }

    @Override
    public double cost() {
        return beverage.cost()+0.5;
    }
}
