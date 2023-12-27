package oop.advanced.model.starbucks;

public class YourNoteBook {
    private Wifi internet;

    public YourNoteBook(Wifi wifi){
        this.internet = wifi; //셋업할 wifi값 전달

    }

    void openKakaoTalk(){
        //this.internet 인터넷을 이용하여 브라우저 동작
        this.internet.connectionInternet();
    }
}
