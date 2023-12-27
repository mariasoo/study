package Loop3;

import java.util.Scanner;

public class Loop9055_ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int sum = 0;
        int lastSum = 0;

        for(int i = 1; ; i++){
            lastSum = i;
            sum += i;

            if(sum > num){
                break;
            }
        }
        System.out.printf("%d %d",lastSum,sum);

    }
}
