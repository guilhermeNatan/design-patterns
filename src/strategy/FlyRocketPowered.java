package strategy;

public class FlyRocketPowered implements FlyBahavior {
    @Override
    public void fly() {
        System.out.println("Voando como um foguete");
    }
}
