package oop.exception.exception1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
    public static void main(String[] args) {
        ThrowsException test = new ThrowsException();

        try{
            test.loadClass("src/oop/exception/exception1/data.txt","java.lang.String");
        } catch(FileNotFoundException | ClassNotFoundException c){ //Surround try/multi-catch 선택하여 생성
            c.getMessage(); //문제가 생긴 내용을 파일에 저장한 것을 log
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    //throws 예외 처리 미루기 : 메소드를 호출한 위치에서 예외를 처리
    //본인이 호출한 부분에서 예외가 발생했으니 직접 처리해라! 예외값 던져주기 나를 호출한 위치로!
    private Class loadClass(String fileName, String className)throws FileNotFoundException,ClassNotFoundException{
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }
}
