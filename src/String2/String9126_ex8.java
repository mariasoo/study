package String2;

import java.util.Scanner;

public class String9126_ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String[] array = input.split(" ");

        char word1 = array[0].charAt(0);
        char word2 = array[1].charAt(0);

        System.out.println((word1>word2 ? array[0] : array[1] + " 가(이) 더 큽니다."));

        if(array[0].substring(0,3).equals(array[1].substring(0,3))){
            System.out.println("앞의 세 문자가 같습니다.");
        } else {
            System.out.println("앞의 세 문자가 같지 않습니다.");
        }
    }
}
