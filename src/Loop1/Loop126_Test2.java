package Loop1;

import java.util.Scanner;

public class Loop126_Test2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int oddCount = 0;
        int evenCount = 0;

        while (true){
            int num = scan.nextInt();

            if(num == 0){
                break;
            }

            if (num % 2 == 0){
                evenCount++;
            } else if (num % 2 != 0) {
                oddCount++;
            }
        }
        System.out.printf("odd : %d\n",oddCount);
        System.out.printf("even : %d\n",evenCount);
    }
}
