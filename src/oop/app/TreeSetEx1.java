package oop.app;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx1 {
    //TreeSet에 무작위로 점수를 입력하고 검색하는 방법

    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();

        //Integer 점수 저장
        scores.add(75);
        scores.add(80);
        scores.add(87);
        scores.add(70);
        scores.add(65);
        scores.add(50);
        scores.add(90);
        scores.add(95);

        //점수를 foreach문을 이용해 scores의 점수들을 출력
        for (Integer score : scores) {
            System.out.println(score);
        }

        //<특정 점수 출력하기>
        //가장 낮은 점수
        System.out.println("가장 낮은 점수 : "+scores.first());

        //가장 높은 점수
        System.out.println("가장 높은 점수 : "+scores.last());

        //90점 아래 점수
        System.out.println("90점 아래 점수 : "+scores.lower(90));


        //90점 위 점수


        //90점이거나 바로 아래 점수


        //80점이거나 바로 위 점수



        //내림차순 정렬하기




        //범위 검색(80<=)



        //범위 검색(80<= scores < 90)
       
        

    }
}
