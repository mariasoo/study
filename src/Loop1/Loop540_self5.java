package Loop1;

import java.util.Scanner;

public class Loop540_self5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int num = scan.nextInt();

            if (num == -1) {
                break;
            }
            if (num % 3 == 0) {
                int quotient = num/3;
                System.out.printf("%d\n", quotient);
            } else {
                System.out.printf("%d\n",num);
            }

            }
        }
    }


