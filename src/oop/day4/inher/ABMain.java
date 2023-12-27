package oop.day4.inher;

class AA{
    AA(){}
    int aa = 10;
    //메소드 오버라이딩 : 실행문 재정의
    void aa(){
        System.out.println();
    }
}

class BB extends AA{
    BB(){
        super();
    }
    int bb = 20;
}
class CC extends BB{

}

public class ABMain {
    public static void main(String[] args) {
        BB ab = new BB();
        System.out.println(ab.aa + " " + ab.bb);
        AA aa = new AA();
        System.out.println(aa.aa);
        AA ab1 = new BB();
        System.out.println(ab1.aa);
        CC cc = new CC();
        cc.aa();
    }
}
