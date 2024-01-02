package Loop2;

import java.util.Scanner;

public class Loop138_Test9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for(int i = 1; i<=num; i++){
            for(int j = 1; j<=num; j++){
                System.out.print("(" + i + ", " + j + ") ");
            }
            System.out.println();
        }
    }
}
