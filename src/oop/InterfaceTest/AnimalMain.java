package oop.InterfaceTest;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog(8);
        Chicken chicken = new Chicken(3);
        Chicken cheatableChicken = new Chicken(5);

        if(cheatableChicken instanceof Cheatable){
            cheatableChicken.fly();
        }
        for(int i = 0; i < 3; i++){
            System.out.println((i+1) + "시간 후");
            dog.run(1);
            chicken.run(1);
            cheatableChicken.run(1);

            System.out.println("개의 이동거리 = " + dog.distance);
            System.out.println("닭의 이동거리 = " + chicken.distance);
            System.out.println("날으는 닭의 이동거리 = " + cheatableChicken.distance);
        }

    }
}
