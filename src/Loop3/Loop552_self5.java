package Loop3;

import java.util.Scanner;

public class Loop552_self5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for(int i = 1; i<=num; i++){ //왼쪽 공백
            for(int j = 1; j<i; j++){
                System.out.print(" ");
            }
            for(int k = i; k<=2*num-i; k++){ //별
                System.out.print("*");
            }
            for(int l = 1; l<i; l++){ //오른쪽 공백
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
