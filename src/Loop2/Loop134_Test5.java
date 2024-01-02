package Loop2;

import java.util.Scanner;

public class Loop134_Test5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[10];

        for (int i = 0; i < 10; i++) {
            num[i] = scan.nextInt();
        }
        int evenCount = 0;
        int oddCount = 0;

        for (int i : num) {
            if(i % 2 == 0){
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("even : " + evenCount);
        System.out.println("odd : " + oddCount);
    }
}
