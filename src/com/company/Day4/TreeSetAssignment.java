package com.company.Day4;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetAssignment {
    public static void main(String[] args) {
        //1. Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green");

        System.out.println(colors);
        System.out.println("------------------");

        //2. Write a Java program to iterate through all elements in a tree set.
        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println("-----------------");

        //3. Write a Java program to add all the elements of a specified tree set to another tree set.
        TreeSet<String> moreColors = new TreeSet<>();
        moreColors.addAll(colors);
        System.out.println(moreColors);

        System.out.println("----------------");

        //4.  Write a Java program to create a reverse order view of the elements contained in a given tree set.
        NavigableSet<String> rev = colors.descendingSet();
        System.out.println(rev);

        System.out.println("-----------------");

        //5. Write a Java program to get the first and last elements in a tree set
        System.out.println("First: " + colors.pollFirst());
        System.out.println("Last: " + colors.pollLast());
    }
}

