package Array1;

import java.util.Scanner;

public class Array9068_ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[100];


        for (int i = 0; i < 100; i++){
            int num = scan.nextInt();
            array[i] = num;


            if(array[i]==0){
                break;
            }

        }
        for (int j = 1; j < 100; j+=2){
            if (array[j] != 0) {
                System.out.printf("%d ", array[j]);
            }
        }

    }
}

