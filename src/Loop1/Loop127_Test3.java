package Loop1;

import java.util.Scanner;

public class Loop127_Test3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while(true){
            int num = scan.nextInt();

            if(num < 0 || num > 100){
                break;
            }
            sum += num;
            count++;
        }
        double avg = (double) sum/ count;
        avg = Math.round(avg*10.0)/10.0;
        System.out.println("sum : " + sum);
        System.out.println("avg : " + avg);
    }
}
