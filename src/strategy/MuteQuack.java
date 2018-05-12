package strategy;

public class MuteQuack implements QuackBahavior {
    @Override
    public void quack() {
        System.out.println("Mute quack");
    }
}
