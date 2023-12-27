package Loop2;

import java.util.Scanner;

public class Loop132_Test3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        for(int i = 1; i <= num; i++){
           if(i % 5 == 0){
               sum+=i;
           }
        }
            System.out.printf("%d",sum);
    }
}
