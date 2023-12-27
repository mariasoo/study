package Operator;

import java.util.Scanner;

public class Operator9018_ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("두 개의 수를 입력하시오.");
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.printf("%d + %d = %d\n",a,b,(a+b));
        System.out.printf("%d - %d = %d\n",a,b,(a-b));
        System.out.printf("%d * %d = %d\n",a,b,(a*b));
        System.out.printf("%d / %d = %d\n",a,b,(a/b));
        System.out.printf("%d %% %d = %d\n",a,b,(a%b));
    }
}
