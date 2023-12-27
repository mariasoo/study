package oop.advanced.model.starbucks;

public class MyNotebook {
    private Wifi internet;

    public MyNotebook(){ //(Wifi wifi) 공유해서 같이 쓸 수 있음
        //this.internet = wifi; //셋업할 wifi값 전달
        this.internet = new Wifi(); //복합관계
        //인스턴스를 여기서 만들어서 wifi 고정값. 한정되어 사용한다는 뜻. 마이노트북 클래스 내에서만 사용가능. 여기서 생성했으니까.
        //나만 쓸 수 있음
    }

    void openBrowser(){
        //this.internet 인터넷을 이용하여 브라우저 동작
        this.internet.connectionInternet();
    }
}
