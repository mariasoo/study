package oop.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LamdaEx4 {
    public static void main(String[] args) {
        //1. map()
        // 스트림 api 컬렉션에서 다양한 연산을 수행하기 위해 람다 표현식을 허용하는 메서드를 제공
        // 스트림의 요소를 다른 유형으로 변환하는데 사용

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5); //asList와 Listof의 차이?
        List<Integer> squaredNumber = numbers.stream().map(n->n*n).toList(); //collect(Collectors.toList())와 동일
        System.out.println(squaredNumber);

        //2. filter()
        // 조건에 따라 스트림에서 요소를 선택하는데 사용(조건을 정의하는 람다 표현식을 인수로 받는다)
        // 2-1. numbers 대상으로 홀수 리스트 oddNumber 구성하여 출력
        List<Integer> oddNumbers = numbers.stream().filter(n->n%2!=0).toList(); //stream을 통해서 풀어놓고 filter하겠다.
        System.out.println(oddNumbers);
        // 2-2. numbers 대상으로 짝수 리스트를 evenNumber 구성하여 출력
        List<Integer> evenNumbers = numbers.stream().filter(n->n%2==0).toList();
        System.out.println(evenNumbers);

        //3. reduce() : 집계함수
        // 스트림의 요소를 단일 값으로 집계하는데 사용 (축소 연산을 정의하는 람다 표현식을 인수로 받음)
        int total = numbers.stream().reduce(0,(a,b)->a+b); //numbers를 받아 0부터 시작해서 들어온 값을 다 더하라.
        System.out.println(total);

        //4. forEach()
        // 스트림의 요소를 반복하고, 각 요소에 대해 작업을 수행하는데 사용 (수행 작업을 정의하는 람다 표현식을 인수로 받음)
        numbers.stream().forEach(number-> System.out.println(number));
        numbers.stream().forEach(System.out::println);
        numbers.forEach(System.out::println); // 바로 접근해서 사용 가능 stream 안 써도 됨 출력만 할 거니까?

        //응용 문제 : 스트림API를 사용하여 리스트 numbers의 평균을 구하는 람다식 작성
        double average = numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                //optional double이라서 보통 getAsDouble()를 사용해 double로 바꿔주고
                .orElse(0.0); //스트림이 비워있을 경우 기본값을 0.0으로 제공한다음에 평균이 출력될 수 있게 작업해라.
                //orElse를 사용하면 getAsDouble()처럼 double로 바꿔준다. optional double에서만 사용가능한 메서드.

        System.out.println(average);
    }
}
