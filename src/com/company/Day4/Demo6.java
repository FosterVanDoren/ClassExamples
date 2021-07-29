package com.company.Day4;

import java.util.ArrayList;

public class Demo6 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("Stacy");
        names.add("Watson");

        //getting an element of the specified index
        System.out.println(names.get(2));

        //adding an element on the specified index
        names.add(1, "James");
        System.out.println(names);

        //merge two lists
        ArrayList<String> moreNames = new ArrayList<>();
        moreNames.add("Steve");
        moreNames.add("Noah");
//        names.addAll(moreNames);
//        System.out.println(names);

        //merging another list at a specified index
        names.addAll(3, moreNames);

        System.out.println(names);

        //remove
//        names.remove("Paul");
        System.out.println(names);

        //remove at an index
        //names.remove(2);
        System.out.println(names);

        //removes data from the merged list
        names.removeAll(moreNames);
        System.out.println(names);

        //removing an element based on a condition
        names.removeIf(name -> name.contains(("Paul")));
        System.out.println(names);
    }
}
