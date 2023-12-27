package Array1;

import java.util.Scanner;

public class Array9067_ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < 10; i++){
            int num = scan.nextInt();
            array[i] = num;
        }
        System.out.printf("%d %d %d",array[2],array[4],array[9]);
        }
    }
