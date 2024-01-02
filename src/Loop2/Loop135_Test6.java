package Loop2;

import java.util.Scanner;

public class Loop135_Test6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);

        int sum = 0;
        int count = 0;

        for(int i = min; i<= max; i++){
            if(i % 3 == 0 || i % 5 == 0){
                sum += i;
                count++;
            }
        }
        double avg = (double) sum/count;

        System.out.println("sum : " + sum);
        System.out.println("avg : " + String.format("%.1f",avg));
    }
}
