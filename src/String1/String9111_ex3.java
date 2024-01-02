package String1;

import java.util.Scanner;

public class String9111_ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = "jungol olympiad";

        for(int i = 0; i < 5; i++){
            int num = scan.nextInt();

            if(num >= 0 && num <word.length()){
                char result = word.charAt(num);
                System.out.print(result);
            }
        }

    }
}
