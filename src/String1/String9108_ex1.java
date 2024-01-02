package String1;

import java.util.Scanner;

public class String9108_ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String input = scan.next();
            char ch = input.charAt(0);
            System.out.println(ch + " -> " + (int) ch);

            if(ch == '0'){
               break;
            }
        }
    }
}
