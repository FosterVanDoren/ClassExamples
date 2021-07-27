package com.company.Day1;

public class Example5 {
    public static void main(String[] args) {
        int score = 91;

        if(score > 90)
            System.out.println('A');
        else if(score < 90 && score > 75)
            System.out.println('B');
        else if(score < 75 && score > 50)
            System.out.println('C');
        else
            System.out.println('D');
    }
}
