package String2;

import java.util.Scanner;

public class String9128_ex10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String intInput = scan.nextLine();
        String[] intArray = intInput.split(" ");

        String floatInput = scan.nextLine();
        String[] floatArray = floatInput.split(" ");

        int intSum = Integer.parseInt(intArray[0]) + Integer.parseInt(intArray[1]);
        System.out.printf("%s + %s = %d\n", intArray[0],intArray[1],intSum);

        double floatSum = Double.parseDouble(floatArray[0]) + Double.parseDouble(floatArray[1]);
        System.out.printf("%.2f + %.2f = %.2f\n", Double.parseDouble(floatArray[0]),Double.parseDouble(floatArray[1]),floatSum);

    }
}
