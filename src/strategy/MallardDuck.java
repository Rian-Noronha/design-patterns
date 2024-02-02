package strategy;

public class MallardDuck extends Duck implements Flyable, Quackable{
    @Override
    public void display() {
        System.out.println("Looks like an angry duck");
    }

    @Override
    public void fly() {

    }

    @Override
    public void quackable() {

    }
}


