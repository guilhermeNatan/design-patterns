package strategy;

/**
 * Classe de teste para o
 */
public class MiniDuckSimulator {
    public static void main(String ...args)
    {
        Duck mallard = new MallardDuck();

        mallard.performFly();
        mallard.performQuack();

        Duck patoFoguete = new PatoFoguete();
        patoFoguete.performFly();
    }
}
