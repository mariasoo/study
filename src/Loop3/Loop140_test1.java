package Loop3;

import java.util.Scanner;

public class Loop140_test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        for(int i = 0; i<20; i++){
            int num = scan.nextInt();

            if(num == 0){
                break;
            }
            sum += num;
            count++;
        }
        int avg = sum/count;
        System.out.printf("%d %d",sum,avg);
    }
}
