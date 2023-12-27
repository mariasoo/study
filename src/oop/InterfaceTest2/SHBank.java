package oop.InterfaceTest2;

public class SHBank implements Bank{
    @Override
    public void withDraw(int price) {
        System.out.printf("SH은행만의 인출 로직...\n%d 원을 인출한다.\n",price);
    }

    @Override
    public void deposit(int price) {
        System.out.printf("SH은행만의 입금 로직...%d 원을 입금한다.\n",price);
        System.out.println("SH은행은 별도의 후행처리 작업을 따로 한다.");

    }

    @Override
    public String findDormancyAccount(String custId) {
        System.out.println("**금융개정법안 00이후 고객의 휴면계좌 찾아주기 운동**");
        System.out.println("SH금융결제원에서 제공하는 로직**");
        return "00은행 000-000-0000-00";
    }
}
