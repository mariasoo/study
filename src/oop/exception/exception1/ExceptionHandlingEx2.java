package oop.exception.exception1;

import java.util.Scanner;

public class ExceptionHandlingEx2 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        int[]array = new int[5];
        ArraayIndexCheck(array);
        System.out.println("프로그램 종료");

    }
    static void  ArraayIndexCheck(int[] array){
        try {
            for (int i = 0; i < array.length + 1; i++) {
                array[i] = input.nextInt();
            }
            for (int i : array) System.out.println(i);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
// 예외 처리는 프로그램이 비정상 종료되는 것을 방지하는 중요한 역할을 함!!!