package com.company.Day3;

public class Demo2 {
    public static void main(String[] args) {
        String str = "Hello";
        str.concat("World"); //we are using the concat() method to append to the end of str
        System.out.println(str); //will print Hello because strings are immutable objects

        String str1 = "Hello";
        str1 = str1.concat("World");
        System.out.println(str1);
    }
}
