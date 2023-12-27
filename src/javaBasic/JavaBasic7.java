package shinsegaeTranning.javaBasic;

public class JavaBasic7 {
    public static void main(String[] args) {

        int n = 2;//행의 중간 위치
        for (int i = 0; i<2*n+1 ; i++){
            for(int j = 0; j<Math.abs(n - i);i++){
                System.out.print(" ");
            }
            for (int k = 0; k < (n-Math.abs(n-i))*2+1;k++){
                System.out.print("@");
            }
            System.out.println();
        }
    }
//        int increaseNum = 1;
//        for (int i = 0; i < 3; i++) {
//            for (int j = i; j < 2; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < increaseNum; j++) {
//                System.out.print("@");
//            }
//            for (int j = i; j < 2; j++) {
//                System.out.print(" ");
//            }
//            increaseNum += 2;
//            System.out.println();
//        }
//
//        int decreaseNum =3;
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j <decreaseNum; j++) {
//                System.out.print("@");
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print(" ");
//            }
//            decreaseNum-=2;
//            System.out.println();
//        }
//    }
}
