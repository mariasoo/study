package Loop2;

import java.util.Scanner;

public class Loop139_Test10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        for(int i = 1; i<=9; i++){
            for(int j = num1; j<= num2; j++){
                System.out.printf("%d * %d =  %3d   ",j,i,j*i);
            }
            System.out.println();
        }
    }
}
