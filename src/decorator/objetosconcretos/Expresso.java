package decorator.objetosconcretos;

import decorator.Bevarage;

public class Expresso extends Bevarage {

    public Expresso() {
        descricao = "Espresso";
    }

    @Override
    public double cost() {
        return .98;
    }
}
