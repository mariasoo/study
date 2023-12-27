package Operator;

import java.util.Scanner;

public class Operator9019_ex2_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = new int[5];
        System.out.print("5개의 수를 입력하시오. ");

        for(int i = 0; i < 5 ; i++){
            int num = scan.nextInt();
            array[i]=num;
        }
            System.out.printf("%d ",array[0]+3);
            System.out.printf("%d ",array[1]-3);
            System.out.printf("%d ",array[2]*3);
            System.out.printf("%d ",array[3]/3);
            System.out.printf("%d ",array[4]%3);
        }
    }
