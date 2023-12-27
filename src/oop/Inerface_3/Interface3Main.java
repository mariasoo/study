package oop.Inerface_3;

public class Interface3Main {
    public static void main(String[] args) {
        //구현 객체 생성
        B b = new B();
        C c = new C();
        C bc = new C();
        System.out.println("==============");

        D d = new D();
        E e = new E();
        System.out.println("==============");

        //인터페이스 변수 선언
        A a;


        //변수에 구현 객체 대입
        a = b; //A <== B B타입이 A타입으로 자동 타입 변환 (promotion)
        B b1 = (B)a; // A를 B타입으로 캐스팅 (casting) A ==> B. 다시 원형으로 복구

        a = c; //A <==C C타입이 A타입으로 자동 타입 변환
        C c1 = (C)a;

        a = d; //A <==D D타입이 A타입으로 자동 타입 변환
        D d1 = (D)a;

        a = e; //A <==E E타입이 A타입으로 자동 타입 변환
        E e1 = (E)a;


    }
}
