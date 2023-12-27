package Loop1;

import java.util.Scanner;

public class Loop9041_ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("점수를 입력하세요.");
            int score = scan.nextInt();
            if (score == -1){
                break;
            } if (score >= 80 && score <=100) {
                    System.out.println("축하합니다. 합격입니다.");
                } else if(score>0 && score < 80) {
                    System.out.println("죄송합니다. 불합격입니다");
                }

            }

        }

    }
