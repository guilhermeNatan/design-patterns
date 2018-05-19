package decorator;

// pai dos decoradores
public abstract class CondimentDecorator extends Bevarage {

    // obriga todos os decoradores implementarem o metodo getdescrição
    public abstract String getDescricao();
}
