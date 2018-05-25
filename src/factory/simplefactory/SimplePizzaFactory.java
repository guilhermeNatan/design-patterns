package factory.simplefactory;

import factory.simplefactory.produtos.Pizza;
import factory.simplefactory.produtos.PizzaCarneSol;
import factory.simplefactory.produtos.PizzaPeperoni;
import factory.simplefactory.produtos.PizzaQueijo;

/**
 * Esta classe desacopla o código de criação do cliente, no caso a PizzaStore .
 */
public class SimplePizzaFactory {

    /**
     *  Factory method, responsável pela criação de pizzas ,
     * @param tipo
     * @return um produto produzido pela fábrica no caso o pruduto é a Pizza
     */
    public Pizza criarPizza(TipoPizza tipo) {
        if (tipo == TipoPizza.PEPERONI) {
            return new PizzaPeperoni();
        } else if (tipo == TipoPizza.CANEDESOL) {
            return new PizzaCarneSol();
        }
        return new PizzaQueijo();

    }
}
