package oop.app;

import java.util.Arrays;

public class CarMain {
    public static void main(String[] args) {
        Car[] cars = new Car[4];
        cars[0] = new Car("GENESIS",3000);
        cars[1] = new Car("SOUL",1500);
        cars[2] = new Car("SPARK",1800);
        cars[3] = new Car("SONATA",2400);

        Arrays.sort(cars);

        for(Car car : cars){
            System.out.println(car.getCar()); //내림차순은 반대(-)
            //가격으로 오름차순 정렬됨(return this.price - compareprice)
        }
    }
}
