package oop.exception.exception2;

import java.util.Objects;
import java.util.Scanner;

public class LoginExample {
    static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
    String userID, password;
    IDFormatTest IDCheck = new IDFormatTest();
    PasswordCheckMain passwordCheck = new PasswordCheckMain();

    try{
        System.out.println("아이디 입력");
        userID = in.next();
        IDCheck.setUserID(userID);
        System.out.println("비밀번호 입력");
        password = in.next();
        passwordCheck.setPassword(password);
        System.out.println("회원가입 완료");
    } catch (IDFormatException | PasswordCheckException check){
        check.printStackTrace();
        System.out.println("회원가입 실패");
    } finally {
        System.out.println("종료");
    }

        try {
            System.out.println("아이디 확인");
            String newID;
            String newPassword;
            newID = in.next();

            if(!newID.equals(IDCheck.getUserID())){
                throw new NoExitIDWrongPasswordException("아이디 다름");
            }
            System.out.println("비밀번호 확인");
            newPassword = in.next();
            if (!newPassword.equals(passwordCheck.getPassword())) {
                throw new NoExitIDWrongPasswordException("비밀번호 다름");
            }
            System.out.println("동일함");
        } catch (NoExitIDWrongPasswordException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("확인 종료");
        }
    }
}
