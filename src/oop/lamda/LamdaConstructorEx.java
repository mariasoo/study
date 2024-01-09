package oop.lamda;


import oop.lamda.product.Person;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//생성자 참조는 객체를 인스턴스화하지 않고도 생성자를 참조할 수 있는 방법 제공한다.
public class LamdaConstructorEx {
    public static void main(String[] args) {
        //1. 인수가 없는 생성자 참조 (Supplier 함수형 인터페이스는 인수가 없는 객체의 공급자를 나타낸다.)
        // 참조된 생성자를 사용하여 새 객체를 생성하는 방법 제공한다
        // Supplier<ClassName> constructorRef = ClassName::new; //.get() 메소드를 사용할 때 생성된다

        //2. 인수가 있는 생성자 참조 (인수를 받는 생성자를 나타낸다.)
        //Function<Integer, ClassName> constructorRef = ClassName::new; //Function<매개변수, 리턴값>

        //3. 배열 생성자에 대한 참조
        //Function<Integer, ClassName[]> constructorRef = ClassName[]::new;

        //4. 제너릭 클래스의 생성자 참조
        //Supplier<GenericClass<Integer>> constructorRef = GenericClass<Integer>::new;

//        Calculator calc = new Calculator();
//        Calculator calc = CalculatorImpl::new;


        //미리 정의된 값으로 컬렉션(ArrayList)을 초기화. ArrayList 생성자 참조
        List<Integer> numbers = Stream.of(1,2,3,4,5).collect(Collectors.toCollection(ArrayList::new));

        BiFunction<String,Integer, Person> personFunction = Person::new; //<매개변수,매개변수,리턴값>
        Person john = personFunction.apply("John",20); //john에 Jonn과 20이 들어감
        System.out.println(john.toString());

        //1. 인수가 없는 String 생성자를 사용하여 새 String 객체를 생성하는 람다식 작성
        Supplier<String> newString = String::new;

        String emptyString = newString.get(); //get메소드를 이용해 인수가 없는 String 생성자 호출 새로운 빈 String 객체 반환
        System.out.println(emptyString);

        //2. 인수가 없는 ArrayList 생성자를 사용해 새 ArrayList 객체를 생성하는 람다식 작성
        Supplier<ArrayList<String>> newArrayList = ArrayList::new;
        ArrayList<String> emptyArrayList = newArrayList.get();
        System.out.println(emptyArrayList);

        //3. 인수가 없는 Random 생성자를 사용해 새 Random 객체를 생성하는 람다식 작성
        Supplier<Random> randomSupplier = Random::new;

        Random random = randomSupplier.get();
        int randomNumber = random.nextInt(100);
        System.out.println(randomNumber);

    }
}
