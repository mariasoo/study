package String2;

import java.util.Scanner;

public class String9121_ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] array = {"champion", "class"};

        System.out.print("문자를 입력하세요. ");

        String c = scan.next();

        if(c.equals("c")){
            for(String tmp : array){
            System.out.println(tmp);
            }
        } else{
            System.out.println("찾는 단어가 없습니다.");
        }

    }
}
