package factory.factorypattern.creators;

import factory.factorypattern.produtos.AbstractPizza;
import factory.factorypattern.produtos.NYPizzaQueijo;

public class NYPizzaStore extends AbstractPizzaStore {
    @Override
    public AbstractPizza criarPizza(TipoPizza tipoPizza) {

        if (tipoPizza == TipoPizza.QUEIJO) {
            return new NYPizzaQueijo();
        }
        // ... demais tipos
        return null;

    }
}
