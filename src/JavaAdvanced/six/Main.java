package JavaAdvanced.six;

import JavaAdvanced.six.factory.*;

public class Main {
    public static void main(String[] args) {
        Beverage essperesso = BeverageEnumFactory.ESSPRESSO_FACTORY.getBeverage();
        degustirajBeverage(essperesso);
        Beverage caj = BeverageEnumFactory.TEA_FACTORY.getBeverage();
        degustirajBeverage(caj);
        Beverage essml = BeverageEnumFactory.ESSPRESSO_MLIJEKO_FACTORY.getBeverage();
        degustirajBeverage(essml);
        Beverage csm = BeverageEnumFactory.TEA_MILK_FACTORY.getBeverage();
        degustirajBeverage(csm);
        Beverage BKSM = BeverageEnumFactory.BosnianCaffe_with_milk.getBeverage();
        degustirajBeverage(BKSM);



        /*Pozivanje uz pomoc klase BeverageFactory

        Beverage esspresso = BeverageFactory.getBeverage("Esspresso");
        degustirajBeverage(esspresso);
        Beverage caj = BeverageFactory.getBeverage("Čaj");
        degustirajBeverage(caj);*/

        /*Ovo je prvi nacin sa nasljedivanjem kada su klase public

        Esspresso esspresso = new Esspresso();
        degustirajBeverage(esspresso);
        Beverage aidinoPice = new MilkDecorator(esspresso);
        degustirajBeverage(aidinoPice);
        Tea caj = new Tea();
        Beverage amilinoPice = new MilkDecorator(caj);
        degustirajBeverage(amilinoPice);
        CocaCola cocaCola = new CocaCola();
        degustirajBeverage(cocaCola);
        Beverage amerovoPice = new MilkDecorator(cocaCola);
        degustirajBeverage(amerovoPice);*/


    }

    static void degustirajBeverage(Beverage beverage) {
        System.out.println("Pijem " + beverage.getName() + " i to nas kosta " + beverage.cost());
    }
}

