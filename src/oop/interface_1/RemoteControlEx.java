package oop.interface_1;

public class RemoteControlEx { //구현(실행) 객체
    // 1. 상수는 구현객체와 상관없는 인터페이스 멤버이므로 바로 직접 접근을 해 상수값 읽기 가능
    public static <remoteControl> void main(String[] args) {
        System.out.println(RemoteControl.MAX_VOLUME);
        System.out.println(RemoteControl.MIN_VOLUME);
        System.out.println(Math.PI); //인스턴스 안 한 상태에서 직접 접근 가능 상수값을 읽을 수 있음

        // 해당 TV 객체의 이름은 SAMSUNG으로 생성하여, 다음과 같은 동작을 차례로 수행시키세요.
        // 1. 전원을 켠다.
        // 2. 해당 TV의 기본 MAX,MIN 볼륨값을 확인한다.
        // 3. TV의 볼륨을 20으로 셋팅하고 값을 확인한다.
        // 4. 전원을 끈다.

//      SAMSUNGTV.turnOn();
//        System.out.println(RemoteControl.MAX_VOLUME + RemoteControl.MIN_VOLUME);
//
//      SAMSUNGTV.setVolume(20);
//      SAMSUNGTV.turnOff();

        RemoteControl remoteControl;

        remoteControl = new TV(); //객체를 생성해 인터페이스 타입 변수 주입!
        remoteControl.turnOn(); // 내부적으로 동작되는 구조들은 hidden시키고 외부에서 알 수 없게. 기능 turnOn만 알 수 있음.
        System.out.println(RemoteControl.MAX_VOLUME + RemoteControl.MIN_VOLUME);
        remoteControl.setVolume(20);
        remoteControl.turnOff(); //remotecontrol로 호출.

//        remoteControl = new Radio();
//        remoteControl.turnOn(); // 내부적으로 동작되는 구조들은 hidden시키고 외부에서 알 수 없게. 기능 turnOn만 알 수 있음.
//        System.out.println(RemoteControl.MAX_VOLUME + RemoteControl.MIN_VOLUME);
//        remoteControl.setVolume(20);
//        remoteControl.turnOff(); //remotecontrol로 호출.

        remoteControl.setMute(true); //디폴트 메소드를 사용
        remoteControl.setMute(false);
        RemoteControl.changeBattery(); // 유일하게 인터페이스를 직접 호출!!!

//      RemoteControl LGRadio = new Radio();
//      LGRadio.turnOn();
//        System.out.println(RemoteControl.MAX_VOLUME + RemoteControl.MIN_VOLUME);
//
//        LGRadio.setVolume(20);
//        LGRadio.turnOff();
    }
}
// RemoteControl 인터페이스를 기준으로 해당 Radio클래스를 구현하세요.