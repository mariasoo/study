package oop.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
@FunctionalInterface
interface MathOperation{
    int calculate(int x, int y);
}

interface StringOperation{
    int getLength(String string);
}

interface ArrayOperation{
    int calculateSum(int[] numbers); // 정수 배열을 받아 모든 홀수의 합을 반환하는 람다식, 결과 출력
}

// 정수 리스트를 받아 최대값을 반환하는 람다식을 작성
interface FindMax{
    int getMax(List<Integer> numbers);
}

public class LamdaEx2 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        MathOperation addition = (x, y) -> x + y; //함수 교체 가능 한줄이라 블록X 한줄 이상이면 블록O
        int result = addition.calculate(5, 3);
        System.out.println("Result : " + result);

        // 문자열의 길이를 반환하는 람다식 작성
        StringOperation stringLength = string -> string.length();

        // 람다식에 데이터를 전달한 후 반환 처리 구문 작성
        System.out.println("1. 길이 확인이 필요한 문자열을 입력해주세요.");
        String str = input.nextLine();
        int len = stringLength.getLength(str);

        //결과 출력
        System.out.println("입력하신 문자열의 길이는 : " + len);

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        ArrayOperation arraySum = (numbers) -> Arrays.stream(array)
                .filter(number -> number % 2 != 0).sum();
        int result2 = arraySum.calculateSum(array);
        System.out.println("홀수 합 : " + result2);

        FindMax max = (numbers) -> {
            int maxNumber = Integer.MIN_VALUE; //비교할 가장 작은 값으로 초기화
            for (int number : numbers) {
                if (number > maxNumber) {
                    maxNumber = number;
                }
            }
            return maxNumber;
        };
        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("숫자 입력 : ");
            int n = input.nextInt();
            numberList.add(n); //5개 숫자를 랜덤하게 넣어주기
        }
        int maxValue = max.getMax(numberList); //들어온 가장 큰 값 리턴
        System.out.println("Max value : "+maxValue);
    }
}
