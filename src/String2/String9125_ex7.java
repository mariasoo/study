package String2;

import java.util.Scanner;

public class String9125_ex7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] array = {"champion", "tel", "pencil", "jungol", "olympiad", "class", "information", "lesson", "book", "lion"};

        System.out.print("문자를 입력하세요. ");
        String input1 = scan.next();

        for (String s : array) {
            if(s.contains(input1)){
                System.out.println(s);
            }
        }
        System.out.println();
        System.out.print("문자열을 입력하세요. ");
        String input2 = scan.next();

        for (String s : array) {
            if(s.contains(input2)){
                System.out.println(s);
            }
        }
        if(input1.equals(input2)){
            System.out.println("찾는 단어가 없습니다.");
        }
    }
}

