package Array2;

import java.util.Scanner;

public class Array9074_ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = new int[11];

        while(true){
            int num = scan.nextInt();

            if(num < 1 || num > 10){
                break;
            }
            array[num]++;
        }
        for(int i = 0; i< array.length; i++){
            if(array[i] > 0){
                System.out.printf("%d : %d개\n",i,array[i]);
            }
        }

    }
}
