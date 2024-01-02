package String2;

import java.util.Scanner;

public class String9129_ex11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] floatArray = input.split(" ");

        StringBuilder result = new StringBuilder();
        for(String s : floatArray){
            double floatValue = Double.parseDouble(s);
        }

    }
}
