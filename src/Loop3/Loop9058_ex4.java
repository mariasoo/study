package Loop3;

import java.util.Scanner;

public class Loop9058_ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        String star = "*";

        for(int i = 0; i<n; i++){
            System.out.printf("%5s",star);
            star += "*";
            System.out.println();
        }
    }
}
