package Loop1;

import java.util.Scanner;

public class Loop537_self2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        int sum = 0;
        int num = scan.nextInt();

        while (true) {
            sum+=i;
            i++;
            if(i>num){
                break;
            }
        }
        System.out.printf("%d", sum);
    }
}
