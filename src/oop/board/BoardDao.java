package oop.board;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BoardDao {
    private static int bno = 1;

    private Scanner sc = new Scanner(System.in);
    private List<Board> boards = new ArrayList<Board>();

    public void list() {
        System.out.println();
        System.out.println("[게시물 목록]");
        System.out.println("-------------------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
        System.out.println("-------------------------------------------");
        read();
        mainMenu();
    }

    public void mainMenu() {
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("1.메인 메뉴 : 1.Create | 2.Read | 3.Clear | 4.Exit");
        System.out.print("메뉴 선택: ");
        String menuNo = sc.nextLine();
        System.out.println();

        switch (menuNo) {
            case "1" -> create();
            case "2" -> readOne();
            case "3" -> clear();
            case "4" -> exit();
        }
    }

    private void exit() {
        System.out.println("***exit()메소드 실행됨 프로그램 종료합니다.");
        System.exit(0);
    }

    private void clear() { //clear함수 안에서 list함수 호출 -> 재귀함수
        System.out.println("***clear()메소드 실행됨");
        System.out.println("[게시물 전체 삭제]");
        System.out.println("------------------------------");
        System.out.println("보조 메뉴 : 1. Ok | 2. Cancel");
        System.out.print("메뉴 선택 :");
        String menuNo = sc.nextLine();
        try {
            if (menuNo.equals("1")) {
                boards.removeAll(boards);
                System.out.println("게시물 전부 삭제");
            }
        } catch (Exception e) {
            System.out.println("게시물이 비어있습니다.");
        }
        list();
    }

    private void read() {
        System.out.println("***read()메소드 실행됨");
        System.out.println("전체 게시물 출력");
        for (Board row : boards)
            System.out.printf("%-6s%-12s%-16s%-40s\n", row.getBno(), row.getBwriter(), row.getBdate(), row.getBtitle());


    }

    private void readOne() {
        System.out.println("========================================================");
        System.out.println("원하시는 게시물의 번호가 있으시면 입력해주세요!");

        System.out.println("게시물 번호를 입력해주세요.");
        int bno = Integer.parseInt(sc.nextLine());
        for (Board row : boards) {
            if (row.getBno() == bno) {
                System.out.printf("%-6s%-12s%-16s%-40s\n", row.getBno(), row.getBwriter(), row.getBdate(), row.getBtitle());
            }
            System.out.println("-------------------------------------");
            System.out.println("보조 메뉴 : 1. Update | 2. Delete | 3.List");
            System.out.print("메뉴 선택 : ");
            String menuNo = sc.nextLine();
            switch (menuNo) {
                case "1" -> update(bno);
                case "2" -> delete(bno);
                case "3" -> list();
            }
        }

    }

    public void update(int bno) {
        System.out.println("[수정 내용 입력]");
        for (Board row : boards) {
            if (row.getBno() == bno) {
                System.out.println("제목: ");
                String tmpTitle = sc.nextLine();
                System.out.println("내용: ");
                String tmpContent = sc.nextLine();
                System.out.println("작성자: ");
                String tmpWriter = sc.nextLine();


                System.out.println("보조 메뉴 : 1. Ok | 2. Cancel");
                System.out.print("메뉴 선택 : ");
                String menuNum = sc.nextLine();
                if (menuNum.equals("1")) {
                    row.setBtitle(tmpTitle);
                    row.setBcontent(tmpContent);
                    row.setBwriter(tmpWriter);
                }
            }
        }
        list();
    }

    public void delete(int bno) {
        for (Board row : boards) {
            if (row.getBno() == bno) {
                boards.remove(row);//게시판에 있는 게시물 삭제
            }
        }
        list();
    }


    private void create() {
        System.out.println("***create()메소드 실행됨");
        //입력받은 게시물의 제목, 내용, 작성자를 Board객체에 저장하여 게시글 하나를 생성한다.
        Board row = new Board();
        System.out.println("[새 게시물 입력]");
        row.setBno(bno);
        bno++;
        System.out.println("제목 : ");
        row.setBtitle(sc.nextLine());
        System.out.println("내용 : ");
        row.setBcontent(sc.nextLine());
        System.out.println("작성자 : ");
        row.setBwriter(sc.nextLine());
        row.setBdate(getCurrentDate());

        //보조메뉴 출력
        System.out.println("-------------------------------------");
        System.out.println("보조 메뉴 : 1. Ok | 2. Cancel");
        System.out.println("메뉴 선택 : ");
        String menuNo = sc.nextLine();
        if (menuNo.equals("1")) {
            try {
                boards.add(row);
                System.out.println("게시물 추가 완료!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                exit();
            }
        }
        //게시물 목록 출력
        read();
        list();
    }

    public String getCurrentDate() {
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        String currentDate = date.format(new Date());
        return currentDate;

    }
}
