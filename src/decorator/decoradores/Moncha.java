package decorator.decoradores;

import decorator.Bevarage;
import decorator.CondimentDecorator;

public class Moncha extends CondimentDecorator {
    Bevarage bebida;

    public Moncha(Bevarage bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Moncha";
    }

    @Override
    public double cost() {
        return bebida.cost() + 0.3;
    }
}
