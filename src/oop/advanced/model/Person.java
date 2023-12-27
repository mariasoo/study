package oop.advanced.model;

public class Person {
//    private Phone phone; //폰 소유. 폰 객체를 갖겠다란 의미 멤버(변수)를 갖고 있는 것.

//    Person(Phone phone){
//        this.phone = phone; //폰 값을 저장
//    }
//    public void createMessage(){
//        String message = "안녕 반가워. 오늘 몇 시에 만날까?";
//        String to = "내 친구";
//        // 폰의 문자 전송기능 호출하기!
//        this.phone.sendMessage(to, message);
//    }

    //의존관계. 메소드 내에서 변수를 사용하고 버림.
    public void sendMessage(Phone phone){ //변수를 갖고 있는지 여부에 따라 연관, 의존 관계가 나뉨. 의존은 변수 없음!
        String to = "나의 벗";
        String message = "보고싶다";
        phone.sendMessage(to, message);
    }
}
