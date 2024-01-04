package oop.app;

import java.util.*;

public class TreeMapEx {
    //TreeSet에 무작위로 점수를 입력하고 검색하는 방법

    public static void main(String[] args) {
        TreeMap<String, Integer> scores = new TreeMap<>();

        //TreeMap에 학생의 이름과 점수를 입력하고 검색하는 방법을 구현해 봅시다.

        //이름(String), 점수(Integer) 저장
        scores.put("sam", 75);
        scores.put("tom", 80);
        scores.put("sara", 87);
        scores.put("sin", 70);
        scores.put("adward", 65);
        scores.put("kim", 50);
        scores.put("kate", 90);
        scores.put("billy", 95);

        //foreach문을 이용하여 오름차순 정렬된 scores의 학생의 이름과 점수들을 출력


        //<특정 점수 출력하기>
        //가장 낮은 점수
        System.out.println("가장 낮은 점수 : " + scores.firstEntry());

        //가장 높은 점수
        System.out.println("가장 높은 점수 : " + scores.lastEntry());


        //90점 아래 점수


        //90점 위 점수


        //90점이거나 바로 아래 점수


        //80점이거나 바로 위 점수



        //내림차순 정렬하기







    }
}
