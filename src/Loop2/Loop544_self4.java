package Loop2;

import java.util.Scanner;

public class Loop544_self4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        for (int i = num; i <= 100; i++){
            sum+=i;
        }
        System.out.printf("%d",sum);
    }
}
