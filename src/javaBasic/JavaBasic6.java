package shinsegaeTranning.javaBasic;

public class JavaBasic6 {
//    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            for (int j = i; j < 4; j++)
//                System.out.print(" ");
//
//            for (int j = 0; j < i + 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}
public static void main(String[] args) {
    //char tmpStar = '*';
    String outputStar = "*";//String.valueOf(tmpStar);

    for (int i = 0; i < 5; i++) {
        System.out.printf("%5s\n", outputStar);
        outputStar += "*";//tmpStar;
    }
}

}