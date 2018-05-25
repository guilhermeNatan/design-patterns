package factory.simplefactory;

public class TesteSimpleFactory {

    public static void main(String ...args)
    {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);
        pizzaStore.pedirPizza(TipoPizza.CANEDESOL);
        pizzaStore.pedirPizza(TipoPizza.PEPERONI);
    }
}
