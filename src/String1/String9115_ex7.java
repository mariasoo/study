package String1;

import java.util.Scanner;

public class String9115_ex7 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String word = "";
        char[] array = input.toCharArray();

        for (char tmp : array) {
            if (Character.isLowerCase(tmp)) {
                word += Character.toUpperCase(tmp);
            } else if (Character.isUpperCase(tmp)) {
                word += Character.toLowerCase(tmp);
            } else {
                word += tmp;
            }
        }
        System.out.println(word);
    }
}
