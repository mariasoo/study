package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class BoardDao {

    List<Board> list = new ArrayList<Board>();
    public List<Board> getBoardList(){ // 저장기능
        List<Board> list = new ArrayList<Board>();

        list.add(new Board("자바심화프로그래밍1", "오늘은 컬렉션 프레임워크", "SYM"));
        list.add(new Board("자바심화프로그래밍2", "오늘은 컬렉션 프레임워크", "SYM"));
        list.add(new Board("자바심화프로그래밍3", "오늘은 컬렉션 프레임워크", "SYM"));
        list.add(new Board("자바심화프로그래밍4", "오늘은 컬렉션 프레임워크", "SYM"));
        list.add(new Board("자바심화프로그래밍5", "오늘은 컬렉션 프레임워크", "LSY"));
        return list;

    }

    public void boardSize(List<Board> boardList){
        System.out.println("현재 게시글의 수는 " + boardList.size() + "입니다.");
    }

    public void getBoardAll(){
        for (Board board : this.list) {
            System.out.println("전체 보기");
            System.out.println("글쓴이: " +board.getWriter()+ " 제목: "+ board.getSubject()+ "글내용: "+board.getSubject());
            System.out.println(board.getSubject());
            System.out.println(board.getContent());
        }
    }

    public void writerSearch(List<Board> list, String writer){
        for (Board board : list) {
            if(board.getWriter().equals(writer)){
                System.out.println("검색");
                System.out.println("글쓴이: " +board.getWriter()+ " 제목: "+ board.getSubject()+ "글내용: "+board.getSubject());
            }
        }
    }

    public void boardInsert (String subject, String content, String writer){
        Board board = new Board(subject,content,writer);
        list.add(board);
        System.out.println(board.getWriter()+"님이 작성한 글이 성공적으로 저장되었습니다.");
        getBoardAll();
    }
}
