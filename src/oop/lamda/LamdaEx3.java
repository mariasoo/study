package oop.lamda;

import java.util.*;
import java.util.stream.Collectors;

@FunctionalInterface
interface Product {
    int calculate(List<Integer> products);

}

public class LamdaEx3 {
    public static void main(String[] args) {
        //1. 정수형 리스트를 numbers를 생성. 리스트의 순서는 1, 2, 3, 4, 5.
        //2. numbers의 값을 순서대로 출력하는 람다식을 작성.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5); //리스트 구성 asList
        numbers.forEach((number) -> {
            System.out.print(number);
        });
        //3. stream API reduce() + 람다식 = 누적 곱 구하기
        Product product = products -> products.stream().reduce(1, (a, b) -> a * b);
        List<Integer> list = List.of(2, 3, 4);
        System.out.println(product.calculate(list)); //결과 24

        //4. 이름 리스트를 알파벳 순서로 정렬
//    List<String> names = Arrays.asList("John","Jane","Adam","Eve");
//    Collectors.sort(names,new Comparator<String>() {
//        public int compare(String a, String b) {
//            return a.compareTo(b);
//        }
//    });
//    Collections.sort(names.(a,b) -> a.compareTo(b)); //위 식과 동일. 한줄로 처리가능!

        //5. 문자열 리스트 name를 대문자로 변환하는 람다식을 작성
        List<String> names = Arrays.asList("John", "Jane", "Adam", "Eve");
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase) //name -> name.toUpperCase()와 동일
                .collect(Collectors.toList()); //다시 리스트로 수집해서 결과. list 변경 가능
        System.out.println(upperCaseNames);

        //매개변수와 반환값이 없는 람다식도 가능 타입추론 가능
//        (name,age)->{
//            System.out.println(name);
//            System.out.println(age);
//        }
    }
}
