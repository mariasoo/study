package oop.advanced.model.starbucks;

public class Main {
    public static void main(String[] args) {
        //Wifi internet = new Wifi();//중요한 건 이 인스턴스가 어디에 있는지!

        MyNotebook myNoteBook = new MyNotebook();
        //YourNoteBook yourNoteBook = new YourNoteBook();
        myNoteBook.openBrowser();
        //yourNoteBook.openKakaoTalk();
    }
}
