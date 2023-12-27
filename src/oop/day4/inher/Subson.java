package oop.day4.inher;

public class Subson extends SubFather{

    Subson(){}

    Subson(String familyName, String houseAdderess){
        super(familyName, houseAdderess);
    }

    public void printSon(){
        System.out.println("나는 아들입니다.");
        System.out.println("나는 아버지로부터 상속받습니다.");
    }

}
