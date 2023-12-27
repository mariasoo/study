package oop.InterfaceTest;

public abstract class Animal {

    protected int speed;
    protected double distance;

    Animal(int speed){
        this.speed = speed;
    }
    abstract void run(int hours);

}
