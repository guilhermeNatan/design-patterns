package factory.simplefactory.produtos;

/**
 * Tipo concreto de produto produzido SimplePizzaFactory
 */
public class PizzaCarneSol extends Pizza {
    @Override
    public void preparar() {
        System.out.println("Preparando PizzaCarneSol ");
    }
}
