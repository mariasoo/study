package String1;

import java.util.Scanner;

public class String9117_ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        char[] arr = new char[input.length()*2];

        for(int i = 0; i< arr.length; i++){
            if(i >= input.length()){
                arr[i]=input.charAt(i-input.length());
            } else {
                arr[i]=input.charAt(i);
            }
        }

        for(int j = 1; j<= input.length(); j++){
            for(int k = j; k< input.length() + j;k++){
                System.out.print(arr[k]);
            }
            System.out.println();
        }
    }
}
