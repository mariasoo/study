package String2;

import java.util.Scanner;

public class String9124_ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str1 = scan.next();
        String str2 = scan.next();

        str2 = str2 +str1.substring(0,Math.min(3,str1.length()));
        str1 = str2.substring(0,Math.min(3,str2.length())) + str1.substring(3);


        System.out.println(str1);
        System.out.println(str2);

    }
}
