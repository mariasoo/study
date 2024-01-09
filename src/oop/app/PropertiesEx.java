package oop.app;

import java.util.Properties;

public class PropertiesEx {
    public static void main(String[] args) throws Exception{
        //Properties 컬렉션 생성

        Properties properties = new Properties();

        //database.properties 파일 로드

        properties.load(PropertiesEx.class.getResourceAsStream("database.properties"));

        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        String admin = properties.getProperty("admin"); //주어진 key값 읽기

        System.out.println("driver : " + driver);
        System.out.println("url : " + url);
        System.out.println("username : " + username);
        System.out.println("password : " + password);
        System.out.println("admin : " + admin);
        //외부 외장하드(메모장)에 저장되어있는 자료를 활용하기 위해서 부르기.
        //리소스에 대한 접근을 통해 데이터를 옮겨오기 내 메모리영역(힙영역)에 저장!
        //옮긴 데이터 자료를 내 마음대로 컨트롤 할 수 있음!
        //구현하고자 하는 객체를 이용해서 데이터를 담는 작업 가능!
    }
}
