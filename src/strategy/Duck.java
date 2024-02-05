package strategy;

public abstract class Duck {


    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;



    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("Swiming");
    }

    public  abstract void display();
}
