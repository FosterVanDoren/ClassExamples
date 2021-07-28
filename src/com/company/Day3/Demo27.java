package com.company.Day3;

public class Demo27 {
    public static void main(String[] args) {
        try{
            print1();
        }catch (StackOverflowError ex){
            System.out.println("Stack overflow error");
        }
    }

    public static void print1(){
        print2();
    }

    private static void print2() {
        print1();
    }
}
