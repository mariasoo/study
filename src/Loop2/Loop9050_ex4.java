package Loop2;

import java.util.Scanner;

public class Loop9050_ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum= 0;

        for (int i = 1; i <= num; i++){
            sum+=i;
        }
        System.out.printf("%d", sum);

    }
}


//public static void main(String[] args) {
//    Scanner scan = new Scanner(System.in);
//    int num = scan.nextInt();
//    int sum= 0;
//
//    for (int i = 1; i <= num; i++){
//        sum+=i;
//        if(i==num) {
//            System.out.printf("%d", sum);
//        }
//    }
//
//}