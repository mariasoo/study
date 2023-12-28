package oop.exception.exception1;


import java.util.Scanner;

public class FinallyTest1 {

    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        try {
            returnintFinally(input.nextInt(), input.nextInt());
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("종료하겠습니다.");
        }
    }

        public static void returnintFinally(int number1,int number2) throws ArithmeticException{
            double c=number1/number2;
            System.out.println(c);

    }
}
