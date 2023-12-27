package Student.Cat;

import java.util.SplittableRandom;

public class Cat {

    String breed;
    String color;

    public Cat(){
        System.out.println("Cat() 생성자 호출합니다.");
    }
    public Cat(String breed){
        System.out.println("Cat(....) 생성자 호출합니다.");
        this.breed=breed;
    }
    public Cat(String breed,String color){
        System.out.println("Cat(..., ...) 생성자 호출합니다.");
        this.breed=breed;
        this.color=color;
    }
}
