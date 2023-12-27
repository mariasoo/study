package Operator;

import java.util.Scanner;

public class Operator9022_ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = ++a + b--;


        System.out.printf("a = %d, ",a);
        System.out.printf("b = %d, ",b);
        System.out.printf("c = %d ",c);

    }
}