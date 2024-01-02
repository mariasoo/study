package oop;

public class Student {
    public String name;
    public String major;

    public Student(){ //디폴트

    } //default constructor 기본 생성자
    // 오버로딩 시, 다폴트 생성자 작성할 것

    public Student(String name, String major){
        this.name = name;
        this.major= major;

    } // constructor overloading : 메소드의 매개변수 타입변경, 개수를 변경

//    public Student(String name){
//
//    }
//
//    public Student(String major){
//
//    }
    public void study() {
        int studyE = 0;
        studyE++;
        System.out.println("학습 능력이 1+ 상승했습니다.");
    }


    public String eat(String food){

        return food + "를 맛있게 냠냠!";
    }





}
