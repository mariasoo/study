package oop.day3.ex.modifier.publicex;

public class AccessModifier01 {
    public static void main(String[] args) {
        Dog dogObj1 = new Dog();
        dogObj1.breed = "포메";
        dogObj1.color = "흰색";
        System.out.println(dogObj1.breed + " " + dogObj1.color);
        dogObj1.bowwow();
    }
}
