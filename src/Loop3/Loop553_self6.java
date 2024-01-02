package Loop3;

import java.util.Scanner;

public class Loop553_self6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        char word = 'A';

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i+1; j++){ //영문자의 개수
                System.out.print(word);
                word++;
            }
            System.out.println();
        }
    }
}
