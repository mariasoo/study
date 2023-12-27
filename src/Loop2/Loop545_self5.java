package Loop2;

import java.util.Scanner;

public class Loop545_self5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int multiple3 = 0;
        int multiple5 = 0;

        for(int i = 0; i < 10; i++){
            int num = scan.nextInt();
            if (num % 3 == 0) {
                multiple3++;
            }
            if (num % 5 == 0) {
                multiple5++;
            }
        }
        System.out.printf("Multiples of 3 : %d\n",multiple3);
        System.out.printf("Multiples of 5 : %d",multiple5);
    }
}
