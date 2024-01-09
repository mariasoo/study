package collection.list.ex;
//vector는 Arraylist와 동일한 내부 구조를 가지고 있다.
//vector는 동기화된 메소드로 구성되어 있어 멀티스레드가 동시에 vector()메소드를 실행할 수 없다.

import Generic.wildcard.Board;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Vector;

public class VectorEx1 {
    public static void main(String[] args) {
        List<Integer> list1 = new Vector<>(); //list1은 Integer객체만 저장할 수 있다.
//        List list2 = new Vector(); //타입 제한을 받지 않은 list2는 모든 타입의 객체를 저장할 수 있다.
        List<Object> list2 = new Vector();

        list1.add(30); //Integer타입만 넣을 수 있다.
        list2.add("M");
        list2.add(50);
        list2.add(30.5);
        System.out.println(list2.get(0));

//       List<Board> boards = new Vector<>();//2000개가 정확히 들어옴
        //Vector는 따로따로 연산하게 막지만(동기화 : 한번에 하나의 쓰레드만 접근가능하게)
        //arraylist눈 신경 안써서 연산 중에 다른 쓰레드가 접근하는 경우가 발생하여 작업을 못한 경우도 존재
        List<Board> boards = new ArrayList<>();//출력이 1957만 나옴 why? 할당받지 못해서!

        //작업스레드 A
        Thread threadA = new Thread(){
            public void run(){
                for(int i = 1; i<=1000; i++){
                    boards.add(new Board("제목"+i, "내용"+i, "글쓴 사람"+i));
                }
            }

        };

        Thread threadB = new Thread(){
            public void run(){
                for(int i = 1001; i<=2000; i++){
                    boards.add(new Board("제목"+i, "내용"+i, "글쓴 사람"+i));
                }
            }

        };
        //작업스레드 실행
        threadA.start();
        threadB.start();

        //작업 스레드들이 모두 종료될 때까지는 메인 스레드가 끝나면 안됨. 메인 스레드 기다려!
        try{
            threadA.join();
            threadB.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        int size = boards.size();
        System.out.println("총 글의 수: "+size);

        for (Board board : boards) {
            System.out.printf("%s, %s, %s, %s",board.getWriter(),board.getSubject(),board.getContent());

        }
    }
}
