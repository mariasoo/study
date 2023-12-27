package Loop2;

import java.util.Scanner;

public class Loop546_self6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double avg = 0;
        int n = scan.nextInt();
        int total =0;

        for(int i = 0; i < n  ; i++) {
            int score = scan.nextInt();
            total += score;

        }
            avg = (double) total/n;
            System.out.printf("avg = %.1f\n", avg);
            if(avg >= 80){
                System.out.println("pass");
            }else if(avg < 80){
                System.out.println("fail");
            }
        }
    }

