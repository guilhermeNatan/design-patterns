package capitulo1;

public class MuteQuack implements QuackBahavior {
    @Override
    public void quack() {
        System.out.println("Mute quack");
    }
}
