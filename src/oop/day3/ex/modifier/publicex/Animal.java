package oop.day3.ex.modifier.publicex;

import javax.swing.*;

public class Animal {
    protected String name;
    String color;

    protected String getName(){
        return name; //getter
    }
    private String point;

    void getColor(){
        System.out.println(this.color);

    }
}
