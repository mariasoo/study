package String2;

import java.util.Scanner;

public class String9122_ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str1 = scan.next();
        String str2 = scan.next();

        if (str1.length() < str2.length()) {
            System.out.println(str1);
            System.out.println(str2);
        } else if (str2.length() < str1.length()) {
            System.out.println(str2);
            System.out.println(str1);
        }

    }

}
