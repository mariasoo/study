package Array1;

import java.util.Arrays;

public class Array9073_ex9 {
    public static void main(String[] args) {
        int[] num = new int[]{95,75,85,100,50};

           Arrays.sort(num);

        for(int i = 0; i<num.length; i++){
            System.out.printf("%d ", num[i]);
        }
    }
}
