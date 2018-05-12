package strategy;

public abstract  class  Duck  {

    /**
     * Usamos interfaces para representar o comportamentos de voo e quack de um pato
     * o fato de usarmos interfaces e termos diferentes classes que implementam essas interfaces
     * nos permite que cada tipo de pato tenha um tipo diferente de comportamento de voo ou  quack
     */
    private FlyBahavior flyBahavior;
    private QuackBahavior quackBahavior;

    public  void performFly()
    {
        flyBahavior.fly();
    }

    public void performQuack()
    {
        quackBahavior.quack();
    }

    public void setFlyBahavior(FlyBahavior flyBahavior) {
        this.flyBahavior = flyBahavior;
    }


    public void setQuackBahavior(QuackBahavior quackBahavior) {
        this.quackBahavior = quackBahavior;
    }


}
