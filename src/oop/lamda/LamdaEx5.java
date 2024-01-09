package oop.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

//메서드 유형별 참조 사용법
public class LamdaEx5 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("dog","cat","elephant","rabbit");

        //1.문자열 리스트를 오름차순으로 정렬
        Collections.sort(strings,(s1,s2)-> s1.compareTo(s2)); //람다식

        Collections.sort(strings,String::compareTo); //메소드 참조식. 위와 아래는 같은 의미

        //2.정수 리스트 스트리밍하기, integers 대상으로 모든 짝수의 합을 구하는 식
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int total1 = integers.stream().filter(n -> n % 2 == 0).mapToInt(i -> i.intValue()).sum();

        int total2 = integers.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        //filter까지 람다식, mapToInt부터는 메소드 참조식

        String[] str1 = {"aaa","bbb","ccc"};
        //Collection List 컬렉션으로 변경
        List<String> stringList = Arrays.asList(str1);

        //stringList를 스트림 객체 생성
        Stream<String> stringStream1 = stringList.stream(); //바로 스트림 객체 생성 가능
        Stream<String> str1Stream = Arrays.stream(str1); // 배열은 Arrays.stream()을 통해서 배열을 넣어서 스트림 객체 생성

        //스트림 출력
        stringStream1.sorted().forEach(System.out::println); //메소드 호출
        str1Stream.sorted().forEach(System.out::println);

        //스트림은 데이터소스로부터 데이터를 읽기만 할 뿐, 변경하지 않음
        //한번 사용하면 닫혀서 다시 사용할 수 없다
        //스트림 작업은 내부 반복으로 처리한다
    }
}
