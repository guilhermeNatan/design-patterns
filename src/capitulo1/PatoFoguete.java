package capitulo1;

public class PatoFoguete extends Duck {

    public PatoFoguete() {
        setFlyBahavior(new FlyRocketPowered());
    }

}
