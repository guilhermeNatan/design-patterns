package factory.factorypattern.produtos;

/**
 * Produto produzido pela SimplePizzaFactory
 */
public abstract class AbstractPizza {
    String nome;
    String massa;
    String saussa ;

    public void preparar() {


        System.out.println("Preparando uma pizza na PizzaStore");
        System.out.println("nome: " + nome);
        System.out.println("massa: " + massa);
        System.out.println("saussa:" + saussa);
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
