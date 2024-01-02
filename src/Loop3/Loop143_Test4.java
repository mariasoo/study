package Loop3;

import java.util.Scanner;

public class Loop143_Test4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for(int i = 0; i<num; i++){
            for(int j = 0; j<i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k<2*(num-i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = num-2; i>=0; i--){
            for(int j = 0; j<i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k<2*(num-i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
