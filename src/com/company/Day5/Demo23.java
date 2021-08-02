package com.company.Day5;

public class Demo23 {
    public static void main(String[] args) {
        //explicit conversion

        double a = 123.45;

        long b = (long) a; //converting a double into a long explicitly

        int c = (int) b; //converting a long into an int explicitly

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
