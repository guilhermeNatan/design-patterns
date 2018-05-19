package decorator.decoradores;

import decorator.Bevarage;
import decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
    Bevarage bebida;

    public Whip(Bevarage bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Whip";
    }

    @Override
    public double cost() {
        return bebida.cost() + 0.50;
    }
}
