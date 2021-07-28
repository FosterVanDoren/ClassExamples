package com.company.Day3;

public class Demo3 {
    public static void main(String[] args) {
        String s1 = "Henry";
        String s2 = "Jeff";
        String s3 = new String("Jeff");
        String s4 = "Jeff";

        System.out.println(s2.equals(s1)); //false
        System.out.println(s2.equals(s3)); //true
        System.out.println(s2.equals(s4)); //true

        String s5 = "JEFF";
        System.out.println(s2.equals(s5)); //false
        System.out.println(s2.equalsIgnoreCase(s5)); //true
    }
}
