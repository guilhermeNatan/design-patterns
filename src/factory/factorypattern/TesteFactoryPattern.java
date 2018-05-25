package factory.factorypattern;

import factory.factorypattern.creators.AbstractPizzaStore;
import factory.factorypattern.creators.ChicagoPizzaStore;
import factory.factorypattern.creators.NYPizzaStore;
import factory.factorypattern.creators.TipoPizza;

public class TesteFactoryPattern {

    public static void main(String ...args)
    {

        AbstractPizzaStore absStore = new NYPizzaStore();

        absStore.pedirPizza(TipoPizza.QUEIJO);

        absStore = new ChicagoPizzaStore();

        absStore.pedirPizza(TipoPizza.QUEIJO);

    }
}
