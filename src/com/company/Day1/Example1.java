package com.company.Day1;

public class Example1 {

    static int z = 100; //static variable
    int x = 10; //instance variable

    public void addNumber() {
        //static int d = 10; can't make a local variable static
        int a = 10;
        int b = 20;
        System.out.println(a + b);
    }

    public void subNumber() {
        int y = 5;
        System.out.println(x - y);
    }

    public static void main(String[] args) {

    }
}
