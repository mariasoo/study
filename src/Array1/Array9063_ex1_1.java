package Array1;

import java.util.Scanner;

public class Array9063_ex1_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array1;
        array1 = new int[5];

        for(int i = 0; i < 5 ; i++){
            int num = scan.nextInt();
            array1[i]=num;
        }
        for(int i = 0; i < 5 ; i++){
            System.out.printf("%d ",array1[i]);
        }
    }
}
