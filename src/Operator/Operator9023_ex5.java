package Operator;

import java.util.Scanner;

public class Operator9023_ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a == b){
        System.out.printf("%d ",1);
        } else if (a != b) {
            System.out.printf("%d ",0);
        }if (b == c){
            System.out.printf("%d ",1);
        } else if(b != c){
            System.out.printf("%d ",0);
        }
        if (a == b){
            System.out.printf("%d ",0);
        } else if (a != b) {
            System.out.printf("%d ",1);
        }if (b == c){
            System.out.printf("%d ",0);
        } else if(b != c){
            System.out.printf("%d ",1);
        }
    }
}
