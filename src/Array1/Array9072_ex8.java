package Array1;

import java.util.Scanner;

public class Array9072_ex8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] array = new int[10];
        int total = 0;
        double avg;

        for(int i = 0; i<10; i++){
            int scores = scan.nextInt();

            array[i] = scores;
            total+=scores;
        }
        System.out.printf("총점 = %d\n",total);

         avg = (double)total/10;
        System.out.printf("평균 = %.1f",avg);
    }
}
