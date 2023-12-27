package Loop3;

import java.util.Scanner;

public class Loop549_self1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int sum = 0;
        int oddCount = 0;

        for(int odd = 1; sum < n; odd+=2){
            sum += odd;
            oddCount++;
        }
        System.out.printf("%d %d",oddCount,sum);
    }
}
