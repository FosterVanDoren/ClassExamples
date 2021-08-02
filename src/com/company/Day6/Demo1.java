package com.company.Day6;

import java.util.ArrayList;
import java.util.Collections;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> greetings = new ArrayList<>();
        greetings.add("Hello");
        greetings.add("Hi");
        greetings.add("Greetings");
        greetings.add("Howdy");



        System.out.println("Before sorting...");
        for(String greeting: greetings){
            System.out.println(greeting);
        }

        Collections.sort(greetings);
        System.out.println("After sorting...");
        for(String greeting: greetings){
            System.out.println(greeting);
        }

    }
}
