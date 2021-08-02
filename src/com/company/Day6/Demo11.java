package com.company.Day6;

interface MultipleStatements {
    String print(String message);
}


public class Demo11 {
    public static void main(String[] args) {
        MultipleStatements multipleStatements = (message) -> {
            String s1 = "First statement. ";
            String s2 = "Second statement. ";
            String s3 = "Third statement. ";
            return s1 + s2 + s3;
        };
        System.out.println(multipleStatements.print("Hello"));


    }
}
