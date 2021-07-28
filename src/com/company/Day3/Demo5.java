package com.company.Day3;

public class Demo5 {
    public static void main(String[] args) {
        String s1 = "Jeff";
        String s2 = "Jeff";
        String s3 = "Bill";

        System.out.println(s1.compareTo(s2)); //0
        System.out.println(s1.compareTo(s3)); //positive
        System.out.println(s3.compareTo(s1)); //negative
    }
}
