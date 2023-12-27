package oop.InterfaceTest;

public class Chicken extends Animal implements Cheatable{

    @Override
    public void fly() {
        this.speed *=2;

    }
    Chicken(int speed) {super(speed);}

    @Override
    void run(int hours) {
        this.distance += this.speed*hours;
    }

}
