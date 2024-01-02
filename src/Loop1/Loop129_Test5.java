package Loop1;

import java.util.Scanner;

public class Loop129_Test5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.print("Base = ");
            int base = scan.nextInt();

            System.out.print("Height = ");
            int height = scan.nextInt();

            double width = Math.round((base*height/2)*10.0)/10.0;

            System.out.print("Triangle width = " + width);

            System.out.print("Continue? ");
            char answer = scan.next().charAt(0);

            if(answer != 'Y' && answer != 'y'){
                break;
            }
        }
    }
}
