package oop.lamda;

import java.util.Arrays;
import java.util.List;

public class LamdaEx1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10); // 정수 리스트 만들기

        int sumOfEvenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0) //짝수만 유지될 수 있게 리스트를 필터링
                .mapToInt(Integer::intValue).sum(); //인티저 값을 정수값으로 변환. sum 메소드 사용해서 합계구함.
         // mapToInt(n -> n.intValue()와 동일

        System.out.println(sumOfEvenNumbers);
    }
}
