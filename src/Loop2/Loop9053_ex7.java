package Loop2;


public class Loop9053_ex7 {
    public static void main(String[] args) {

        for (int n = 0; n < 5; n++){
            int num = 1;
            num+=n;

            for(int m = 0; m < 5; m++){
                System.out.printf("%d ",num);
            }
            System.out.println();
        }
        System.out.println();

        for (int j = 0; j < 5; j++){
            int num = 1;

            for (int i = 0; i < 5; i++) {
                System.out.printf("%d ", num);
                num++;
            }
            System.out.println();

        }
    }
}

