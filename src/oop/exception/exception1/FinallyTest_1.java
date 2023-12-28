package oop.exception.exception1;

import java.util.Scanner;

public class FinallyTest_1 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        int number1, number2;
        System.out.println("두 수를 차례로 입력해주세요.");
        try {
            number1 = input.nextInt();
            number2 = input.nextInt();
            FinallyTest_1 test = new FinallyTest_1();
            int checkn = FinallyTest_1.returnFinally(number1, number2);
            System.out.println(checkn);
        } catch (Exception e) {
            System.out.println("프로그램 종료");
        }
    }

    public static int returnFinally(int number1, int number2) {
        try {
            double result = number1 / number2;
            String data = String.format("%.2f", result);
            System.out.println(data);
            return 0;
        } catch (ArithmeticException ar) {
            ar.printStackTrace();
            return 1;
        } catch (Exception e) {
            e.getMessage();
        }
        finally {
            System.out.println("finally 구문");
            return 2;
        }
        //return 3;
    }
}

