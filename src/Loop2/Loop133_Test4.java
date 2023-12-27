package Loop2;

import java.util.Scanner;

public class Loop133_Test4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int total = 0;

        for(int i = 0; i < n; i++){
            int score = scan.nextInt();
            total+=score;
        }
        double avg = (double)total/n;
        System.out.printf("%.2f",avg);
    }
}
