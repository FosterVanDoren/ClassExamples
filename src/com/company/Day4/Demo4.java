package com.company.Day4;

import java.util.ArrayList;
import java.util.ListIterator;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("Stacy");
        names.add("Watson");

        //for
        for(int i=0; i<names.size(); i++) {
            System.out.println(names.get(i));
        }

        //forEach
        names.forEach(name ->
        {
            System.out.println(names);
        });
    }
}
