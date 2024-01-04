package oop.app;

public class Car implements Comparable<Car> {
    private String car;
    private int price;

    @Override
    public int compareTo(Car o) {
        int comparePrice = o.getPrice();
        return comparePrice - this.price; //내림차순! 반대로 바꾸면 오름차순

    }

    public Car(String car, int price) {
        this.car = car;
        this.price = price;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
