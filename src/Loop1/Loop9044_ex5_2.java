package Loop1;

import java.util.Scanner;

public class Loop9044_ex5_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numCount = 0;
        int sum = 0;

        while(true){
            int num = scan.nextInt();

            if(num == 0){
                break;
            }
            if (num > 0 && num % 2 != 0){
                sum += num;
                numCount++;
            }
            if (numCount > 0) {
                int average = sum/numCount;
                System.out.printf("홀수의 합 = %d\n",sum);
                System.out.printf("홀수의 평균 = %d",average);
            }
        }
    }
}
