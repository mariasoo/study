package Loop2;

import java.util.Scanner;

public class Loop131_Test2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int min = Math.min(num1,num2);
        int max = Math.max(num1,num2);

        for(int i = min; i<=max; i++){
            System.out.print(i + " ");
        }
    }
}
