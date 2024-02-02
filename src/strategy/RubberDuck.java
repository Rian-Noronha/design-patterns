package strategy;

public class RubberDuck extends Duck{
    @Override
    public void display() {
        System.out.println("Rubber duck");
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
    }


}
