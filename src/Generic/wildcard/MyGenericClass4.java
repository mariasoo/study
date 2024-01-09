package Generic.wildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyGenericClass4  {
    public static <T extends Comparable<T>> void printList(List<T> list){
        list.forEach(i -> System.out.println(i));
    }

    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        List<String> stringList = new ArrayList<>(List.of("lee","kim","jin"));
        printList(numberList);
        printList(stringList);

        //board 게시글을 저장한 리스트를 만들어 해당 글 내용(content)을 출력하도록

        Board board = new Board("미술","반고흐","이수연");
        Board board1 = new Board("음악","베토벤","이예은");

        List<Board> boardList = new ArrayList<>(List.of(board,board1));
        //List.of로 쓰면 끝. 더 추가되지 않음. add사용불가.
        Collections.sort(boardList);

        printList(boardList); //board에 toString을 오버라이딩하면 원하는 값 출력 가능.
    }
}
