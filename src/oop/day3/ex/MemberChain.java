package oop.day3.ex;

import java.awt.*;

public class MemberChain {

    String name;
    String country;
    int age;

    public MemberChain(){
        this("이수연");
    }
    public MemberChain(String name1){
        this(name1,"대한민국");
        }
        public MemberChain(String name1,String country1){
            this(name1,country1,27);
        }
        public MemberChain(String name1,String country1, int age1){
        name = name1;
        country = country1;
        age = age1;
        }
        public void printInfo(){
            System.out.println("이름 : " + name);
            System.out.println("국적 : " + country);
            System.out.println("나이 : " + age);
        }
    }

