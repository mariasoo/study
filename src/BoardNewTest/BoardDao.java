package BoardNewTest;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BoardDao {

    List<Board> boards = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void list() {
        System.out.println();
        System.out.println("[게시물 목록]");
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-4s%-12s%-16s%-20s\n", "no", "writer", "date", "title");
        System.out.println("-------------------------------------------------------------");
        for (Board board : boards)
            System.out.printf("%-4s%-12s%-16s%-20s\n", board.getBno(), board.getBwriter(), board.getBdate(), board.getBtitle());
    }



    public void exit() {
        System.out.println("[시스템 종료]");
        System.exit(0);
    }

    public void clear() {
        System.out.println("[게시물 전체 삭제]");
        boards.removeAll(boards);
        list();
    }

    public void read() {
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-4s%-12s%-16s%-20s\n", "no", "writer", "date", "title");
        System.out.println("-------------------------------------------------------------");
        for (Board board : boards)
            System.out.printf("%-4s%-12s%-16s%-20s\n", board.getBno(), board.getBwriter(), board.getBdate(), board.getBtitle());
        System.out.println();
        System.out.println("-------------------------------------------------------------");
        System.out.println("[게시물 읽기]");
        System.out.print("bno : ");
        Integer bno = Integer.parseInt(sc.nextLine());
        readOne(bno);
        list();
    }

    private void readOne(Integer bno) {
        System.out.println("##################");
        for (Board board : boards){
            if (board.getBno() == bno){
                System.out.printf("번호 : %s\n",bno);
                System.out.printf("제목 : %s\n",board.getBtitle());
                System.out.printf("내용 : %s\n", board.getBcontent());
                System.out.printf("작성자 : %s\n", board.getBwriter());
                System.out.printf("날짜 : %s\n", board.getBdate());
            }
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println("보조 메뉴 : 1.Update | 2.Delete | 3. List");
        System.out.print("메뉴 선택 : ");
        String menuNum = sc.nextLine();
        switch (menuNum){
            case "1" -> update(bno);
            case "2" -> delete(bno);
            case "3" -> list();
        }
    }

    private void delete(Integer bno) {

        boards.removeIf(board -> board.getBno() == bno);
    }

    private void update(Integer bno) {
        try{
            System.out.println();
            System.out.println("[수정 내용 입력]");
            for (Board board : boards){
                if (board.getBno() == bno){
                    System.out.print("제목 : ");
                    board.setBtitle(sc.nextLine());
                    System.out.print("내용 : ");
                    board.setBcontent(sc.nextLine());
                    System.out.print("작성자 : ");
                    board.setBwriter(sc.nextLine());
                }
            }
            System.out.println("-------------------------------------------------------------");
            System.out.println("보조 메뉴 : 1.Ok | 2.Cancel");
            System.out.print("메뉴 선택 : ");
            String menuNum = sc.nextLine();
            if (menuNum.equals("1")){
                System.out.println("[게시물 수정 완료]");
                list();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            exit();
        }

    }

    public void create() {
        Board board = new Board();
        System.out.println();
        System.out.println("[새 게시물 입력]");
        board.setBno(boards.size() + 1);
        System.out.print("제목 : ");
        board.setBtitle(sc.nextLine());
        System.out.print("내용 : ");
        board.setBcontent(sc.nextLine());
        System.out.print("작성자 : ");
        board.setBwriter(sc.nextLine());
        board.setBdate(getCurrentDate());

        System.out.println("-------------------------------------------------------------");
        System.out.println("보조 메뉴 : 1.Ok | 2.Cancel");
        System.out.print("메뉴 선택 : ");
        String menuNum = sc.nextLine();
        if (menuNum.equals("1")){
            boards.add(board);
            System.out.println("[게시물 추가 완료]");
            list();
        } else {
            boards.remove(board);
            System.out.println("[게시물 작성 취소]");
            list();
        }
    }

    private static String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(new Date());
    }
}
