package Loop2;

public class Loop547_self7 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            int num = 1;
            num+=i;

            for(int j = 0; j < 5; j++){
                num++;
                System.out.printf("%d ",num);
            }
            System.out.println();
        }
    }
}
