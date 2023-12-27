package oop.day4.inher;

public class CatMain {
    public static void main(String[] args) {
        BabyCat babyCat = new BabyCat("brown");
        babyCat.eat();
        babyCat.meow();
        babyCat.printInfo();

        Object obj1 = babyCat;
        BabyCat baby = (BabyCat) obj1; // babycat이 최상위객체.
        baby.printInfo();
    }
}
