package Array1;

import java.util.Scanner;

public class Array555_self1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] array;
        array = new String[10];

        for(int i = 0; i < array.length; i++) {
            String letter = scan.next();
            array[i] = letter;
        }

            for (int j = 0; j < array.length; j++){
                System.out.print(array[j]);

            }
        }
    }
