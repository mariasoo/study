package oop.interface_1;
// RemoteControl 인터페이스를 기준으로 해당 TV 클래스를 구현하세요.
// 해당 TV 객체의 이름은 SAMSUNG으로 생성하여, 다음과 같은 동작을 차례로 수행시키세요.
// 1. 전원을 켠다.
// 2. 해당 TV의 기본 MAX,MIN 볼륨값을 확인한다.
// 3. TV의 볼륨을 20으로 셋팅하고 값을 확인한다.
// 4. 전원을 끈다.

public class TV implements RemoteControl  { //implements 시행하다 구현하다

    private int volume;
    private int memoryVolume;

    @Override
    public void turnOn() { //추상메소드 재정의(오버라이딩)
        System.out.println("Power On");
    }

    @Override
    public void turnOff() { //추상메소드 재정의(오버라이딩)
        System.out.println("Power Off");
    }

    @Override
    public void setVolume(int volume) { //추상메소드 재정의(오버라이딩)
        // 인터페이스 상수 MAX_VOLUME 과 MIN_VOLUME 사용하여
        if(volume > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME - 15; // 제한 가능
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else{
            this.volume = volume;
        }
        System.out.println("현재 볼륨 : " + this.volume);

    }
    // RemoteControl의 setMute() : 무음처리 기능을 TV 클래스에서 기존의 볼륨을 기억해 복원시키는 기능으로 재정의
    public void setMute(boolean mute){ //인터페이스 클래스에서만 디폴트. 클래스로 옮길 때 퍼블릭으로 바꿔야.

        if(mute){
            this.memoryVolume = this.volume; //현재 볼륨을 할당
            System.out.println("Mute Processing");
            setVolume(MIN_VOLUME); // MIN_VOLUME=0
        } else{
            System.out.println("Mute Cancel");
            this.volume = this.memoryVolume; //복원
            System.out.println(this.volume);
        }
    }
}
