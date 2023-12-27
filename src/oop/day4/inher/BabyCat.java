package oop.day4.inher;

public class BabyCat extends ParentCat{
    public String color;
    BabyCat(){ //기본생성자
    }

    BabyCat(String color){
        super("샴 고양이"); //내 부모의 생성자 호출이 super
        this.color = color;
    }
    public void meow(){

        System.out.println("냐옹!");
    }
    public void printInfo(){

//      System.out.println(super.breed);//부모 것
        System.out.println(this.color);// 내 것 객체 호출
    }
}
