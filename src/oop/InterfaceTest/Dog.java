package oop.InterfaceTest;

public class Dog extends Animal{
    public Dog(int speed) {
        super(speed);
    }

    @Override
    public void run(int hours) {
        distance += hours * speed * (0.5);

    }
}
