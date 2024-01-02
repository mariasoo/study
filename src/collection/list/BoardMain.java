package collection.list;

import java.util.*;

public class BoardMain { //

    public static void main(String[] args) {
//        List<Board> boardList = new ArrayList<Board>();
//
//        //5명이 글을 작성하였습니다. 5명이 쓴 글에 대해 글 쓴 순서대로 boardList 저장하세요.
//        boardList.add(new Board("자바심화프로그래밍1", "오늘은 컬렉션 프레임워크", "SYM"));
//        boardList.add(new Board("자바심화프로그래밍2", "오늘은 컬렉션 프레임워크", "SYM"));
//        boardList.add(new Board("자바심화프로그래밍3", "오늘은 컬렉션 프레임워크", "SYM"));
//        boardList.add(new Board("자바심화프로그래밍4", "오늘은 컬렉션 프레임워크", "SYM"));
//        boardList.add(new Board("자바심화프로그래밍5", "오늘은 컬렉션 프레임워크", "SYM"));

        BoardDao dao = new BoardDao();
        List<Board> boardList = dao.getBoardList();

        //int size = boardList.size();


        //dao에 전체 게시물의 수를 제공하는 메소드인 boardSize() 작성해 전체 게시물의 수를 확인
        dao.boardSize(boardList);


        //dao에 boardList에 글쓴이의 이름을 전달해 해당 글쓴이를 확인한 후 있다면
        //글쓴이의 이름과 글 주제, 내용을 출력하는 writerSearch(List<Board> list, String writer) 메소드를 작성하세요.
        //dao에 boardInsert(String subject,String writer, String content)메소드를 작성하여 새로운 글 추가기능 구현하세요.
        //두번째로 글 쓴 사람의 이름을 알고 싶다.
//        Board two = boardList.get(1);
//        System.out.println(two.getWriter());
//        // 작가 이름 수정
//        two.setWriter("KJS");
//        System.out.println(two.getWriter());

        //dao에 전체 글을 조회하는 메소드인 getBoardAll()
//        dao.boardSize(boardList);
//        dao.getBoardAll(boardList);
//        dao.writerSearch(boardList,"LSY");
        dao.boardInsert("자바심화프로그래밍","오늘은 컬렉션 프레임워크","LSY");
        //Board의 전체 글을 조회
//        for (Board board : boardList) {
//            System.out.println("전체 보기");
//            System.out.println(board.getWriter());
//            System.out.println(board.getSubject());
//            System.out.println(board.getContent());
//        }


    }
}