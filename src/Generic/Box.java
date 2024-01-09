package Generic;

import BoardPractice.BoardDao;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T> {

    private ArrayList<T> items;

    public Box(){

        items = new ArrayList<T>();
    }

    public void addItem(T item) {

        items.add(item);
    }

    public T getItem() {
       if(!items.isEmpty()) {
           return items.get(0);
       }
        return null;
    }
    public boolean isEmpty() {

        return items.isEmpty();
    }
}