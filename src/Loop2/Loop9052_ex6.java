package Loop2;

import java.util.Scanner;

public class Loop9052_ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int total = 0;

        for(int i=0; i<5; i++) {
            int score = scan.nextInt();
            total += score;
        }
                double average = (double) total /5;

            System.out.printf("총점 : %d\n",total);
            System.out.printf("평균 : %.1f",average);

        }
    }
