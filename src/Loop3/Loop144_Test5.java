package Loop3;

import java.util.Scanner;

public class Loop144_Test5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for(int i = 1; i<=num; i++){
            for(int j = num-1 ; j>=i; j--){
                System.out.print("  ");
            }
            for(int j = 1; j<=(i*2)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
