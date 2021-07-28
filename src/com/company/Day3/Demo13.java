package com.company.Day3;

public class Demo13 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); //prints 16
        sb.append("Hello");
        System.out.println(sb.capacity()); //prints 16 because maximum capacity did not increase
        sb.append("Welcome to our java training, have a wonderful day");
        System.out.println(sb.capacity()); //prints 55 because the maximum capacity needed to increase
    }
}
