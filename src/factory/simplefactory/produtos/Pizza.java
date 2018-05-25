package factory.simplefactory.produtos;

/**
 * Produto produzido pela SimplePizzaFactory
 */
public abstract class Pizza {
    public void preparar() {

        System.out.println("Preparando");
    }

    public void assar() {
        System.out.println("Assando");
    }

    public void cortar() {
        System.out.println("Cortando");
    }

    public void encaixotar() {
        System.out.println("Encaixando");
    }
}
