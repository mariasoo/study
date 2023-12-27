package Operator;

import java.util.Scanner;

public class Operator519_self2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        a+=100;
        b= b % 10;

        System.out.printf("%d ",a);
        System.out.printf("%d",b);
    }
}
