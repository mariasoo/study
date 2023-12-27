package Array2;

import java.util.Scanner;

public class Array9075_ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = new int[10];

        while(true){
            int num = scan.nextInt();

            if(num == 0){
                break;
            }
            int lastNum = num % 10;
            array[lastNum]++;
        }
        for(int i = 0; i< array.length; i++){
            if(array[i] > 0){
                System.out.printf("%d : %d개\n",i,array[i]);
            }
        }
    }
}
