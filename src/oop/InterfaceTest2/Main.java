package oop.InterfaceTest2;

public class Main {

    public static void main(String[] args) {

        Bank bank = new KBBank(); //Bank 인터페이스 타입
        bank.withDraw(100);
        bank.deposit(100);
//        String a =bank.findDormancyAccount("763231"); //KBBank에서 오버라이딩 하지 않았음 디폴트메소드 그대로 사용
//        System.out.println(a);
        Bank.BCAuth("KBBank"); //static타입이니까 직접 접근.

        System.out.println("\n*************인스턴스 교체!!***************\n");

        bank = new SHBank();
        bank.withDraw(100);
        bank.deposit(100);
        bank.findDormancyAccount("4311");
        Bank.BCAuth("SHBank");

        System.out.println("\n*************카카오은행 연동 실패!!***************\n");
        //호환성 불가 implements를 안하겠다는 의미. 반드시 카카오타입으로만 생성 가능
        KakaoBank kakao = new KakaoBank(); // 이렇게 직접 생성해야
		/*
		bank = new KakaoBank();
		bank.withDraw(100);
		bank.deposit(100);
		bank.findDormancyAccount("4311");
		*/

        System.out.println("\n*************대학교 주은행  교체!!***************\n");

        bank = new KBBank(); //new KBBank();
        bank.withDraw(20000);
        bank.deposit(1000);
        bank.findDormancyAccount("855512");
        Bank.BCAuth("SHBank");

    }
}
