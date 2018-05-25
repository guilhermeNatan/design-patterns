package factory.factorypattern.creators;

import factory.factorypattern.produtos.AbstractPizza;

public abstract class AbstractPizzaStore {

    public abstract AbstractPizza criarPizza(TipoPizza tipoPizza);

    public AbstractPizza pedirPizza(TipoPizza tipoPizza) {
        AbstractPizza pizza = criarPizza(tipoPizza);
        pizza.preparar();
        pizza.assar();
        pizza.cortar();
        pizza.encaixotar();

        return pizza;
    }
}
