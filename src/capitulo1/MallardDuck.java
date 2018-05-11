package capitulo1;

public class MallardDuck extends Duck {

    public MallardDuck()
    {
        setFlyBahavior(new FlyWithWings());
        setQuackBahavior(new Squeack());
    }
}
