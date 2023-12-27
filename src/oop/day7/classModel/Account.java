package oop.day7.classModel;

public class Account {
    private int balance; //잔고
    private String accountNumber;
    private String name;
    private String password;


    Account(){}

    public String getPassword() { //2 값호출
        return password;
    }

    public void setPassword(String password) {
        this.password = password; //1 값저장 private 직접 접근이 안되니까 set
    }

    Account(String accountNumber, String name, String password){
        this.accountNumber = accountNumber;
        this.name = name;
        this.password = password;
    }

    public int deposit(int money){
        System.out.println("고객님이 입금하신 금액은" + money + "입니다."); //순서대로 코드 작성
        System.out.println("입금을 진행하겠습니다.");
        this.balance += money;
        //balancePrint(); //호출해서 리턴처리
        System.out.println("계좌의 잔고는 : " + this.balance);
        return this.balance;
    }

}
