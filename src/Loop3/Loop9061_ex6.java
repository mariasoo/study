package Loop3;

import java.util.Scanner;

public class Loop9061_ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int count = 1;

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}
