package com.company.Day4;

import java.util.HashSet;


public class HashSetAssignment {
    public static void main(String[] args) {
        //1. Write a Java program to append the specified element to the end of a hash set.
        //I couldn't figure this part out
        HashSet<String> set = new HashSet<>();
        set.add("Mark");
        set.add("Paul");
        set.add("Watson");
        set.add("Mark");

        //2. Write a Java program to iterate through all elements in a hash list.
        for(String name: set){
            System.out.println(name);
        }

        //3. Write a Java program to get the number of elements in a hash set.
        System.out.println(set.size());

        //4. Write a Java program to empty a hash set.
        set.clear();
        System.out.println(set);
    }
}
