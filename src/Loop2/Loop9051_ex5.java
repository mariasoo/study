package Loop2;

import java.util.Scanner;

public class Loop9051_ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int evenCount = 0;

        for(int i = 0; i < 10; i++){
            int num = scan.nextInt();
            if(num % 2 == 0){
               evenCount++;
           }
        }
        System.out.printf("입력받은 짝수는 %d개입니다.",evenCount);
    }
}
