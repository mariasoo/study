package Loop2;

import java.util.Scanner;

public class Loop543_self3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for(int i = 1; i <= num; i++){
            if(i % 2 == 0){
                System.out.printf("%d ",i);
            }
        }

    }
}
