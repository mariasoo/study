package Loop1;

import java.util.Scanner;

public class Loop128_Test4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numCount = 0;

        while(true){
            int num = scan.nextInt();

            if(num == 0){
                break;
            }

            if(num % 3 !=0 && num % 5 !=0){
                numCount++;
            }
        }
        System.out.println(numCount);
    }
}
