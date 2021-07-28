package com.company.Day3;

public class Demo4 {
    public static void main(String[] args) {
        String s1 = "Jeff";
        String s2 = "Jeff";
        String s3 = new String("Jeff");

        System.out.println(s1 == s2); // true, both refer to the same instance
        System.out.println(s1 == s3); //false, because s3 refers to an instance created in the normal heap
    }
}
