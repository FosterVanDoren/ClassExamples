package com.company.Day3;

public class Demo8 {
    public static void main(String[] args) {
        String message = "Welcome to java training";
        System.out.println(message.substring(0, 7)); //prints Welcome

        System.out.println("original message: " + message);
        System.out.println("Substring starting from index 7: " + message.substring(7)); //prints to java training
        System.out.println("Substring starting from index 0 to 7: " + message.substring(0, 7)); //prints Welcome

        String str = new String("Welcome Home");
        System.out.println(str);
        System.out.println(str.substring(8)); //prints Home
    }
}
