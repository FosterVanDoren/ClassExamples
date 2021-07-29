package com.company.Day4;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> mList = new ArrayList<>();

        mList.add("Mark");
        mList.add("Paul");
        mList.add("Watson");

        //System.out.println(mList);

        //iterator example
        Iterator iterator = mList.iterator();
        //hasNext will check if the iterator has an element
        while (iterator.hasNext()){
            System.out.println(iterator.next()); //print the element and move the cursor to the next element
        }

        //for each loop example
        for(String name: mList){
            System.out.println(name);
        }
    }
}
