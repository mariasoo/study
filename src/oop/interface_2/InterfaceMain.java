package oop.interface_2;

public class InterfaceMain {
    public static void main(String[] args) {
        InterfaceImpl impl = new InterfaceImpl(); //구현객체 생성
        System.out.println(impl.toString()); //객체 생성해서 출력 가능.

        InterfaceA interfaceA = impl;
        //System.out.println(InterfaceA.toString()); 출력 불가 객체가 아님.

        InterfaceB interfaceB = impl;
        InterfaceC interfaceC = impl;

        interfaceA.methodA();
        interfaceB.methodB();

        interfaceC.methodA();
        interfaceC.methodB();
        interfaceC.methodC(); //상속 개념 구조화 이해하기 C타입만 다 호출가능
    }
}
