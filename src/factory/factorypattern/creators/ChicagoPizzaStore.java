package factory.factorypattern.creators;

import factory.factorypattern.produtos.AbstractPizza;
import factory.factorypattern.produtos.ChicagoPizzaQueijo;

public class ChicagoPizzaStore extends AbstractPizzaStore {
    @Override
    public AbstractPizza criarPizza(TipoPizza tipoPizza) {
        if (tipoPizza == TipoPizza.QUEIJO) {
            return new ChicagoPizzaQueijo();
        }
        // ... demais tipos
        return null;
    }
}
