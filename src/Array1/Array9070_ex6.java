package Array1;

import java.util.Arrays;
import java.util.Scanner;

public class Array9070_ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = scan.nextInt();
        }
        int max = Arrays.stream(array).max().getAsInt();

        System.out.print(max);
    }
}
