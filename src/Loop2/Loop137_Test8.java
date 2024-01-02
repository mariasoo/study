package Loop2;

import java.util.Scanner;

public class Loop137_Test8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int row = scan.nextInt();
        int column = scan.nextInt();

        for(int i = 1; i<=row; i++){
            for(int j = 1; j<=column; j++){
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}

