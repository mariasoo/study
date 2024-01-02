package Array1;

import java.io.SequenceInputStream;
import java.time.LocalDate;
import java.util.Scanner;

public class Array9069_ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("YEAR = ");
            int year = scan.nextInt();
            System.out.print("MONTH = ");
            int month = scan.nextInt();

            if(month == 0){
                break;
            } else if (month > 12 || month < 1) {
                System.out.println("잘못 입력하였습니다.");

            } else{
                LocalDate day = LocalDate.of(year, month, 1);
                int tmp = day.lengthOfMonth(); // 30
                System.out.println("입력하신 달의 날 수는 " + tmp + "일입니다.");
            }
            System.out.println();
        }
    }
}
