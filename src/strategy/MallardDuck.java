package strategy;

public class MallardDuck extends Duck {

    public MallardDuck()
    {
        setFlyBahavior(new FlyWithWings());
        setQuackBahavior(new Squeack());
    }
}
