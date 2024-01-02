package model.test;

public class C {
    public static void main(String[] args) {
        A s1, s2;
        B x1, x2;

        s1 = new A(); //() 안에 매개변수 자리
        s2 = new A();

        x1 = new B();
        x2 = new B(); //힙 영역의 생성된 객체 생성

        s1.a1();
        s1.a2();
        x1.b1();

        String data = s1.a3();
        x1.b3(data); // 객체 간 데이터를 주고받기 가능

        //B타입의 x1 객체에 b4() 메소드 : 리턴타입으로 작성. [요구조건] A타입의 a3 메소드에서 제공한 값을 받아서
        //"A 클래스의 data는 B타입의 x1객체에서 처리하였습니다."

        String a = s2.a3(); //s1도 가능. A라는 틀이 같음
        //String b = x2.b4(a);
       // System.out.println(b);
        System.out.println(x2.b4(a));




    }
}

