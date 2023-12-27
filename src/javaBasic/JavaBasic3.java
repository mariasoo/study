package shinsegaeTranning.javaBasic;

public class JavaBasic3 {
    public static void main(String[] args) {
        int randomNum1 =0;
        int randomNum2 =0;
        while (true){
            randomNum1 = (int)((Math.random()*6)+1);
            randomNum2 = (int)((Math.random()*6)+1);

            int randomSum = randomNum1+randomNum2;

            System.out.printf("숫자1 : %d\n", randomNum1);
            System.out.printf("숫자2 : %d\n", randomNum2);
            System.out.println();

            if (randomSum==5){
                break;
            }
        }
    }
}
