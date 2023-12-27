package Loop1;

import java.util.Scanner;

public class Loop9045_ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("1. 입력하기");
            System.out.println("2. 출력하기");
            System.out.println("3. 삭제하기");
            System.out.println("4. 끝내기");
            System.out.print("작업할 번호를 선택하세요. ");
            int num = scan.nextInt();

            if(num == 4){
                System.out.println("끝내기를 선택하였습니다.");
                break;
            }

            if(num >= 1 && num < 5){
                System.out.println("출력하기를 선택하였습니다.");
            }
            else{
                System.out.println("잘못 입력하였습니다.");
            }

        }
    }
}
