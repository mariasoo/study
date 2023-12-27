package Loop1;

import java.util.Scanner;

public class Loop125_Test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int i = 1;

        while(i <= num){
            System.out.print(i);
            i++;
        }
    }
}
