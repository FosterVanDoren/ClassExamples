package com.company.Day4;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("Watson");

        //get example
        System.out.println(names.get(1)); //returns paul
        //set example
        names.set(1, "Paul Smith");
        for(String name: names){
            System.out.println(name);
        }
    }
}
