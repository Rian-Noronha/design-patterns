package strategy;

public abstract class Duck {

    public void fly(){
        System.out.println("Flying...");
    }

    public void quack(){
        System.out.println("Quack, quack...");
    }

    public void swim(){
        System.out.println("Swiming");
    }

    public abstract void display();
}
