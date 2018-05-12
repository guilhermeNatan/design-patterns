package strategy;

public class Quack implements QuackBahavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
