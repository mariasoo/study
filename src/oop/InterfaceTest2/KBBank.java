package oop.InterfaceTest2;

public class KBBank implements Bank{

    private double balance;
    @Override
    public void withDraw(int price) {
//        System.out.printf("KB은행만의 인출 로직...%d 원을 인출한다.\n",price); //매개변수 그냥 출력. 저장 안함. 생성자 선언 안했으니까.
        System.out.println("KB은행만의 인출 로직...");
        if(price < Bank.MAX_INTEGER) System.out.println(price + "원 인출한다.");
        else System.out.println(price + "원 인출 실패");
    }

    @Override
    public void deposit(int price) {
//        System.out.printf("KB은행만의 입금 로직...%d 원을 입금한다.\n",price);
        this.balance += price;
        System.out.println("KB은행만의 입금 로직..." + price + "원이 입금되었습니다." + "잔고는" + this.balance);
    }

    @Override
    public String findDormancyAccount(String custId) {
        return Bank.super.findDormancyAccount(custId);
    }
}
