package Array1;

import java.util.Arrays;
import java.util.Scanner;

public class Array9071_ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = new int[10];
        int max = 0;
        int min = 0;

        for(int i = 0; i<10; i++){
             array[i] = scan.nextInt();
        }
        array= Arrays.stream(array).sorted().toArray();
        // 오름차순으로 정렬을 해서 가장 큰 값은 오른쪽부터, 가장 작은 값은 왼쪽부터!
        // 정수가 그냥 입력되어있으니까 찾기 쉽게! 10개의 정수를 입력(반복)받아서 정렬해줌

        for(int even = 9; even>=0; even--){
            if(array[even] % 2 == 0){
                max=(array[even]>max ? array[even] : max);
            }
            // 현재 최댓값 max와 현재 짝수를 비교해 더 큰 값을 max에 할당, 또는 유지
        }
        for(int odd = 0; odd<10; odd++){
            Math.abs(array[odd]);// 음수 입력 시 절댓값으로 만들어서 나눌 때 나머지가 음수로 나오지 않게 해서 홀수 찾기에 수월함
            if(array[odd] % 2 != 0){
                min=(array[odd] < min ? array[odd] : min);
            }
        }
        System.out.printf("%d %d",min,max); //지역변수니까 odd, even이 아니라 min, max로!
    }
}
