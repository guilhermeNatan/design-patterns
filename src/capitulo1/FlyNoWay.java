package capitulo1;

public class FlyNoWay implements FlyBahavior {
    @Override
    public void fly() {
        System.out.println("Este pato não pode voar");
    }
}
