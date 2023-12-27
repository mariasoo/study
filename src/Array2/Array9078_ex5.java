package Array2;

import java.util.Scanner;

public class Array9078_ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] array1 = new int[3][3];
        int[][] array2 = new int[3][3];

        for(int i= 0; i< 3; i++){
            System.out.printf("첫 번째 배열 %d행 ",i+1);
            for(int j = 0; j< 3; j++){
                array1[i][j]= scan.nextInt();
            }
        }
        for(int i= 0; i< 3; i++){
            System.out.printf("두 번째 배열 %d행 ",i+1);
            for(int j = 0; j< 3; j++){
                array2[i][j]= scan.nextInt();
            }
        }

        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(array1[i][j] + array2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
