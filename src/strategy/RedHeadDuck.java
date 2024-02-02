package strategy;

public class RedHeadDuck extends Duck implements Flyable, Quackable{
    @Override
    public void display() {
        System.out.println("Looks like a red head");
    }

    @Override
    public void fly() {

    }

    @Override
    public void quackable() {

    }
}
