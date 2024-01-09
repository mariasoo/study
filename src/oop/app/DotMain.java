package oop.app;

import java.util.Arrays;
import java.util.Comparator;

public class DotMain {
    public static void main(String[] args) {
        Dot[] dots = new Dot[3];
        dots[0] = new Dot(1,4);
        dots[1] = new Dot(1,1);
        dots[2] = new Dot(2,2);

        Arrays.sort(dots, new Comparator<Dot>() {


            @Override
            public int compare(Dot o1, Dot o2) {
//                Comparator.comparingInt((Dot tmp) -> tmp.getX()).thenComparingInt(tmp -> tmp.getY()).compare(o1,o2);

                if(o1.getX()==o2.getX()){

                    return Integer.compare(o1.getY(),o2.getY());
                }
                return Integer.compare(o1.getX(),o2.getX());
            }
        });
        Arrays.stream(dots).forEach(dot -> System.out.println("(" + dot.getX() +","+ dot.getY()+")"));

        //
    }
}

