package JavaAdvanced.six.factory;

public enum BeverageEnumFactory {
    ESSPRESSO_FACTORY(new Esspresso()),
    TEA_FACTORY(new Tea()),
    COCA_COLA_FACTORY(new CocaCola()),
    BOSNIANCAFFE_FACTORY(new BosnianCaffe()),
    ESSPRESSO_MLIJEKO_FACTORY(new MilkDecorator(new Esspresso())),
    TEA_MILK_FACTORY(new MilkDecorator(new Tea())),
    BosnianCaffe_with_milk(new MilkDecorator(new BosnianCaffe()));


    private Beverage beverage;

    BeverageEnumFactory(Beverage beverage){
        this.beverage=beverage;
    }
    public Beverage getBeverage(){
        return beverage;
    }
}
