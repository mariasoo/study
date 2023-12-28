package oop.exception.exception1;

public class ExceptionHandlingEx1 {
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]");
        printLength("자바프로그램입니다.");
        printLength(null); //NullPointerException
        System.out.println("[프로그램 종료]");
    } //정상적으로 종료를 시켜줌. 예외가 발생해도 종료되지 않도록 try-catch로 예외처리 함! 다음 스텝을 밟았다는 의미!

    static void printLength(String s){
        try {
            int result = s.length();
            System.out.println("문자 수 : " + result);
        }catch (NullPointerException e){
            System.out.println(e.getMessage()); //예외 출력방식1: 에러의 원인을 간단하게 출력할 때 사용
            System.out.println("입력데이터가 잘못되었습니다. 다시 입력해 주세요!"); //예외 출력방식1
            System.out.println(e.toString()); //예외 출력방식2: Exception의 내용과 원인 출력
            e.printStackTrace(); //예외 출력방식3 print 자체가 출력문이라서 sout안에 안 씀!: 에러의 발생 근원지를 찾아 단계별로 에러 출력

        }
    }
}
