package oop.day4.inher;

public class FamilyMain {
    public static void main(String[] args) {
        Subson subson = new Subson("나의 아버지는 프로그래머","나의 집은 인천");
        subson.printSon();
        System.out.println(subson.getFamilyName());
        System.out.println(subson.getHouseAddress());
        subson.printFather();
        subson.printGrandFather();

    }
}
