package oop.interface_1;

public interface RemoteControl {
    // 1. 상수 필드
    int MAX_VOLUME = 30; //최대 볼륨 30 상수로 표현 , 상수명을 대문자!!! : (public static final) 컴파일 과정에서 자동으로 붙음
    int MIN_VOLUME = 0;

    // 2. 추상메소드 abstract가 앞에 붙거나, {} 바디가 없음(또는 메소드 선언부만 작성)

    void turnOn();
    void turnOff();

    void setVolume(int volume);


    // 3. 디폴트 인스턴스 메소드 : 완전한 실행코드(=바디가 있음)를 가진 유일한 메소드 setMute()사용
    default void setMute(boolean mute){

        if(mute){
            System.out.println("Mute Processing");
            setVolume(MIN_VOLUME); // MIN_VOLUME=0
        } else{
            System.out.println("Mute Cancel");
        }
    }
    //정적 메소드
    public static void changeBattery(){
        System.out.println("리모컨 건전지 교환");
    }




}

