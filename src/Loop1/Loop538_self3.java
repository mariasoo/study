package Loop1;

import java.util.Scanner;

public class Loop538_self3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.printf("number? ");
            int a = scan.nextInt();
            if(a == 0){
                break;
            }
            else if(a > 0){
                System.out.println("positive integer");
            } else {
                System.out.println("negative number");
            }
        }
    }
}
