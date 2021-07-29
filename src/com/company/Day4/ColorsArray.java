package com.company.Day4;

import java.util.ArrayList;
import java.util.Collections;

public class ColorsArray {
    public static void main(String[] args) {
        //1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Orange");

        System.out.println(colors);


        //2. Write a Java program to iterate through all elements in a array list.

        for(String color: colors){
            System.out.println(color);
        }
        //3. Write a Java program to insert an element into the array list at the first position.
        colors.add(0, "Black");
        System.out.println(colors);

        //4. Write a Java program to retrieve an element (at a specified index) from a given array list.
        System.out.println(colors.get(3));

        //5. Write a Java program to update specific array element by given element.
        colors.set(5,"Purple");
        System.out.println(colors);

        //6. Write a Java program to remove the third element from a array list.
        colors.remove(2);
        System.out.println(colors);

        //7. Write a Java program to search an element in a array list.
        System.out.println("Contains Yellow?: " + colors.contains("Yellow"));
        System.out.println(colors.indexOf("Yellow"));
        //8. Write a Java program to sort a given array list.
        System.out.println("Before sort:");
        System.out.println(colors);

        Collections.sort(colors);
        System.out.println("After sort:");
        System.out.println(colors);

        //9. Write a Java program to copy one array list into another.
        ArrayList<String> newColors = new ArrayList<>();
        newColors = colors;

        System.out.println(newColors);

        //10. Write a Java program to shuffle elements in a array list.
        Collections.shuffle(colors);
        System.out.println(colors);

        //11. Write a Java program to reverse elements in a array list.
        Collections.reverse(colors);
        System.out.println(colors);

        //12. Write a Java program to extract a portion of a array list.
        System.out.println(colors.subList(2, 4));

        //13. Write a Java program of swap two elements in an array list.
        Collections.swap(colors, 0,4);
        System.out.println(colors);



    }
}
