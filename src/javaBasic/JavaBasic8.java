package shinsegaeTranning.javaBasic;

import java.util.Scanner;

public class JavaBasic8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 0, withdraw = 0,total=0;
        while (true){
            System.out.printf("-----------------------------\n");
            System.out.printf("1.예금 | 2.출금 | 3.잔고 | 4.종료\n");
            System.out.printf("-----------------------------\n");

            System.out.print("선택> ");
            int inputNum = sc.nextInt();
            switch (inputNum){
                case 1 -> {
                    System.out.print("예금액>");
                    total =balance + sc.nextInt();
                }
                case 2 -> {
                    System.out.print("출금액>");
                    withdraw = sc.nextInt();
                }
                case 3 -> {
                    System.out.print("잔고>");
                    int check = total - withdraw;
                    System.out.println(check);
                }
                case 4 ->{
                    System.out.println();
                    System.out.println("프로그램 종료");
                    System.exit(0);
                }

            }
            System.out.println();
        }
    }
}
