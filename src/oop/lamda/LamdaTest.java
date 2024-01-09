package oop.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LamdaTest {
    public static void main(String[] args) {
        //1. 제시되는 list를 오름차순으로 정렬하는 람다식을 작성
        List<String> list = Arrays.asList("apple","banana","pear","orange");
        list.sort(String::compareTo); //(s1,s2) -> s1.compareTo(s2) 오름차순으로 정렬한다
        System.out.println(list);

        //2. 문자열을 대문자로 변환하는 람다 표현식 작성
        Function<String,String > toUpperCase = String::toUpperCase; //(str)->str.toUpperCase(); 간단하게 축약
        System.out.println(toUpperCase.apply("hello")); //

        Function<String,String > toLowerCase = String::toLowerCase;
        System.out.println(toLowerCase.apply("HELLO")); //

        //3. 문자열이 비어있는지 확인하는 람다 표현식 작성
        Predicate<String> isEmpty = String::isEmpty; //(str)->str.isEmpty();
        System.out.println(isEmpty.test(""));

        //4. 두 문자열을 연결하는 람다 표현식 작성
        BiFunction<String, String, String> concatName = String::concat;
        System.out.println(concatName.apply("자바신세계","개발자 과정"));

        //5. 숫자의 제곱을 계산하는 람다 표현식 작성
        Function<Integer, Integer> square = (number)->number*number;
        System.out.println(square.apply(5));
    }
}
