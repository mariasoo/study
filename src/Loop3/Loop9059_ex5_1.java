package Loop3;

import java.util.Scanner;

public class Loop9059_ex5_1 {
    public static void main(String[] args) {

        for(int i = 0; i<5; i++){
            for(int j = 0; j<4-i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k<2*i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
