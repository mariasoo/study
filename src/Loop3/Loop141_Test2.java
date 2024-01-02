package Loop3;

import java.util.Scanner;

public class Loop141_Test2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for(int i = 1; i<100; i++) {
            int multiple = i * 10;
            if (multiple >= num) {
                break;
            }
            System.out.println(multiple);
        }
    }
}
