package oop.day3.ex.modifier.publicex;

public class AccessModifier02 {
    public static void main(String[] args) {
        Dog1 dogObj1 = new Dog1();
        dogObj1.breed = "포메";
        dogObj1.color = "흰색";
        dogObj1.age = 5;
        Animal animal = new Animal();
        animal.name = "푸바오";
        System.out.println(animal.getName());
        animal.color = "갈색";
        animal.getColor();
        //animal.point; private라 접근 못 함


        System.out.println(dogObj1.breed + " " + dogObj1.color + " " + dogObj1.age);
        dogObj1.bowwow();
        dogObj1.run();

    }
}
