package Loop1;

public class Loop9040_ex2 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        while(num<=10){
            sum=num+sum;
            num++;
        }
        System.out.printf("1부터 10까지의 합 = %d\n",sum);
        System.out.printf("while문이 끝난 후의 num의 값 = %d",num);
    }
}
