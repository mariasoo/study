package BoardNewTest;

import java.util.Scanner;

public class BoardMenu {
    Scanner sc = new Scanner(System.in);
    BoardDao boardDao = new BoardDao();

    public void start() {
        boardDao.list();
        mainMenu();
    }

    public void mainMenu() {

        System.out.println();
        System.out.println("-------------------------------------------------------------");
        System.out.println("메인 메뉴 : 1.Create | 2.Read | 3.Clear | 4.Exit");
        System.out.print("메뉴 선택 : ");
        try{
            String menuNum = sc.nextLine();

            switch (menuNum) {
                case "1" -> {
                    boardDao.create();
                    mainMenu();
                }
                case "2" -> {
                    boardDao.read();
                    mainMenu();
                }
                case "3" -> {
                    boardDao.clear();
                    mainMenu();
                }
                case "4" -> boardDao.exit();
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
        }

    }
}
