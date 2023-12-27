package Loop1;

import java.util.Scanner;

public class Loop9042_ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numCount = 0;
        int sum = 0;

        while (true) {
            int num = scan.nextInt();

            if (num == 0) {
                break;
            }

            sum += num;
            numCount++;
        }
        if (numCount > 0) {
            double average = sum/numCount;
            System.out.printf("입력된 자료의 개수 = %d\n",numCount);
            System.out.printf("입력된 자료의 합계 = %d\n",sum);
            System.out.printf("입력된 자료의 평균 = %.2f\n",average);
        }
    }
}

