package oop.exception.exception2;

import java.util.Scanner;

public class PasswordCheckMain {
    static Scanner in = new Scanner(System.in);

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) throws PasswordCheckException {
        if(password == null){
            throw new PasswordCheckException("password는 null일 수 없습니다.");
            
        } else if (password.length() < 5) {
            throw new PasswordCheckException("password는 5자 이하만 가능합니다.");
        } else if (!password.matches("[a-zA-Z0-9]*")) {
            throw new PasswordCheckException("password가 아닙니다.");
        }

        this.password = password;
    }

    private String password;


    public static void main(String[] args) {
        PasswordCheckMain test = new PasswordCheckMain();
        String password = null;
        try{
            password = in.next();
            test.setPassword(password);

        } catch (PasswordCheckException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("프로그램 종료");
        }

    }

}
