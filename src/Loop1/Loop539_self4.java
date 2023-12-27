package Loop1;

import java.util.Scanner;

public class Loop539_self4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numCount = 0;
        int sum = 0;

        while (true) {
            int num = scan.nextInt();

            if(num >= 100){
                sum += num;
                numCount++;
                break;
            }
            sum += num;
            numCount++;
        }
        if(numCount > 0){
            double average = sum/numCount;
            System.out.printf("%d\n",sum);
            System.out.printf("%.1f\n",average);

        }
    }
}
