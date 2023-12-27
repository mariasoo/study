package Loop1;

import java.util.Scanner;

public class Loop633_self6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("1. Korea");
            System.out.println("2. USA");
            System.out.println("3. Japan");
            System.out.println("4. China");
            System.out.print("number? ");
            int num = scan.nextInt();

            if(num >= 5){
                System.out.println("none");
                break;
            }

            if(num == 1){
                System.out.println("Seoul");
            } else if (num == 2){
                System.out.println("Washington");
            } else if (num == 3){
                System.out.println("Tokyo");
            } else if (num == 4) {
                System.out.println("Beijing");
            }
        }
    }
}
