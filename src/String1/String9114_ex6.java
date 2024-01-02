package String1;

import java.util.Scanner;

public class String9114_ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            char input = scan.next().charAt(0);

                if(input >= 'a' && input <= 'z'){
                    System.out.println("소문자입니다.");
                } else if(input >= 'A' && input <= 'Z'){
                    System.out.println("대문자입니다.");
                }else if(input >= '0' && input <= '9'){
                    System.out.println("숫자문자입니다.");
                } else {
                    System.out.println("영문, 숫자 이외의 문자입니다.");
                    break;
                }
            }
        }
    }
