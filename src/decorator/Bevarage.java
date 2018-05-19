package decorator;

public abstract class Bevarage  {

    protected String descricao = "Descricao default";

    public String getDescricao() {

        return descricao;
    }

    public abstract double cost();
}
