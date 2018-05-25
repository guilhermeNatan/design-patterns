package factory.simplefactory;

import factory.simplefactory.produtos.Pizza;

/**
 * Classe cliente da fabrica, esta classe apenas usas as instancias criadas pela  SimplePizzaFactory
 */
public class PizzaStore {

    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    /**
     * @param tipo
     * @return  um produto produzido pela fábrica no caso o pruduto é a Pizza
     */
    public Pizza pedirPizza(TipoPizza tipo){

        Pizza pizza  = factory.criarPizza(tipo);
        pizza.preparar();
        pizza.assar();
        pizza.cortar();
        pizza.encaixotar();

        return pizza;
    }

}
