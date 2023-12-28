package oop.exception.exception1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionTest1 {

    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        FileInput();
        System.out.println("프로그램 종료");

    }

    public static void FileInput() {
        FileInputStream fis = null; //초기화
        try {
            fis = new FileInputStream("src/oop/exception/exception1/data.txt");
            System.out.println("파일 읽기 완료");
        }
        catch (FileNotFoundException e){
            System.out.println("해당 파일이 존재하지 않습니다. 확인해 주세요.");
            return;
        }finally {
            try{
            if(fis != null)  fis.close();
            }
            catch(IOException io){
                io.printStackTrace();
            }
            System.out.println("finally문은 항상 수행됨");
        }
        System.out.println("예외처리 후 수행됨");
    }
}
// 예외 처리는 프로그램이 비정상 종료되는 것을 방지하는 중요한 역할을 함!!!