package com.company.Day4;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListAssignment {
    public static void main(String[] args) {
        //1. Write a Java program to append the specified element to the end of a linked list.
        LinkedList<String> names = new LinkedList<>();
        names.add("Mark");
        names.add("John");
        names.add("Watson");
        names.add("Tim");
        names.add("Paul");
        System.out.println(names);

        names.addLast("Jerry");
        System.out.println(names);
        System.out.println("----------------");

        //2.Write a Java program to iterate through all elements in a linked list.
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("----------------------");

        //3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
        Iterator iterator = names.listIterator(2);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("---------------------------");

        //4. Write a Java program to iterate a linked list in reverse order
        for (int i = names.size() - 1; i > 0; i--) {
            System.out.println(names.get(i));
        }
        System.out.println("-----------------------------------");

        //5. Write a Java program to insert the specified element at the specified position in the linked list.
        names.add(3, "Ben");
        System.out.println(names);
    }


}

