package String1;

import java.util.Scanner;

public class String9112_ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        int length = input.length();
        System.out.println("입력받은 문자열의 길이는 " + length + "입니다.");

       for(int i = length-1; i>=0; i--){
           System.out.print(input.charAt(i));
       }
    }
}
