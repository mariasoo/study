package oop.day6.modeling;

public abstract class Animal {
    public abstract void printSound(); //추상메소드

    public void displayInfo(){ //일반메소드
        System.out.println("나는 동물입니다.");
    }

}
