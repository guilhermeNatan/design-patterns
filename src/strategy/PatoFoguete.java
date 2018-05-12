package strategy;

public class PatoFoguete extends Duck {

    public PatoFoguete() {
        setFlyBahavior(new FlyRocketPowered());
    }

}
