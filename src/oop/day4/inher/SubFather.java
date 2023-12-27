package oop.day4.inher;

public class SubFather extends GrandFather {

    private String familyName;

    public String getFamilyName() {
        return familyName;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    private String houseAddress;

    SubFather(){}

    SubFather(String familyName, String houseAddreess){
        this.familyName=familyName;
        this.houseAddress=houseAddreess;

    }

    public void printFather(){
        System.out.println("나는 아버지입니다! 나는 할아버지로부터 상속받습니다.");
    }
}
