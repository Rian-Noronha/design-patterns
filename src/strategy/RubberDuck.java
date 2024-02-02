package strategy;

public class RubberDuck extends Duck implements Quackable{
    @Override
    public void display() {
        System.out.println("Rubber duck");
    }

    @Override
    public void quackable() {

    }
}
