package oop.interface4;

public class DriveMain {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus); //자동타입변환(promotion) --> 오버라이딩메소드 호출 --> 다형성 구현
        driver.drive(taxi); //출력. 버스랑 택시에 있는 run을 호출
    }
    //인터페이스 매개변수를 갖는 메소드

        public static void ride(Vehicle vehicle){
        if(vehicle instanceof Bus bus)
            bus.checkFare(); //자바 12버전부터 가능
            vehicle.run();
    }
}
