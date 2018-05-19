package decorator.objetosconcretos;

import decorator.Bevarage;

public class HouseBlend extends Bevarage {
    public HouseBlend() {
        descricao = "House Blend  Coffe";
    }

    @Override
    public double cost() {
        return 1.3;
    }
}
